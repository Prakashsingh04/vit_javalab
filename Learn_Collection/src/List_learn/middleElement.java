package List_learn;

import java.util.LinkedList;

public class middleElement {
    public static void main(String[] args) {
        LinkedList <Integer> nums= new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("original list: "+nums);
        //Using TWO poinetrs
        int slow=0,fast=0;
        while(fast<nums.size()-1){
            slow++;
            fast+=2;
        }
        System.out.println("middle is:"+ nums.get(slow));
    }
}
