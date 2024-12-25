package List_learn;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_learn2 {
    public static void main(String[] args) {
        LinkedList<Integer> nums=new LinkedList<>();
        nums.add(10);
        nums.add(41);
        nums.add(71);
        nums.add(300);
        nums.add(601);
        nums.add(901);

        System.out.println("original: "+nums);

        Iterator<Integer> i=nums.iterator();
        while(i.hasNext())
        {
            int x=i.next();
            if(x % 2== 0)
            {
                i.remove();
            }
        }
        System.out.println("After removing even: "+nums);

        System.out.println("after reversing:");
        Collections.reverse(nums);
        System.out.println(nums);
    }
}
