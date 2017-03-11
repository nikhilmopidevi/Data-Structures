package com.datastructures;

/**
 * Author: Nikhil Kumar Mopidevi
 * Date: February 28th, 2017
 */
@SuppressWarnings("unchecked")
public class ArrayList<E>{

    private E arrayList[];
    private int capacity;
    private int size;
    private int currentIndex;

    //default constructor
    public ArrayList() {
        capacity = 16;
        arrayList = (E[]) new Object[capacity];
        currentIndex = -1;
    }

    //constructor with parameter
    public ArrayList(int capacity) {
        this.capacity = capacity;
        arrayList = (E[]) new Object[capacity];
        currentIndex = -1;
    }

    //return the number of elements the arraylist can now hold
    public int capacity() {

        return capacity;
    }

    //return the current number of elements in the arraylist
    public int size() {
        return size;
    }

    //doubles the capacity of the array
    public void doubleSize() {
        int newCapacity = capacity * 2;
        E newArrayList[] = (E[]) new Object[newCapacity];

        for(int i=0;i<capacity;i++ ) {
            newArrayList[i] = arrayList[i];
        }

        arrayList = newArrayList;
        capacity = newCapacity;
    }

    //shrink capacity of the array to half
    public void shrinkSize() {
        int newCapacity = capacity / 2;
        E newArrayList[] = (E[]) new Object[newCapacity];

        for(int i=0;i<size;i++) {
            newArrayList[i] = arrayList[i];
        }

        arrayList = newArrayList;
        capacity = newCapacity;
    }

    //checks if the arraylist is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    //returns the element at given index
    public E get(int index) {
        if(index < 0 || index > size)
            return null;

        return arrayList[index];
    }

    //returns the first index of with that value, -1 if not found
    public int find(E element) {

        for(int i=0;i<size;i++) {
            if(element.equals(arrayList[i]))
                return i;
        }
        return -1;
    }


    //adds element at the end of the arraylist
    public void add(E element) {
        currentIndex++;

        if(currentIndex >= capacity)
            doubleSize();

        arrayList[currentIndex] = element;
        size++;
    }

    //adds element at the specified index of the arraylist
    public void add(int index, E element) {
        currentIndex++;

        if(currentIndex >= capacity)
            doubleSize();

        for(int i=index+1;i<size+1;i++) {
            arrayList[i] = arrayList[i-1];
        }

        arrayList[index] = element;
        size++;
    }

    //adds element at the end of the arrayList
    public void push(E element) {
        currentIndex++;

        if(currentIndex >= capacity)
            doubleSize();

        arrayList[currentIndex] = element;
        size++;
    }

    //removes all the indices with that value
    public void remove(E element) {

        for(int i=0;i<size;i++) {
            if(arrayList[i].equals(element)) {
                for(int j=i;j<size-1;j++) {
                    arrayList[j] = arrayList[j+1];
                }
            }
        }

        currentIndex--;
        size--;

        if(size < capacity/4)
            shrinkSize();
    }

    //removes element at that index
    public void remove(int index) {

        for(int i=index;i<size-1;i++) {
            arrayList[i] = arrayList[i+1];
        }

        currentIndex--;
        size--;

        if(size < capacity/4)
            shrinkSize();
    }

    //removes element at the end of the arrayList
    public void pop() {
        
        currentIndex--;
        size--;

        if(size < capacity/4)
            shrinkSize();
    }
}

