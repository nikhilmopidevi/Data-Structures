package com.datastructures.Queue;

/**
 * Author: Nikhil Kumar Mopidevi
 * Date: 4/4/17
 */
public class QueueDemo {
    public static void main(String[] args) {

        int nums[] = {1,10,9,3,4,2,8,5};

        Queue queue = new Queue();

        //adding all elements of nums[] to the queue
        for(int i=0;i<nums.length;i++) {
            queue.add(nums[i]);
        }

        //prints the element at the front of the queue
        System.out.print("\nCurrent element at the front of the queue: ");
        System.out.println(queue.peek());

        System.out.println("\nAdding element 6 to back of the queue.");
        queue.add(6); //adds the element 6 to the back of the queue

        //prints the element at the front of the queue
        System.out.print("\nCurrent element at the front of the queue: ");
        System.out.println(queue.peek());

        System.out.println("\nRemoving first two elements from the front of the queue.");
        System.out.println("\nThe removed element is: " + queue.remove()); //removes the element from the front of the queue
        System.out.println("\nThe removed element is: " + queue.remove()); //removes the element from the front of the queue

        //prints the element at the front of the queue
        System.out.print("\nCurrent element at the top of the queue: ");
        System.out.println(queue.peek());
    }

}
