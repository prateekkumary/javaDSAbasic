import java.util.Scanner;
import java.util.*;

public class targetIndies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]==k)
                System.out.println(i);
        }
    }
}
