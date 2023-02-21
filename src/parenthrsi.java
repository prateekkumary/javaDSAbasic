import java.util.Scanner;

public class parenthrsi {
    public static String removeOuterParenthese(String S){
        StringBuilder s=new StringBuilder();
        int op=0;
        for(char c:S.toCharArray()){
            if(c=='('&& op++>0)
                s.append(c);
            if(c==')' &&op-->1)
                s.append(c);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();

        System.out.println(removeOuterParenthese(S));

    }
}
