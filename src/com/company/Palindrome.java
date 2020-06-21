package com.company;

public class Palindrome {

    public static void main(String[] args) {

        //System.out.println(isPolindromeString("KAYAK"));
        // System.out.println(isPolindromeStringBuilder("KAYAK"));
        //reverseStringBuilder("KOROVA");
        //reverseString("DOHOD");
        reverseString2("KOROVA");

    }
    public static boolean isPolindromeString(String str) {
        if (str == null)
            return false;
        int lenght = str.length();
        System.out.println(lenght / 2);
        for (int i = 0; i < lenght / 2; i++) {
            // System.out.println(str.charAt(i));

            if (str.charAt(i) != str.charAt(lenght - i - 1))
                return false;
            System.out.println(str.charAt(i));
            // System.out.println(str.charAt(lenght -i -1));
        }
        return true;
    }
    public static boolean isPolindromeStringBuilder(String str1) {
        if (str1 == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str1);
        strBuilder.reverse();
        return strBuilder.toString().equals(str1);

    }

    public static void reverseStringBuilder(String str) {

        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        System.out.println(strBuilder.toString());

    }

    public static void reverseString(String str) {
        //convert String to character array, using toCharArray()
        //String input = "DURDOM";
        char[] rev = str.toCharArray();
        for (int i = rev.length - 1; i >= 0; i--)
            System.out.println(rev[i]);

    }

    public static void reverseString2(String str) {
        String result = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
             result = result + str.charAt(i);
            System.out.println(str.charAt(i)); // print in multiple lines
        }
          System.out.println(result); //print in 1 line
    }
}







