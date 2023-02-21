import java.util.Scanner;

public class mergedsort2 {
    public static void conquer(int a[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int id1=si;
        int id2=mid+1;
        int x=0;
        while(id1<=mid && id2<=ei) {
            if (a[id1] <= a[id2]) {
                merged[x++] = a[id1++];
            } else {
                merged[x++] = a[id2++];
            }
        }
            while(id1<=mid){
                merged[x++]=a[id1++];

            }
            while(id2<=ei){
                merged[x++]=a[id2++];
            }
            for(int i=0,j=si;i<merged.length;i++,j++){
                a[j]=merged[i];
            }
        }

    public static void divide(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(a,si,mid);
        divide(a,mid+1,ei);
        conquer(a,si,mid,ei);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        divide(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}
