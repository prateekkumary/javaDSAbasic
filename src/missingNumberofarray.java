import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class missingNumberofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {4, 2, 7, 9, 6, 3};
        int Max = 0;
        //for(int i=0;i<a.length;i++){
        //Max=Math.max(Max,a[i]);
        // }

        HashSet<Integer> ls = new HashSet<>();
        for (int i = 1; i < a.length; i++) {
            ls.add(a[i]);
            if (a[i] != i) {
                ls.add(i);
                System.out.println(ls.add(i));
            }

        }
        System.out.println(ls);
//        for(int i=0;i<a.length;i++){
//            Max=Math.max(Max,a[i]);
//
//        }
//        Array.sort(a);
//        for(int i=0;i<a.length;i++){
//            if(a[i]!=i) {
//                System.out.print();
//            }
//            else {
//
//            }
    }
    //System.out.println(ls);
    // System.out.println(Max);
//        Arrays.sort(a);
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//
//        }
//        System.out.println();
//        for(int i=1;i<=Max;i++){
//            if(i!=a[i]) {
//                System.out.print(i + " ");
//                a[i+1]=a[i];
//            }
//
//
//
//        }
//        System.out.println();



}
