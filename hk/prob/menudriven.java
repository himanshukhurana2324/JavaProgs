package hk.prob ;

import java.util.*;
class menudriven{
    static int a ,b ;
    char sign ;
    public static void menu(){
        System.out.println("enter the two numbers : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter the operation to perform (+ ,* , -): ");
        char sign ;
        sign = sc.next().charAt(0);
        sc.close();
        switch(sign){ 
            case '+':{
                      System.out.print("the sum of the two numbers is " + (a+b));
                      break;
            }
            default:{
                System.out.print("wrong operation !");
                break;}
            }
        }


    

public static void main(String args[]){
    menu();
}}