import java.util.Scanner;

public class fabinacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f;
        int a=0;
        int b=1;
        System.out.println(a+" \n"+b);
        for(int i=2;i<n;i++){
            f=a+b;
            System.out.println(f);
            a=b;
            b=f;
        }

        //System.out.println(f);

    }
}
