package com.jetbrains.Task1;

public class StringBufferExample {
    public static void main(String[] args) {
        String test = "Bench Resources";
        StringBuffer sb = new StringBuffer();
        //using append method to add string object to String Buffer Object
        sb.append(test);
        System.out.println(test);
        /*append method can be used to append integer , float , long , double , boolean , character data type to String buffer object
         **It is also used to append character array , character sequence , string object and another string buffer object
         *into a String Buffer Object
         */
        //using capacity method to return the capacity of String Buffer Object
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); //default capacity of 16 is returned
        StringBuffer sb2 = new StringBuffer("BenchResources");
        System.out.println(sb2.capacity());//capacity 0f 30 is returned i.e 16+13(for Bench Resources)
        //using charAt method to return the character at specified position
        System.out.println(sb2.charAt(5));
        //using delete method to delete the substring from String Buffer object using specified range
        /*parameters of method include start index which is inclusive and end index which is exclusive*/
        StringBuffer sb3 = new StringBuffer("BenchResources.net");
        System.out.println(sb3.delete(5, 14));
        //using deleteCharAt to delete the character at specified position
        StringBuffer sb4 = new StringBuffer("BenchResources.net");
        System.out.println(sb4.deleteCharAt(14));
        //using ensureCapacity method to ensure capacity is equal to specified minimum capacity
        StringBuffer sb5 = new StringBuffer();
        System.out.println("Current Capacity is " + sb5.capacity());
        sb5.ensureCapacity(20);
        //if current capacity is less than specified minimum capacity then new capacity = current capacity*2 + 2
        System.out.println("After Ensuring Capacity " + sb5.capacity());
        //using indexOf to get the first index of occurence of the specified substring
        //this method also has another parameter which is "from index"
        StringBuffer sb6 = new StringBuffer("Java is a super cool language");
        System.out.println(sb6.indexOf("super"));
        //using insert method to insert specified argument at the specified offset
        //can be used for inserting int,long,float,double,boolean,char,charArray,char sequence and string object to a String Buffer Object
        String str = "Bench";
        StringBuffer sb7 = new StringBuffer("Resources.net");
        System.out.println(sb7.insert(0, str));
        //using lastIndexOf which returns last occurrence of specified sub-string
        StringBuffer sb8 = new StringBuffer(
                "East is East and West is West");
        System.out.println(sb8.lastIndexOf("West"));
        //using length method to get the length/character count of string buffer object
        StringBuffer sb9 = new StringBuffer("Hello World");
        System.out.println(sb9.length());
        /*using replace method to replace the
         portion of string or substring, as indicated by the start-index & end-index with specified string
         Start-index is inclusive whereas end-index is exclusive
         */
        StringBuffer sb10 = new StringBuffer("Java is a super cool language");
        System.out.println(sb10.replace(16, 20, "easy"));
        //using reverse method to  reverse the sequence of character of the invoking StringBuffer object
        StringBuffer sb11 = new StringBuffer("Bench Resources");
        System.out.println(sb11.reverse());
        //using substring to get substring (partial string or portion of string from StringBuffer as per specified range)
        /*public String substring(int start);
          public String substring(int start, int end);
          public CharSequence subSequence(int start, int end);*/
        StringBuffer sb12 = new StringBuffer("BenchResources.Net");
        StringBuffer sb13 = new StringBuffer(sb12.substring(15));
        System.out.println(sb13);
        System.out.println(sb12.substring(15, 18));
    }
}
