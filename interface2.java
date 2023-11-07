interface interfaceDemo{
        void display();
        
    }

class Shape implements interfaceDemo
{
    public void display(){
        System.out.println("working with Shapes in shape class");
    }
   
}
class Circle extends Shape  
{
    public void display(){
        System.out.println("Working with shapes in Circle class");
    }
   
}
class interface2{
     public static void main(String args[]){
        Circle c1 = new Circle();
        interfaceDemo i1 ;
        Shape s1 = new Shape();

        i1=c1;
        i1.display();
        i1=s1;
        i1.display();
        
    }
}



