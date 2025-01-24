package oop2.Task8;

public class Solution {
    public static void main(String[] args) {
        String s1 = new String("JavaENU");
        s1 = "JavaENU";
        String s2 = "JavaENU";
        String s3 = "JavaENU";
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}