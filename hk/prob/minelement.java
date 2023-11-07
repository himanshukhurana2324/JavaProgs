package hk.prob ;

import java.util.*;

public class minelement {
    static int ar[] , l ;
    public static void input(){
        System.out.print("enter the number of elements of the list : ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        ar = new int[l];
        System.out.print("enter the elements = ");
        for(int i=0;i<l;i++){
            ar[i] = sc.nextInt();
        }
       sc.close();
    }
    public static void min(){
        int min=ar[0] , loc=0 ;
        for(int i =1;i<l;i++){
             if(min>ar[i])
               {
                min = ar[i];
                loc=i+1 ;
               }
             
            }
    
        System.out.println("minimum element of the array is " + min +" and stored at location  "+ loc );
        }
    public static void main(String args[]){
        input();
        min();
    }

    
}
