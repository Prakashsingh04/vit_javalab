package List_learn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_learn {
    public static void main(String[] args) {
        List<String> fruit=new ArrayList<>();

        //adding fruits name
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("cherry");

        //index based adding
        fruit.add(2,"papaya");
        fruit.add(1,"kiwi");

        System.out.println("this is original fruit list");
        System.out.println(fruit);

        //accessing
        System.out.println(fruit.get(1));

        //modifying apple to kashmiriApple
        System.out.println("\nafter modify");
        fruit.set(0,"kashmiriApple");
        System.out.println(fruit);

        //removing type 1= from index      type2= from name

        System.out.println("removing using index 1");
        fruit.remove(1);
        System.out.println(fruit);
        System.out.println("removing using name");
        fruit.remove("cherry");
        System.out.println(fruit);


        //more methods
        System.out.println("size is : "+fruit.size());
        System.out.println("index of banana: "+fruit.indexOf("banana"));
        System.out.println("contain cheery t/f:"+ fruit.contains("cherry"));



        ///im using iterrator

        fruit.add("orange");
        System.out.println("now list is :"+fruit);
        Iterator<String> i= fruit.iterator();
        System.out.println("if i found orange then remove it:");
        while (i.hasNext())
        {
            String fname=i.next();
            System.out.println(fname);
            if(fname.equals("orange"))
            {
                i.remove();
            }
        }
        System.out.println(fruit);
    }
}
