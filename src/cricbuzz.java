import java.util.Scanner;

public class cricbuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

                if(a[i]+a[i+1]==k){
                    System.out.println(a[i]+" "+a[i+1]+" "+k);

            }
        }




    }
}
