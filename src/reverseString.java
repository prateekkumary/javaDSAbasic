import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
           // System.out.print(s.charAt(i));
        }
        System.out.print(rev);



    }
}
