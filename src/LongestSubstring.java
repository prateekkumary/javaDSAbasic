import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstring {
    static int No_of_char=200;
   public static int longestlengthofsubString(String s) {
       int l=s.length();
       int res=0;
       int [] a=new int[No_of_char];
       Arrays.fill(a,-1);
       int b=0;
       for(int i=0;i<l;i++){
           b=Math.max(b,a[s.charAt(i)]+1);
           res=Math.max(res,i-b+1);

       }
       return res;

   }
//        int l=s.length();
//        int res=0;
//        for(int i=0;i<l;i++) {
//            boolean[] b = new boolean[l-1];
//            for (int j = i; j < l; j++) {
//                if (b[s.charAt(j)] == true)
//                    break;
//
//                 else{
//                    res = Math.max(res, j - i + 1);
//                    b[s.charAt(j)] = true;
//                }
//            }
//
//            b[s.charAt(i)] = false;
//        }
//        return res;

    //}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int n=longestlengthofsubString(s);
        System.out.println(n);


    }
}
