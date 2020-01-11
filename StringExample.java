package com.jetbrains.Task1;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "BenchResources.net";
        String s2 = "benchresources.net";
        StringBuffer sb = new StringBuffer("BenchResources.net");
        //using charAt method to return the character at position 5
        System.out.println(s1.charAt(5));
        //using compareTo method to compare string s1 with string s2
        System.out.println(s1.compareTo(s2));
        //using compareToIgnoreCase method method to compare string s1 with string s2
        System.out.println(s1.compareToIgnoreCase(s2));
        //using concat method to add s3 at the end of s2;
        System.out.println(s1.concat(" is a very good website for Learning Java")); // new string is created in this case
        //using contains method to check if s1 contains the word 'net'
        System.out.println(s1.contains("net"));
        //using contentEquals method to check if s1 contains sb
        System.out.println(s1.contentEquals(sb));
        //using copyValueOf method to convert the contents of character Array to a String  equivalent
        char[] c1 = {'R', 'e', 's', 'o', 'u', 'r', 'c', 'e', 's'};
        String newstring = String.copyValueOf(c1);
        System.out.println(newstring);
        //using copyValueOf with offset --> start copying from that particular position
        // and count --> no of characters that have to be copied
        String newstring1 = String.copyValueOf(c1, 0, 8);
        System.out.println(newstring1);
        //using endsWith method to check if String s1 ends with specified string or not
        System.out.println(s1.endsWith("net"));
        //using String equals --> case sensitive to compare two strings
        String test1 = "bench";
        String test2 = new String("bench");
        System.out.println(test1.equals(test2));
        //using equalsIgnoreCase to compare two strings
        String test3 = new String("Bench");
        System.out.println(test1.equalsIgnoreCase(test3));
        //using format method to format a string
        String test4 = "bench resources";
        float f1 = 143.6547f;
        String format1 = String.format("%s", test4);
        String format2 = String.format("%f", f1);
        System.out.println(format1);
        System.out.println(format2);
        //using getBytes to convert string into byte array
        String test5 = "Resources";
        byte[] b1 = test5.getBytes();
        System.out.println(Arrays.toString(b1));
        //using getChars method to convert string into Character Array
        String test6 = "Hello World";
        char[] c2 = new char[5];
        //srcBegin --> position to start copying from
        //srcEnd --> total string to copy ie. value will be copied till srcEnd-1
        //c2 --> destination character array
        //destBegin --> start inserting content from that position
        test6.getChars(6, 11, c2, 0);
        System.out.println(c2);
        //using hashcode method to return hashcode of invoking string
        String test7 = "Welcome";
        System.out.println(test7.hashCode());
        /*using indexOf method to get the first index of the specified character
         *variants
         *public int indexOf(int ch);
         *public int indexOf(int ch, int fromIndex);
         *public int indexOf(String str);
         *public int indexOf(String str, int fromIndex);*/
        System.out.println(test7.indexOf('e'));
        //using intern method
        String str1 = "Bench";//string object is created in sting pool / constant area
        String str2 = new String("Bench");//string object is created in heap memory
        //suing equals method for String comparison (without interning the string
        System.out.println(str1.equals(s2));
        //interning the string
        String str3 = str2.intern();
        System.out.println(str1.equals(str3));
        //using isEmpty method to check if string is empty or not
        System.out.println(str1.isEmpty());
        //using join method to join string using specified delimiter
        String str4 = String.join("-", "BenchResources", "is", "a", "good", "Java", "learning", "website");
        System.out.println(str4);
        //using lastIndexOf method to return the last index of the specified character
        String str5 = "Welcome";
        System.out.println(str5.lastIndexOf('e'));
        //using length method to find the length of the string
        System.out.println(str5.length());
        //using matches method to check if string contains the specified regex
        String str6 = "This is Java world";
        System.out.println(str6.matches("(.*)Java(.*)"));
        //using regionMatches to check whether sub-string of invoking-string exactly matches sub-string of the specified string
        String str7 = "This is Java World";
        String str8 = "Java";
        /*toffset -–> starting index-position for invoking string (or substring)
        other -–> another string (or substring) to which invoking string need to be compared
        offset -–> starting index-position for another string (or substring)
        len -–> number of characters to be compared (from another string)   */
        System.out.println(str7.regionMatches(8, str8, 0, 4));
        //using replace method  to replace old character/substring with new character/substring
        String str9 = "Hello World";
        String str10 = str9.replace('l', 'v');
        System.out.println(str10);
        //other variants of this include replaceFirst which replaces only the first occurence
        //replaceAll which uses regex for replacement
        //using split method to split string using specified delimiter
        String string1 = "www.BenchResources.Net";
        String[] string2 = string1.split("\\.");
        for (String string3 : string2) {
            System.out.println(string3);
        }
        //split method with threshold limit
        String string4 = "02/01/2020";
        String[] string5 = string4.split("/", 2);
        for (String string6 : string5) {
            System.out.println(string6);
        }
        //using startsWith method to check whether invoking string starts with specified prefix or NOT
        String strg1 = "Hello World";
        System.out.println(strg1.startsWith("Hello"));
        //using startsWith with offset
        String strg2 = "Java is a super cool language";
        System.out.println(strg2.startsWith("super", 10));
        //using substring  to return  substring for the specified begin value and end
        //using beginIndex
        System.out.println(strg2.substring(10));
        //using beginIndex and endIndex for getting string
        System.out.println(strg2.substring(10, 20));
        //using beginIndex and endIndex for getting character sequence
        CharSequence charSequence = strg2.subSequence(10, 20);
        System.out.println(charSequence);
        //using toCharArray to convert string to character Array
        String strg3 = "JavaWorld";
        char[] character1 = strg3.toCharArray();
        for (Character character2 : character1) {
            System.out.println(character2);
        }
        //using toLowerCase to convert all the characters in string to lower case
        System.out.println(strg3.toLowerCase());
        //using toUpperCase to convert all the characters in string to upper case
        String strg5 = "java world";
        System.out.println(strg5.toUpperCase());
        //toString method is used to convert any object to string format
        //using trim method to remove trailing as well as leading white spaces from the invoking-string
        String strg6 = " Welcome to Java Tutorials ";
        System.out.println(strg6.trim());
        //using valueOf to convert primitive data-types & objects into its equivalent string representation
        boolean bTest = true;
        String example = String.valueOf(bTest);
        System.out.println(example);


    }
}
//Temporary File
