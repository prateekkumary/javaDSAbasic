import java.util.Scanner;

public class stringOccurance {
    public static int occuranceWord(String s,String word){
        String []str=s.split(" ");
        int count=0;
        for(int i=0;i<str.length;i++){
            if(word.equals(str[i]))
                count++;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String word=sc.nextLine();

        System.out.println(occuranceWord(s,word));
    }
}
