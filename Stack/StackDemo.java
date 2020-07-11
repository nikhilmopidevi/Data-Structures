package com.datastructures.Stack;

/**
 * Author: Nikhil Kumar Mopidevi
 * Date: 4/3/17
 */
public class StackDemo {
    public static void main(String[] args) {

        int nums[] = {1,10,9,3,4,2,8,5};

        Stack stack = new Stack();

        //adding all elements of nums[] to the stack
        for(int i=0;i<nums.length;i++) {
            stack.push(nums[i]);
        }

        //prints the element at the top of the stack
        System.out.print("\nCurrent element at the top of the stack: ");
        System.out.println(stack.peek());

        System.out.println("\nAdding element 6 to the stack.");
        stack.push(6); //adds the element 6 to the stack

        //prints the element at the top of the stack
        System.out.print("\nCurrent element at the top of the stack: ");
        System.out.println(stack.peek());

        System.out.println("\nRemoving first two elements of the stack.");
        System.out.println("\nThe removed element is: " + stack.pop()); //removes the element at the top of the stack
        System.out.println("\nThe removed element is: " + stack.pop()); //removes the element at the top of the stack

        //prints the element at the top of the stack
        System.out.print("\nCurrent element at the top of the stack: ");
        System.out.println(stack.peek());
    }
}
