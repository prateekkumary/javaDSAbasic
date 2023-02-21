
import java.util.LinkedList;
import java.util.Scanner;

public class LL {


    public static void main(String[] args) {

        LinkedList<Integer>pk=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int element=sc.nextInt();
            pk.add(element);

        }
        //for(int i=0;i<num;i++){
            pk.add(3,27);
            System.out.print(pk);
        //}
        System.out.println();
    }
}
