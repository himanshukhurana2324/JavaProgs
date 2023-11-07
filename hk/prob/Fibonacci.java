package hk.prob ;
import java.util.*;

class Fibonacci {



    public static void fib(int n){
        int a=0,b=1,c=a+b ;
        System.out.print("\t"+a);
        // System.out.print("\t"+b);
        while(c<=n){
            c=a+b;
            a=b;
            System.out.print("\t"+b);
            b=c;

        }
    }




    public static void fibnth(int n){
        int a=0,b=1,c=0 ;
        if(n==1)
            System.out.print("first element of the series is "+ a);
        else if(n==2)
            System.out.print("second element of the series is " + b);
        else {        
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("\n"+ n+"th "+"element of the series is "+ c);
    }


    
    }
    public static void main(String args[]){
        System.out.print("enter the range of the series and the element too : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        fib(n);
        fibnth(m);
        sc.close();
    }
}
    

