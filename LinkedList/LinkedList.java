package com.datastructures.LinkedList;

import java.util.Stack;

/**
 * Author: Nikhil Kumar Mopidevi
 * Date: 3/17/17
 */
public class LinkedList<E> {
    private Node<E> head;
    private int size;

    //default constructor
    public LinkedList() {
        head = null;
        size = 0;
    }

    //constructor with parameter
    public LinkedList(E element) {
        head = new Node<E>();
        head.data = element;
        head.next = null;
        size = 1;
    }

    //return the current number of elements in the linkedlist
    public int size() {
        return size;
    }

    //checks if the linkedlist is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    //adds an element to the end of the linkedlist
    public boolean add(E element) {
        if(head == null) {
            head = new Node<E>();
            head.data = element;
            head.next = null;
        }
        else {
            Node<E> node = head;

            while(node.next != null) {
                node = node.next;
            }

            Node<E> newNode = new Node<E>();
            newNode.data = element;
            newNode.next = null;
            node.next = newNode;
        }

        size++;

        return true;
    }

    //adds element at the specified index of the linkedlist
    public boolean add(int index, E element) {
        if(index < 0) {
            return false;
        }
        else if(index == 0) {
            return addFirst(element);
        }

        Node<E> node = head;
        Node<E> prev = node;

        for(int i = 0; i < index; i++) {
            prev = node;
            node = node.next;
        }

        Node<E> temp = node.next;
        prev.next = new Node<E>();
        prev.next.data = element;
        prev.next.next = node;

        size++;

        return true;
    }

    //adds element at the beginning of the linkedlist
    public boolean addFirst(E element) {
        if(head == null) {
            head = new Node<E>();
            head.data = element;
            head.next = null;
        }
        else {
            Node<E> node = new Node<E>();
            node.data = element;
            node.next = head;
            head = node;
        }

        size++;

        return true;
    }

    //returns the element at the specified index
    public E get(int index) {
        if(index<0)
            return null;

        Node<E> node = head;

        for(int i=0; i < index; i++) {
            node = node.next;
        }

        return node.data;
    }

    //returns the first element of the linkedlist
    public E getFirst() {
        if(head == null) {
            return null;
        }

        return head.data;
    }

    //returns the lasr element of the linkedlist
    public E getLast() {
        if(head == null) {
            return null;
        }

        Node<E> node = head;

        while(node.next != null) {
            node = node.next;
        }

        return node.data;
    }

    //removes element at the specified index of the linkedlist
    public E remove(int index) {
        if(index < 0) {
            return null;
        }
        else if(index == 0) {
            return removeFirst();
        }

        Node<E> node = head;
        Node<E> prev = node;

        for(int i = 0; i < index; i++) {
            prev = node;
            node = node.next;
        }

        E value = node.data;
        prev.next = node.next;

        size--;

        return value;
    }

    //removes and returns the element at the head of the linkedlist
    public E removeFirst() {
        if(head == null) {
            return null;
        }

        E value = head.data;
        head = head.next;

        size--;

        return value;
    }

    //removes and returns the last element of the linkedlist
    public E removeLast() {
        if(head == null) {
            return null;
        }

        Node<E> node = head;
        Node<E> prev = null;

        while(node.next != null) {
            prev = node;
            node = node.next;
        }

        E value = node.data;

        //if linkedlist has only one element
        if(prev == null) {
            head = null;
        }
        else {
            prev.next = null;
        }

        size--;

        return value;
    }
/*
    //removes the first element in the list with given value
    public boolean remove(E value) {
        if(head == null) {
            return false;
        }

        Node<E> node = head;
        Node<E> prev = node;

        while(node.next != null) {
            if(node.data == value) {
                prev.next = node.next;
                break;
            }
            prev = node;
            node = node.next;
        }

        size--;

        return true;
    }
*/
    //returns the element at nth position from the end of the node
    public E valueNFromEnd(int n) {
        if(head == null || n <= 0 || n > size) {
            return null;
        }

        Node<E> node = head;

        for(int i=0; i < size-n; i++) {
            node = node.next;
        }

        return node.data;
    }

    //reverses the linkedlist
    public boolean reverse() {
        if (head == null) {
            return false;
        }

        Stack<Node> stack = new Stack<Node>();

        Node<E> node = head;

        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        Node<E> newHead = stack.pop();
        head = newHead;

        Node<E> newNode = newHead;

        while (!stack.isEmpty()) {
            newNode.next = stack.pop();
            newNode = newNode.next;
        }

        return true;
    }
}
