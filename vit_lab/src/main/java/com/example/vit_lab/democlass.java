package com.example.demo;
import java.util.*;
class person{
    int id;
    String name;
    long mobilenum;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter the id: ");
        id=sc.nextInt();

        System.out.println("Enter the NAME: ");
        name=sc.next();

        System.out.println("Enter the MOBILE NO: ");
        mobilenum=sc.nextLong();

    }
    void print(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("mobileno"+mobilenum);
    }
}
class Student extends person{
    int marks1,marks2,marks3,result;
    Scanner sc=new Scanner(System.in);
    void input(){
        super.input();
        System.out.println("enter marks1=");
        marks1=sc.nextInt();
        System.out.println("enter the marks2:");
        marks2=sc.nextInt();
        System.out.println("enter the marks ");
        marks3=sc.nextInt();
    };
    void print(){
        super.print();
        System.out.println("your marks are:");
        System.out.println(marks1+"\t"+marks2+"\t"+marks3);
    }
    void result(){
        int res=marks1+marks2+marks3;
       int avg=res/3;
        System.out.println("hey"+name+" your avg is:"+avg);
        if(avg>=50){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
public class democlass {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.input();
        s1.print();
        s1.result();
    }
}
