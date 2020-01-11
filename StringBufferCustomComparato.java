package com.jetbrains.Task1;

import java.util.Comparator;

public class StringBufferCustomComparator implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
