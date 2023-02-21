import java.util.Scanner;

public class MockInterviewdsa2 {
    public  static void printAllsubstring(char c[],int l){
        for(int i=1;i<=l;i++){
            for(int j=0;j<=l-i;j++){
                 int k=j+i-1;
                 for(int s=j;s<=k;s++){
                     System.out.print(c[s]);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        printAllsubstring(c,c.length);

    }
}
