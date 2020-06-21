package com.company;

public class StringEqualCompareTo {
    public static void main(String[] args) {

        String str1 = "Kanaval";
        String str2 = "KANAVAS";


        System.out.println((str1.equals(str2)));  //check if the 2 Strings are equal
        System.out.println(str1.compareTo(str2)); //compare String with anotherString lexicographically
    }

}