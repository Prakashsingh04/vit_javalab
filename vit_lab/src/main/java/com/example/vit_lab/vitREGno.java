package com.example.demo;
import java.util.*;

public class vitREGno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the student's register number:");
        String regno= sc.nextLine();

        boolean isValid = true;

        if (regno.length() != 9) {
            isValid = false;
        }
        else {

            for (int i = 0; i < 2; i++) {
                if (!Character.isDigit(regno.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            for (int i = 2; i < 5; i++) {
                if (!Character.isUpperCase(regno.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            for (int i = 5; i < 9; i++) {
                if (!Character.isDigit(regno.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid) {
            System.out.println("The register number is valid.");
        }
        else {
            System.out.println("The register number is invalid.");
        }
    }
}