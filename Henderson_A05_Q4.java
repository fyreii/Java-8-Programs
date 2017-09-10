// Created by:  Teresa Henderson
// Date: 07/29/2016
// Class:  CST 200: Core Data Structures with OOP, Bansal
// File:  Henderson_A05_Q4.java
// Purpose: Add to Q3 solution with a method pushLast

public class Henderson_A05_Q4 {
    /**
     * Program entry point for stack testing.
     *
     * @param args Argument list.
     */
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();

        System.out.println("STACK TESTING");

        System.out.println("The stack contains:\n" + stack.toString());

        stack.push(3);
        stack.push(7);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();
        stack.push(9);
        // demonstration of pushLast method
        stack.pushLast(8);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The stack contains:\n" + stack.toString());
    }

    /**
     * Represents a linked implementation of a stack.
     *
     * @author Java Foundations
     * @version 4.0
     */
    public static class LinkedStack<T> implements StackADT<T> {
        private int count;
        private LinearNode<T> top;

        /**
         * Creates an empty stack.
         */
        public LinkedStack() {
            count = 0;
            top = null;
        }

        /**
         * Adds the specified element to the top of this stack.
         *
         * @param element element to be pushed on stack
         */
        public void push(T element) {
            LinearNode<T> temp = new LinearNode<T>(element);

            temp.setNext(top);
            top = temp;
            count++;
        }

        /**
         * Removes the element at the top of this stack and returns a
         * reference to it.
         *
         * @return element from top of stack
         * @throws EmptyCollectionException if the stack is empty
         */
        public T pop() throws EmptyCollectionException {
            if (isEmpty())
                throw new EmptyCollectionException("stack");

            T result = top.getElement();
            top = top.getNext();
            count--;

            return result;
        }

        //TODO: Finish this method for assignment - rest of code is from Q3
        /** pushLast is not implemented as part of StackADT and may result in undesirable behavior **/
        public void pushLast(T element) {
            LinearNode<T> temp = new LinearNode<T>(element);
            if (isEmpty()) {
                top = temp;
            } else {
                LinearNode<T> current = top;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(temp);
            }
        }

        /**
         * Returns a reference to the element at the top of this stack.
         * The element is not removed from the stack.
         *
         * @return element on top of stack
         * @throws EmptyCollectionException if the stack is empty
         */
        // TH peek() return the current value top element
        public T peek() throws EmptyCollectionException {
            if (isEmpty())
                throw new EmptyCollectionException("stack");

            return top.getElement();
        }

        /**
         * Returns true if this stack is empty and false otherwise.
         *
         * @return true if stack is empty
         */
        // TH isEmpty() is true if count is 0
        public boolean isEmpty() {
            return count == 0;
        }

        /**
         * Returns the number of elements in this stack.
         *
         * @return number of elements in the stack
         */
        // TH the count is being used for items in the stack
        public int size() {
            return count;
        }

        /**
         * Returns a string representation of this stack. The string has the
         * form of each element printed on its own line, with the top most
         * element displayed first, and the bottom most element displayed last.
         * If the list is empty, returns the word "empty".
         *
         * @return a string representation of the stack
         */
        // TH while top is not null pass the element into a string, then
        // get the next value until current is null
        public String toString() {
            if (isEmpty()) return "empty";
            String result = "";
            LinearNode current = top;

            while (current != null) {
                result = result + (current.getElement()).toString() + "\n";
                current = current.getNext();
            }

            return result;
        }
    }
}

/* OUTPUT

STACK TESTING
The stack contains:
empty
4
9
9
7
The size of the stack is: 2
The stack contains:
7
3
8

 */