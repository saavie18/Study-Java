package com.jetbrains.Task1;



public class DeleteStringBufferContents {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("String Buffer content before deleting : " + sb);
        sb.delete(0,sb.length());
        System.out.println("String Buffer content after clearing :" + sb);

    }
}
