interface int1{
    void show();
}
interface int2 extends int1 {
    void display();
}
class demo implements int2{
    public void show(){
        System.out.println("int1");

    }
    public void display(){
        System.out.println("int 2");
    }
}

public class interface1 {
    public static void main(String args[]){
        demo d2= new demo();
        // d1.display();
        // d1.show();
        int2 i1 ;
        i1 = d2;
        i1.display();
        i1.show();
    }
}
