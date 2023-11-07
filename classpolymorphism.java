class Parent{
    
     void show(){
        System.out.println("the super class method");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("from Child class");
        
    }
}

 
public class classpolymorphism {
     public static void main(String args[]){
        Child c1 = new Child();
        Parent p ;
        p=c1;
        p.show();
       
    
}
}