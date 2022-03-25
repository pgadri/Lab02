package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class ArrayListIterateProgram {

    // Using basic while / for loop
    void printArrayListBasicLoop(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    // Using enhanced for loop (:)
    void printArrayListEnhancedLoop(ArrayList <Integer> arrayList){
        for (Integer array : arrayList) {
            System.out.println(array);
        }
    }

    // Using basic for loop with iterator
    void printArrayListForLoopListIterator(ArrayList<Integer> arrayList) {
        for (Iterator<Integer> it = arrayList.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }
   // source: https://memorynotfound.com/iterate-arraylist-java/

    // Using basic while loop with iterator
    void printArrayListWhileLoopListIterator(ArrayList<Integer> arrayList) {
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 15, 30, 40));
        new ArrayListIterateProgram().printArrayListBasicLoop(list);
        System.out.println();

        new ArrayListIterateProgram().printArrayListEnhancedLoop(list);
        System.out.println();

        new ArrayListIterateProgram().printArrayListForLoopListIterator(list);
        System.out.println();

        new ArrayListIterateProgram().printArrayListWhileLoopListIterator(list);
        System.out.println();

    }
}
