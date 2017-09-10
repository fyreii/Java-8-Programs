// Created by:  Teresa Henderson
// Date: 07/28/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A05_Q2.java
// Purpose: Implement drop-out stack using ArrayStack and StackADT

public class Henderson_A05_Q2 {
    /*
     * Program entry point for drop-out stack testing.
     * @param args Argument list. */

    public static void main(String[] args) {
        ArrayDropOutStack<Integer> stack = new ArrayDropOutStack<Integer>(4);

        System.out.println("DROP-OUT STACK TESTING");

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("The size of the stack is: " + stack.size());
        if (!stack.isEmpty())
            System.out.println("The stack contains:\n" + stack.toString());

        stack.pop();
        stack.push(7);
        stack.push(8);

        System.out.println("The size of the stack is: " + stack.size());
        if (!stack.isEmpty())
            System.out.println("The stack contains:\n" + stack.toString());
    }

    public static class ArrayDropOutStack<T> implements StackADT<T> {

        private int top;
        private T[] stack;

        @SuppressWarnings("unchecked")
        public ArrayDropOutStack(int initialCapacity) {
            top = 0;
            stack = (T[]) (new Object[initialCapacity]);
        }
        // TH sets top to the next value as long as it isn't null
        // 0 becomes 1, 1 becomes 2, etc.
        public void push(T element) {
         if(top == (stack.length - 1) && stack[top] != null) {
                for(int x = 0; x < (stack.length -1); x++) {
                    stack[x] = stack[x+1];
                }
            }

            stack[top] = element;
            if (top < (stack.length - 1)) {
                top++;
            }
        }
        // TH sets the value of top to null and returns it
        public T pop() throws EmptyCollectionException {
            if (isEmpty())
                throw new EmptyCollectionException("stack");
            T result = stack[top];
            stack[top] = null;
            return result;
        }

        public T peek() throws EmptyCollectionException {
            if (isEmpty())
                throw new EmptyCollectionException("stack");
            return stack[(top + stack.length - 1) % stack.length];
        }
        // TH isEmpty is true if top is 0
        public boolean isEmpty() {
            return top == 0;
        }

        // TH size() the current size is the value of top since it is
        // incremented on each push
        public int size() {
            // the number of items in the stack
            return top + 1;
        }
        // TH generates a buffer to pass strings into
        // for each item in the stack up to the size (top)
        // print the item, a space and a newline
        public String toString() {
            if (isEmpty()) return "empty";
            // build a new String buffer to feed values into
            // prints values in reverse
            StringBuffer output = new StringBuffer();
            for (int i = stack.length - 1; i >= 0; i--)
                // print the item and a space
                output.append(stack[i] + " " + "\n");
            return output.toString();
        }
    }
}

/* OUTPUT

DROP-OUT STACK TESTING
The size of the stack is: 4
The stack contains:
5
4
3
2

The size of the stack is: 4
The stack contains:
8
7
4
3

 */

