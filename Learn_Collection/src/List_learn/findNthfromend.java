package List_learn;

import java.util.LinkedList;

public class findNthfromend {

    public static void main(String[] args) {

        LinkedList<Integer> nums= new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println("original: "+ nums);
       //may be a user input
        int findthenth=findNth(nums,3);
        System.out.println("form end: "+findthenth);
    }
    private static Integer findNth(LinkedList<Integer> nums, int n) {
        if(n<0 || n>nums.size()){
            return null;
        }
        var first=nums.listIterator();
        var sec=nums.listIterator();

        for(int i=0;i<n;i++){
            first.next();
        }

        while(first.hasNext()){
            first.next();
            sec.next();
        }
        return sec.next();

    }

}
