package com.datastructures.Queue;

/**
 * Author: Nikhil Kumar Mopidevi
 * Date: 4/3/17
 */
public class Queue<E> {
    private static class QueueNode<E> {
        private E data;
        private QueueNode<E> next;

        public QueueNode(E data) {
            this.data = data;
        }
    }

    private QueueNode<E> first;
    private QueueNode<E> last;

    //enqueue
    public void add(E data) {
        QueueNode t = new QueueNode(data);

        if(last != null) {
            last.next = t;
        }
        last = t;
        if(first == null) {
            first = last;
        }
    }

    //dequeue
    public E remove() {
        if(first == null) {
            //empty queue
            return null;
        }

        E data = first.data;
        first = first.next;

        if(first == null) {
            last = null;
        }
        return data;
    }

    //peek
    public E peek() {
        if(first == null) {
            //empty queue
            return null;
        }
        return first.data;
    }

    //checks if the queue is empty
    public boolean isEmpty() {
        return (first == null);
    }
}
