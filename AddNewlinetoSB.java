package com.jetbrains.Task1;



public class AddNewlinetoSB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Coding Languages are as follows :");
        sb.append(System.lineSeparator());
        sb.append("Java");
        sb.append(System.lineSeparator());
        sb.append("C");
        sb.append(System.lineSeparator());
        sb.append("Python");
        System.out.println(sb.toString());

    }
}
