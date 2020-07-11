package com.datastructures.LinkedList;

/**
 * Author: Nikhil Kumar Mopidevi
 * Date: 3/17/17
 */
public class LinkedListDemo {
    public static void main(String[] args) {

        int nums[] = {1,10,9,3,4,2,8,5};

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        
        //adding all elements of nums[] to the linkedList
        for(int i=0;i<nums.length;i++) {
            linkedList.add(nums[i]);
        }

        System.out.println("Initial size of the linkedList: " + linkedList.size()); //prints the current size of the linkedList

        //prints out each element of the linkedList
        System.out.print("\nAll elements: ");
        for(int i=0;i<linkedList.size();i++) {
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();

        System.out.println("\nFirst element of the linkedList: " + linkedList.getFirst()); //prints the first element of the list
        System.out.println("\nLast element of the linkedList: " + linkedList.getLast()); //prints the last element of the list

        System.out.println("\nElement at index 4: " + linkedList.get(4)); //prints the element at index 4

        System.out.println("\nAdding element 6 to the linkedList");
        linkedList.add(6); //adds the element 6 at the end of the linkedList

        System.out.println("\nAdding element 11 to front of the linkedList");
        linkedList.addFirst(11); //adds the element 11 to the front of the linkedList

        System.out.println("\nCurrent size of the arrayList: " + linkedList.size());//prints the current size of the linkedList

        //prints out each element of the linkedList
        System.out.print("\nAll elements: ");
        for(int i=0;i<linkedList.size();i++) {
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();

        System.out.println("\nRemoving the last element of the linkedList");
        linkedList.removeLast(); //removes the last element of the linkedList

        System.out.println("\nAdding element 9 at index 7 to the linkedList");
        linkedList.add(7,9); //adds the element 9 at index 7 of the linkedList

        System.out.println("\nCurrent size of the linkedList: " + linkedList.size());//prints the current size of the linkedList

        //prints out each element of the linkedList
        System.out.print("\nAll elements: ");
        for(int i=0;i<linkedList.size();i++) {
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();

        System.out.println("\nRemoving the first element of the linkedList");
        linkedList.removeFirst(); //removes the first element of the linkedList

        System.out.println("\nRemoving first 4 elements from the linkedList");
        for(int i=0;i<4;i++)
            linkedList.remove(0);

        System.out.println("\nCurrent size of the linkedList: " + linkedList.size());//prints the current size of the linkedList

        //prints out each element of the linkedList
        System.out.print("\nAll elements: ");
        for(int i=0;i<linkedList.size();i++) {
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();

        System.out.println("\nElement at 2nd position from the end of the linkedList: " + linkedList.valueNFromEnd(2)); //prints the element at 2nd position from the end of the linkedList

        System.out.println("\nReversing the linkedList");
        linkedList.reverse(); //reverses the linkedList

        //prints out each element of the linkedList
        System.out.print("\nAll elements: ");
        for(int i=0;i<linkedList.size();i++) {
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();

    }
}
