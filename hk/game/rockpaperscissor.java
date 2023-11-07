// import java.lang.*;
package hk.game ;
import java.util.*;
class game{
      public int bot, op=0,bc=0,uc=0;
      public void generator(){
        int  max=3 , min=1;
        Random r1 = new Random();
        bot=(r1.nextInt(max-min+1)+min);
        System.out.println(bot) ;
      }
        
        
      public void input(){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter your option(1-2-3)=");
        op=sc.nextInt();
        if(op<1 ||op>3){
          System.out.print("wrong input !,try again");
          sc.close();

        
        }
      }
      public void score()
      {
        System.out.println("SCORES ARE :");
        System.out.println("BOT ="+bc);
        System.out.println("YOU ="+uc);

      }
      public void check(){
        if(op==1){
          if(bot==2){
            System.out.print("BOT WINS !!!");
            bc++;
            score();
          }
          else if(bot==3){
            System.out.print("YOU WINS !!!");
            uc++;
            score();
          }
          else{
            System.out.println("Draw !");
            uc++;
            bc++;
            score();
          }
        }
       else if(op==2){
        if(bot==1){
            System.out.print("YOU WINS !!!");
            uc++;
            score();
          }
          else if(bot==3){
            System.out.print("BOT WINS !!!");
            bc++;
            score();
          }
          else{
            
            System.out.println("Draw !");
            uc++;
            bc++;
            score();
          } 
        }
         else{ 
          if(bot==2){
            System.out.print("YOU WINS !!!");
            uc++;
            score();
          }
          else if(bot==1){
            System.out.print("BOT WINS !!!");
            bc++;
            score();
          }
          else{
            System.out.println("Draw !");
            uc++;
            bc++;
            score();
          }

       }
      }
}  
public class rockpaperscissor {
 
  public void start(){

    // int count=0;
    game g1=new game();
    // int count =0;
    System.out.println("we will be playing the game as the round of 5 counts");
    System.out.println("# First to count 3 out of 5 will be the winner");
    System.out.println("OPTIONS TO INPUT ARE AS FOLLOW:\n 1. For Rock \n 2. For Paper \n 3. Scissor");
    while(true){
      g1.input();
      g1.generator();
      g1.check();
      // count+=(g1.uc+g1.bc);
      if(g1.bc==3||g1.uc==3){
        if(g1.bc==3){
      System.out.println("BOT is the final winner");
      break;
     }
      else{
      System.out.println("YOU are the final winner") ;    
      break;}
    } 
  }
}
}
      

