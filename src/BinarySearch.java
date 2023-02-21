import java.util.Scanner;

public class BinarySearch {
    public static void binaryKey(int a[],int first,int last,int k)

    {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (a[mid] < k) {
                first = mid + 1;
            }
            else if (a[mid] == k)
            {
                System.out.println(mid);
                break;
            }
            else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("key element is not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        binaryKey(a,0,n,k);
    }
  }

