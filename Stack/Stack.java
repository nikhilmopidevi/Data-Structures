package com.datastructures.Stack;

/**
 * Author: Nikhil Kumar Mopidevi
 * Date: 4/3/17
 */
public class Stack<E> {
    private E array[];
    private int capacity;
    private int currentIndex;

    //default constructor
    public Stack() {
        capacity = 16;
        currentIndex = -1;
        array = (E[])new Object[16];
    }

    //pushes an element into the stack
    public boolean push(E element) {
        if(!isFull()) {
            currentIndex++;
            array[currentIndex] = element;
        }
        else return false;
        return true;
    }

    //pops an element from the top of the stack
    public E pop() {
        if(!isEmpty()) {
            E element = array[currentIndex];
            currentIndex--;
            return element;
        }
        else return null;
    }

    //returns the element from the top of the stack, without removing it
    public E peek() {
        if(!isEmpty()) {
            return array[currentIndex];
        }
        else return null;
    }

    //checks if stack is empty
    public boolean isEmpty() {
        if(currentIndex == -1)
            return true;
        else return false;
    }

    //checks if stack is full
    public boolean isFull() {
        if(currentIndex == capacity-1)
            return true;
        else return false;
    }
}

