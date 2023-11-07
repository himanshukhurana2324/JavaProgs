
// here we will be using isAlive() function and checking the status of the ,main thread  

class Mythread extends Thread{
     private int delay ;
     Mythread(String str , int d){
        super(str);
        delay=d ;
    }
        
    public void run(){
        for(int i=0;i<2;i++){
            System.out.println(getName()+"thread is running ");
            try{
                sleep(delay);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }    

}    


public class thread4 {
    
   public static void main(String args[]){
    
     Mythread t1 = new Mythread("first", 100);
    //  Mythread t2 = new Mythread("Second",200);
    //  Mythread t3 = new Mythread("third",300);
     Thread MainThread = Thread.currentThread() ;
    t1.start();
    // t2.start();
    // t3.start();
     
    while(t1.isAlive()){
        try{
        Mythread.sleep(3400);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        if(MainThread.isAlive()){
            System.out.println("main thread is alive ");
        }
    }
}
         



}
