package hk.prob ;

import java.util.*;
class Prime {
    public static void prime(int n){
        if((n%2==0) || (n%3==0)){
            System.out.print(n + "is not  prime number");        }
        else{
                System.out.print(n + "is a prime number");
            }
          
    }
    public static void main(String args[]){
        System.out.println("Enter the number to check it :");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        prime(n);
        sc.close(); 

    }
    
}
