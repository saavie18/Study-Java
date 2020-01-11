package com.jetbrains.Task1;

import java.util.Set;
import java.util.TreeSet;

public class CompareUsingStringBuilder  {
    public static void main(String[] args) {
        Set<StringBuilder> sb = new TreeSet<StringBuilder>(new StringBuilderCustomComparator());
        sb.add(new StringBuilder("Apple"));
        sb.add(new StringBuilder("Watermelon"));
        sb.add(new StringBuilder("Mango"));
        sb.add(new StringBuilder("Banana"));
        System.out.println(sb);
    }
}
