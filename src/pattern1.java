import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.print(" ");
            for(int j=i;j>0;j--){

                System.out.print("*"+" ");
            }
           System.out.println("");
            System.out.print(" ");
        }
    }
}
