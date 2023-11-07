// import java.lang.*;
// import java.util.*;
class Mythread implements Runnable{
    private int id , delay ;
    Mythread(int id , int delay){
        this.id=id ;
        this.delay=delay;
    }
    public void run (){
        System.out.println(id+"thread is running");
        try{
        Thread.sleep(delay);
    }
        catch(InterruptedException e){
            e.printStackTrace();
        }
       System.out.println(id + " thread is completed");  
} 
}


public class interthread {
    public static void main(String args[]){

      Mythread m1 = new Mythread(1, 200);
      Mythread m2 = new Mythread(2, 400);
      Mythread m3 = new Mythread(3,100);
      Thread t1 = new Thread(m1);
      Thread t2 = new Thread(m2);
      Thread t3 = new Thread(m3);
      t1.start();
      t2.start();
      t3.start();
     System.out.println("Main thread is completed");
     
    }
}
