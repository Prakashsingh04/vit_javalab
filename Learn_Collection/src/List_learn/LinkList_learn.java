package List_learn;

import java.util.Collections;
import java.util.LinkedList;

public class LinkList_learn {
    public static void main(String[] args) {
        LinkedList<String> city =new LinkedList<>();
        city.add("Nashik");
        city.add("Pune");
        city.add("mumbai");
        city.add("chennai");
        city.add("Noida");

        //access

        System.out.println("first city:"+ city.getFirst());
        System.out.println("Last city:"+city.getLast());

        System.out.println("all city:"+ city);
        LinkedList<Integer> nums=new LinkedList<>();
        nums.add(10);
        nums.add(40);
        nums.add(70);
        nums.add(300);
        nums.add(600);
        nums.add(900);

        System.out.println("origina;: "+nums);
        Collections.reverse(nums);
        System.out.println("reverse: "+nums);

    }

}
