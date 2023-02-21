import java.util.*;

public class Stringpk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] charArray=s.toCharArray();
        boolean foundSpace=true;
        for(int i=0;i<charArray.length;i++){
            if(Character.isLetter(charArray[i])){
                if(foundSpace){
                    charArray[i]=Character.toUpperCase(charArray[i]);
                    foundSpace=false;
                }
            }
            else {
                foundSpace=true;
            }
        }
        s=String.valueOf(charArray);
        System.out.println(s);
    }
}
