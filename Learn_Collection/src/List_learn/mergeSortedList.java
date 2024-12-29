package List_learn;

import java.util.LinkedList;

public class mergeSortedList {

    public static void main(String[] args) {
        LinkedList<Integer> nums1= new LinkedList<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        nums1.add(40);
        nums1.add(50);



        LinkedList <Integer> nums2= new LinkedList<>();
        nums2.add(100);
        nums2.add(200);
        nums2.add(300);
        nums2.add(400);
        nums2.add(500);

        System.out.println("original list: "+nums1);
        System.out.println("original list: "+nums2);




        LinkedList<Integer> ml=mergeLists(nums1,nums2);
        System.out.println("merged list is:"+ ml);
    }

    public static LinkedList<Integer> mergeLists(LinkedList<Integer> nums1, LinkedList<Integer> nums2) {

        LinkedList<Integer> merged=new LinkedList<>();
        int i=0,j=0;
        while(i<nums1.size() && j<nums2.size()) {
            if (nums1.get(i) < nums2.get(j)) {
                merged.add(nums1.get(i++));
            } else {
                merged.add(nums2.get(j++));
            }
            //adding remaining elements
            while (i < nums1.size()) {
                merged.add(nums1.get(i++));
            }
            while (j < nums2.size()) {
                merged.add(nums2.get(j++));
            }
        }
    return merged;
    }
}
