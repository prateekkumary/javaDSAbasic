import java.util.Scanner;

public class myabhiprogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        String a=String.valueOf(input1);
        int num=0;
         num=  a.charAt(1)-48;
       num=num*10+a.charAt(0)-48;
       //return num;



       System.out.println(num);
    }
}