package com.example.demo;
import java.util.*;
public class family {
public static void main(String args[]){
    int smallest=0;
    int largest=0;
    int num;
    System.out.println("Enter the number of members in family");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
 //   System.out.println("total members is "+num);
    for(int i=0;i <n;i++){
        System.out.println("Enetr the member age:");
        num=sc.nextInt();
        if(num>largest){
            largest=num;
        }
        if(num<smallest){
            smallest=num;
        }
    }//forloop
    System.out.println("eldest:"+largest);
    System.out.println("youngest:"+smallest);
}
}
