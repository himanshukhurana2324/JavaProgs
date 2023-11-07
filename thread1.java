// import java.lang.*;
// import java.util.*;
class Mythread extends Thread{
    private int a;
    Mythread(int an){
        a=an;
    }
    public void run(){
        for(int i=0;i<5;i++)
           System.out.println("thread"+a+"is running "+ i);
    }

}
class thread1{
    public static void main(String args[]){
        System.out.println("main function started");
        Mythread t1 = new Mythread(1);
        Mythread t2 = new Mythread(2);
        Mythread t3 = new Mythread(3);
        // t1.setDaemon(true);
        // t2.setDaemon(true);
        System.out.println("Thread 1 started");
        t1.start();
        System.out.println("Thread 2 started");
        t2.start();
        System.out.println("Thread 3 started");
        t3.start();

        System.out.println("Main thread finished");


    }
}