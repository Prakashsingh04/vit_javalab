package List_learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collection.*;

public class ArrayList_learn2 {
    public static void main(String[] args) {
        ArrayList <Integer> nums =new ArrayList<>();
        nums.add(60);
        nums.add(20);
        nums.add(300);
        nums.add(90);
        nums.add(10);
        nums.add(60);
        //print using for each loop//enahanced for loop

        for(int x: nums)
        {
            System.out.println(x);
        }

        //removing duplicates
        ArrayList<Integer> uniqueNum=new ArrayList<>();
        for (int y: nums)
        {
            if(!uniqueNum.contains(y))
            {
                uniqueNum.add(y);
            }
        }
        System.out.println("unique elements is : "+ uniqueNum);

        //sorting can be alphabetocally
        ArrayList<String> names =new ArrayList<>();
        names.add("ram");
        names.add("shyam");
        names.add("gopal");
        Collections.sort(names);
        Collections.sort(nums);
        Collections.sort(uniqueNum);

        //printing
        System.out.println("all the sorted are:");
        System.out.println(names);
        System.out.println(nums);
        System.out.println(uniqueNum);



    }//main
}
