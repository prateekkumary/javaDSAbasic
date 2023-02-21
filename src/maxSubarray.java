import java.util.Scanner;

public class maxSubarray {
    static int maxSum(int a[],int n){
        int sum=a[0];
        int MaxSum=a[0];

        for(int i=0;i<n;i++){

                sum=Math.max(a[0],sum+a[i]);
                MaxSum=Math.max(sum,MaxSum);

        }
        return MaxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int MAxsum=maxSum(a,n);
        System.out.println(MAxsum);
    }
}
