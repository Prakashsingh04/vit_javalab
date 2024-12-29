package List_learn;

import java.util.LinkedList;

public class removeDuplicate {

    public static void main(String[] args) {
        LinkedList<Integer> nums= new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("original: " + nums);

        //without hashset removing maulally similar to bubble sort
        for(int i=0;i<nums.size();i++){
            for (int j=i+1;j<nums.size();j++)
            {
                if(nums.get(i).equals(nums.get(j))){
                    nums.remove(j);
                    j--;
                }
            }
        }

        System.out.println("duplicate removed: "+ nums);
    }
    //using hash set will see later


}
