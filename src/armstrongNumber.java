import java.util.Scanner;

public class armstrongNumber {
     static boolean isArmstrong(int n){
        int temp,sum=0,digit=0,last;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
         if(sum==n) {
             return true;
         }
        else {
             return false;
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");

            }
        }
    }
}
