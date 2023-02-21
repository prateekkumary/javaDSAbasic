import java.util.*;

import java.util.Map;

public class hashTable {
    void dic(){
        Hashtable<Integer,String>hmap=new Hashtable<Integer, String>();
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int a=sc.nextInt();
        String b=sc.next();
        hmap.put(a,b);
        System.out.println(hmap);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        hashTable obj=new hashTable();
        for(int i=0;i<n;i++){
            obj.dic();
        }


        //for(Map.Entry m:hmap.entrySet()){
           // System.out.println(m.getKey()+" "+m.getValue());

    }
}
