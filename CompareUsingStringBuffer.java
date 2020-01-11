package com.jetbrains.Task1;

import java.util.Set;
import java.util.TreeSet;

public class CompareUsingStringBuffer  {
    public static void main(String[] args) {
        Set<StringBuffer> sb = new TreeSet<StringBuffer>(new StringBufferCustomComparator());
        sb.add(new StringBuffer("Banana"));
        sb.add(new StringBuffer("Apple"));
        sb.add(new StringBuffer("Mango"));
        sb.add(new StringBuffer("Watermelon"));
        System.out.println(sb);
    }
}
