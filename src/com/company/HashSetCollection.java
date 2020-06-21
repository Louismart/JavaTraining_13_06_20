package com.company;

import javax.swing.*;
import javax.swing.text.View;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

    public static void main(String[] args) {
        onClick();
    }

    public static void onClick () {
        HashSet<String> countryHashSet = new HashSet<>();
        countryHashSet.add("Russia");
        countryHashSet.add("Ukraine");
        countryHashSet.add("Bialorus");
        countryHashSet.add("Poland");
        countryHashSet.add("Ukraine");

        //Displaying te HashSet
        System.out.println(countryHashSet);
        System.out.println("List contains Ukraine or not: " + countryHashSet.contains("Ukraine"));

        //Removing items from HashSet using remove()
        countryHashSet.remove("Russia");
        System.out.println("List after removing Russia: + " + countryHashSet);

        //Get HashSet size
        System.out.println("Size HashSet = " + countryHashSet.size());

        //Iterating over hash set items
        System.out.println("Iterating over list:");

        //Iterating over hash set items
        System.out.println("Iterating over list: ");
        Iterator<String> i = countryHashSet.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
