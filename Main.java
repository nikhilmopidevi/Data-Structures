package com.datastructures;

/**
 * Author: Nikhil Kumar Mopidevi
 * Date: February 28th, 2017
 */

@SuppressWarnings("unchecked")
public class Main {

    public static void main(String[] args) {

        testArrayList();

    }

    //testing arrayList implementation
    private static void testArrayList() {

        int nums[] = {1,10,9,3,4,2,8,5};

        ArrayList arrayList = new ArrayList(nums.length);

        //adding all elements of nums[] to the arrayList
        for(int i=0;i<nums.length;i++) {
            arrayList.add(nums[i]);
        }

        System.out.println("Initial size of the arrayList: " + arrayList.size()); //prints the current size of the arrayList
        System.out.println("Initial capacity of the arrayList: " + arrayList.capacity());//prints the current capacity of the arrayList

        //prints out each element of the arrayList
        System.out.print("\nAll elements: ");
        for(int i=0;i<arrayList.size();i++) {
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();

        System.out.println("\nIndex of element 2: " + arrayList.find(2)); //prints the index of the element 2

        System.out.println("\nElement at index 4: " + arrayList.get(4)); //prints the element at index 4

        System.out.println("\nAdding element 6 to the arrayList");
        arrayList.push(6); //adds the element 6 at the end of the arrayList

        System.out.println("\nAdding element 11 to the arrayList");
        arrayList.push(11); //adds the element 11 at the end of the arrayList

        System.out.println("\nRemoving the last element of the arrayList");
        arrayList.pop(); //removes the last element of the arrayList

        System.out.println("\nAdding element 2 at index 7 to the arrayList");
        arrayList.add(7,2); //adds the element 2 at index 7 of the arrayList


        System.out.println("\nCurrent size of the arrayList: " + arrayList.size());//prints the current size of the arrayList
        System.out.println("Current capacity of the arrayList: " + arrayList.capacity());//prints the current capacity of the arrayList


        System.out.println("\nAdding 8 more elements to the arrayList");
        for(int i=0;i<8;i++)
            arrayList.add(i);

        System.out.println("Current size of the arrayList: " + arrayList.size());//prints the current size of the arrayList
        System.out.println("Current capacity of the arrayList: " + arrayList.capacity());//prints the current capacity of the arrayList


        System.out.println("\nRemoving first 4 elements from the arrayList");
        for(int i=0;i<4;i++)
            arrayList.remove(i);

        System.out.println("Current size of the arrayList: " + arrayList.size());//prints the current size of the arrayList
        System.out.println("Current capacity of the arrayList: " + arrayList.capacity());//prints the current capacity of the arrayList


        System.out.println("\nRemoving first 8 elements from the arrayList");
        for(int i=0;i<8;i++)
            arrayList.remove(i);

        System.out.println("Current size of the arrayList: " + arrayList.size());//prints the current size of the arrayList
        System.out.println("Current capacity of the arrayList: " + arrayList.capacity());//prints the current capacity of the arrayList

    }
}
