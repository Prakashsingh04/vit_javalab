package com.example.demo;

import java.util.Scanner;

public class strOccur {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Enter the second substring :");
        Scanner scnew=new Scanner(System.in);
        String substr=scnew.nextLine();

        int count = 0;
        int fromindex = 0;

        while ((fromindex = str.indexOf(substr, fromindex)) != -1) {
            count++;
            fromindex =fromindex + substr.length();
        }
        System.out.println("The substring occurs " + count + " times in the main string.");
    }
}
