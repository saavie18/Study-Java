package com.jetbrains.Task1;

public class ConverttoUpperCase {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String str = "java is a super cool language";
        String[] strArray = str.split("\\s");
        for (int index = 0;index < strArray.length;index++)
        {
            String temp = strArray[index];
            String firstUpperCase = Character.toUpperCase(temp.charAt(0)) + temp.substring(1);
            sb.append(firstUpperCase);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
