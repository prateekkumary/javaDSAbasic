import java.util.Scanner;

public class ReverseArray {
    static void reverseArray(int a[],int start,int end){
        int temp;
        while(start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        reverseArray(a,0,n-1);
        printArray(a,n);
    }
}
