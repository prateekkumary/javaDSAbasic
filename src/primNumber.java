import java.util.Scanner;

public class primNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println("Not prime number");
        }
        else {
              for (int i = 2; i < m; i++) {

                if (m % i == 0) {
                    System.out.println("not prime number");
                    flag=1;
                    break;
                }
              }
         }
            if(flag==0){
                System.out.println("Prime number");

        }
    }
}
