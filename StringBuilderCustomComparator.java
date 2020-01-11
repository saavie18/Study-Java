package com.jetbrains.Task1;

import java.util.Comparator;

public class StringBuilderCustomComparator implements Comparator<StringBuilder> {
    @Override
    public int compare(StringBuilder o1, StringBuilder o2) {
        return o2.toString().compareTo(o1.toString());
    }
}
