package com.example.demo;
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reverseSTR="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverseSTR=reverseSTR+ str.charAt(i);
        }
        System.out.println("your original str: "+ str);
        System.out.println("your reversed str: "+reverseSTR);

    }

}
