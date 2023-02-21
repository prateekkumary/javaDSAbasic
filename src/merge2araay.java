import java.util.Scanner;
import java.util.*;

public class merge2araay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int p=n+m;
        int[] c=new int[p];
        System.arraycopy(a,0,c,0,n);
        System.arraycopy(b,0,c,n,m);
        Arrays.sort(c);
        for(int i=0;i<p;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();

    }
}
