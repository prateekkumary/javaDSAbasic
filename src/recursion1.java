import javax.print.attribute.SetOfIntegerSyntax;

public class recursion1 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int n=5;
        printNum(n);
    }
}
