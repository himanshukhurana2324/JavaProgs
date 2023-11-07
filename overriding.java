class Parent{
     void shof(){
        System.out.println("using the super class method");
    }
}
class Child extends Parent{
    static void show(){
        System.out.println("Output from Child class");
        
    }
}
final  class overriding {
    public static void main(String args[]){
        // Child c1 = new Child();
        Child.show();
    }
}

