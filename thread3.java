// import java.util.* ;


class Mythread implements Runnable{
    private int id , delay ;
    Mythread(int i,int d){
        id=i;
        delay=d;
    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Thread"+id+"has started");
            try{
                Thread.sleep(delay);

            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread"+id+"is finished");
    }
}
class thread3  {
    public static void main(String args[]){
        Mythread t1 = new Mythread(1, 100);
        Mythread t2 = new Mythread(2,300);
        Mythread t3 = new Mythread(3,600);
        Thread r1 = new Thread(t1);
        Thread r2 = new Thread(t2);
        Thread r3 = new Thread(t3);
        r2.setDaemon(true);  /* if the main thread will complete first
                                 then r2 and r3 will be terminated regarless of their process being completed */
        r3.setDaemon(true);
        r1.start();
        r2.start();
        r3.start();
        // if(MainisAlive())
            // System.  
    
    } 
    
}
 