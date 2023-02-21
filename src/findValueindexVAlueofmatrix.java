import java.util.Scanner;

public class findValueindexVAlueofmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==x)
                    System.out.println(i+","+j);
            }
        }
    }
}
