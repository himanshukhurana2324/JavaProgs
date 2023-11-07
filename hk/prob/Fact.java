package hk.prob;
import java.util.*;
class Fact {
    public static void fact(int a){
        long fac=1;
        for(int i=1;i<=a;i++){
            fac*=i;
        }
        System.out.print("Factorial of the given number is : "+fac);
        // System.out.print(fac);
    } 
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number to find the factorial :");
        Scanner sc= new Scanner(System.in) ;
         n = sc.nextInt();
         fact(n);
         sc.close();
    }
}

    