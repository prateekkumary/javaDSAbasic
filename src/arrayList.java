import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        int element=list.get(0);
        System.out.println(element);
        // to add element in between
        list.add(1,1);
        System.out.println(list);
        //set element
        list.set(0,5);
        System.out.println(list);
        //delete element
        list.remove(3);
        System.out.println(list);
        //size of list
        int size=list.size();
        System.out.println(size);
        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //sort
        Collections.sort(list);
        System.out.println(list);
        }
}
