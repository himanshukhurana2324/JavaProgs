class Mythread extends Thread{
    private int delay ;
    Mythread(String str,int an){
        super(str) ;
        delay=an;
    
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(getName()+ "is running now");
            try{
                sleep(delay);
            }
            catch(InterruptedException e){
                    e.printStackTrace();
            }
       }
          System.out.println(getName()+"is finished");

    }
}
class thread2{
    public static void main(String args[]){
        System.out.println("Main thread has started");
        Mythread m1 = new Mythread("One",500);
        Mythread m2 = new Mythread("Two",200);
        Mythread m3 = new Mythread("Three",300); 
        m1.start();
        m2.start();
        m3.start();
        System.out.println("Main thread ended"); 
 
    }

}