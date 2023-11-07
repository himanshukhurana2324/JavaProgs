package hk.pat ;

class Pattern5{
    public static void main(String args[]){
     for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++)
            System.out.print("*");
        int space=2*5-2*i ;
        for(int j=0;j<space;j++)   
            System.out.print(" ");
        for(int j=1;j<=i;j++)
            System.out.print("*") ;
        System.out.println();
        }   
     for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++)
            System.out.print("*");
        int space=2*5-2*i ;
        for(int j=0;j<space;j++)   
            System.out.print(" ");
        for(int j=1;j<=i;j++)
            System.out.print("*") ;
        System.out.println();
        }   
}
}