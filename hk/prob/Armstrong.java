package hk.prob ;
// import java.util.*;
// import java.lang.*;
public class Armstrong {
    public void armStrong(int n){
        int sum=0,temp=n,rem=0,p=0;
        while(temp>0){
            temp/=10;
            p++;
        }
        System.out.print("no. of digits of the number is " + p);
        temp=n ;
        while(temp>0){
            rem=temp%10;
            temp=temp/10;
            sum+=(Math.pow(rem,p));
        }
        if(sum==n){
            System.out.print("the no. is armstr ong");
        }
        else
          System.out.print("the number is not the armstrong");

    }
    // public static void main(String args[]){
    //     System.out.print("enter the number to check it : ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     armStrong(n);
    //     sc.close();
    // }
    
}
