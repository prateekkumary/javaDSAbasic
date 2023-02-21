import java.util.Scanner;

public class numberofSubarray {
    static void countSubarraysof(int a[],int n){
        int count1=0;
        int count0=0;
        int number0=0;
        int number1=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                count1+=1;
            }
            else{
                number1+=(count1)*(count1+1)/2;
                count1=0;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count0+=1;
    }
            else{
                number0+=(count0)*(count0+1)/2;
                count0=0;
            }
     }
        if(count1>0){
            number1+=(count1)*(count1+1)/2;
        }
        if(count0>0){
            number0+=(count0)*(count0+1)/2;

        }
        System.out.println(number0);
        System.out.println(number1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        countSubarraysof(a,n);
        }
    }

