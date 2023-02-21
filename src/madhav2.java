import java.util.Scanner;

public class madhav2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char s[]=str.toCharArray();
        boolean word[]=new boolean[26];
        for(int i=0;i<s.length;i++) {
            word[(int) s[i] - 97] = true;
        }
            int count=0;
            for(int i=0;i<26;i++){
                if(word[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

