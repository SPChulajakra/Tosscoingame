import java.util.*;
public class App {
    public static void main(String args[]) {
        //data
        Scanner S2= new Scanner (System.in);
        double [] RR= new double [50];
        for(int i=0;i<RR.length;i++)
        RR[i]=Math.random()*100;
        int [] CR1={10,4,7,12,6,14,5,8,11,10,7,4,13,9,5,18,4};
        int Char1=145;
        int Char2=175;
        int Emy=200;
        //Start Game.
        System.out.print("Pass enter to continue.");
        Scanner input= new Scanner (System.in);
        String text = input.nextLine();
      //character select intel.
      {
      System.out.println(" ");
      System.out.println("Please choose character.");
      System.out.println("");  
      System.out.print("Name: Ira"+" [1]");
      System.out.print(" ");
      System.out.println("HP: 145");
      System.out.print("Skill 1");
      System.out.print(" ");
      System.out.print("Stap");
      System.out.print("      ");
      System.out.println("OO");
      System.out.println("4-10 "+"O+3");
      System.out.print("Skill 2");
      System.out.print(" ");
      System.out.print("Hook");
      System.out.print("      ");
      System.out.println("O");
      System.out.println("6-12 "+"O+6");
      System.out.print("Skill 3");
      System.out.print(" ");
      System.out.print("Unstop");
      System.out.print("    ");
      System.out.println("OOO");
      System.out.println("5-14 "+"O+3");
      System.out.println("|");
      System.out.println("or");
      System.out.println("|");
      System.out.print("Name: Chan"+" [2]");
      System.out.print(" ");
      System.out.println("HP: 130");
      System.out.print("Skill 1");
      System.out.print(" ");
      System.out.print("Kick");
      System.out.print("       ");
      System.out.println("OO");
      System.out.println("4-10 "+"O+3");
      System.out.print("Skill 2");
      System.out.print(" ");
      System.out.print("haevy hit");
      System.out.print("  ");
      System.out.println("OO");
      System.out.println("5-13 "+"O+4");
      System.out.print("Skill 3");
      System.out.print(" ");
      System.out.print("Gale kick.");
      System.out.print("  ");
      System.out.println("O");
      System.out.println("4-18 "+"O+14");}
      //choose character.
        System.out.print("input number to choose: ");
        Scanner S1= new Scanner (System.in);
        double character = S1.nextDouble();
        
        if(character<=0||character>=3)System.out.println("Please it only 1 or 2");{
        if(character==1)System.out.println("You has choose Ira.");
        if(character==2)System.out.println("You has choose Chen.");
        }
        //Proceed the game.
        {if(character==1||character==2)System.out.println("|");
        if(character==1||character==2)System.out.println("|");
        if(character==1||character==2)System.out.println("warning: from now on it still early ascess if you choose the other number else skill it might make it error.");
        if(character==1||character==2)System.out.println("|");
        if(character==1||character==2)System.out.println("|");
        if(character==1||character==2)System.out.println("Now let's the game.");
        if(character==1||character==2)System.out.println("Begin....");
        if(character==1||character==2)System.out.println("|");
        if(character==1||character==2)System.out.println("|");
  
        System.out.println(" ");}
       //Begin battle
  //character 1     
        if(character==1){
        if(Emy>=0||Char1>=0)for(int T=1;T<=5&&Emy>=0&&Char1>=0;T++){
        System.out.println(" ");
        System.out.println("Trun "+T);
        System.out.println("Choose...witly...between 1 2 or 3...");
        System.out.print("input number to choose skill: ");
        int skill = S2.nextInt();  
        System.out.println(" ");
        System.out.println("Trun "+T+" fight!");
        if(skill<1||skill>3)System.out.println("Ira don't no what the meaning you was order.");
        if(skill<1||skill>3)System.out.println("(Sorry it noly 1 2 3)");
        System.out.println(" ");{
        if(skill==1){
        ///RR0 skill 1
        if(skill==1)System.out.println("Ira use Stap..");
        if(RR[0]>50&&skill==1)System.out.print("Head");
          else if(RR[0]<50&&skill==1) System.out.print("Tail");
        System.out.print(" ");
        //RR1
        if(RR[1]>50&&skill==1)System.out.println("Head");
          else if(RR[1]<50&&skill==1) System.out.println("Tail");
        //skill 1 canculate
         if(RR[0]>50&&RR[1]>50&&skill==1)System.out.println(CR1[0]+" damage.");
          else if(RR[0]<50&&RR[1]<50&&skill==1) System.out.println(CR1[1]+" damage.");
          else if(RR[0]<50||RR[1]<50&&skill==1) System.out.println(CR1[2]+" damage.");
          System.out.println("|");
        //update RR  
          RR[0]=(RR[0]-RR[0])+(Math.random()*100);
          RR[1]=(RR[1]-RR[1])+(Math.random()*100);
        }
        ///RR2 skill 2
        if(skill==2){
        if(skill==2)System.out.println("Ira use Hook..");    
        if(RR[2]>50&&skill==2)System.out.println("Head");
         else if(RR[2]<50&&skill==2)System.out.println("Tail");
        //skill 2 canculate
         if(RR[2]>50&&skill==2)System.out.println(CR1[3]+" damage.");
         else if(RR[2]<50&&skill==2) System.out.println(CR1[4]+" damage.");
         System.out.println("|");
        //update RR
        RR[2]=(RR[2]-RR[2])+(Math.random()*100);
        }
        ///RR3 skill 3
        if(skill==3){
        if(skill==3)System.out.println("Ira use unstop..");    
        if(RR[3]>50&&skill==3)System.out.print("Head");
          else if(RR[3]<50&&skill==3) System.out.print("Tail");
          System.out.print(" ");
        //RR4
        if(RR[4]>50&&skill==3)System.out.print("Head");
          else if(RR[4]<50&&skill==3) System.out.print("Tail");
          System.out.print(" ");
        //RR5
        if(RR[5]>=50&&skill==3)System.out.println("Head");
          else if(RR[5]<50&&skill==3) System.out.println("Tail");
          
          
        //skill 3 canculate
         if(RR[3]>50&&RR[4]>50&&RR[5]>50&&skill==3)System.out.println(CR1[5]+" damage.");
          else if(RR[3]<50&&RR[4]<50&&RR[5]<50&&skill==3) System.out.println(CR1[6]+" damage.");
          else if(RR[3]<50||RR[4]<50&&RR[5]<50&&skill==3) System.out.println(CR1[7]+" damage.");
          else if(RR[3]<50||RR[4]<50||RR[5]<50&&skill==3) System.out.println(CR1[8]+" damage.");
          System.out.println("|");
        //update RR
         RR[3]=(RR[3]-RR[3])+(Math.random()*100);
         RR[4]=(RR[4]-RR[4])+(Math.random()*100);
         RR[5]=(RR[5]-RR[5])+(Math.random()*100);
        }  
        }
       }
       System.out.println("END");//End character 1
  }
  //character 2
        if(character==2){
        if(Emy>=0||Char1>=0)for(int T=1;T<=5&&Emy>=0&&Char1>=0;T++){
        System.out.println(" ");
        System.out.println("Trun "+T);
        System.out.println("Choose...witly...between 1 2 or 3...");
        System.out.print("input number to choose skill: ");
        int skill = S2.nextInt();  
        System.out.println(" ");
        System.out.println("Trun "+T+" fight!");
        if(skill<1||skill>3)System.out.println("Chan doubt you what you doing.");
        if(skill<1||skill>3)System.out.println("(Sorry it noly 1 2 3)");
        System.out.println(" ");{
        if(skill==1){
        if(skill==1)System.out.println("Chan use Kick..");  
        ///RR6 skill 1
        if(RR[6]>50&&skill==1)System.out.print("Head");
          else if(RR[6]<50&&skill==1) System.out.print("Tail");
        System.out.print(" ");
        //RR7
        if(RR[7]>50&&skill==1)System.out.println("Head");
          else if(RR[7]<50&&skill==1) System.out.println("Tail");
        //skill 1 canculate
         if(RR[6]>50&&RR[7]>50&&skill==1)System.out.println(CR1[9]+" damage.");
          else if(RR[6]<50&&RR[7]<50&&skill==1) System.out.println(CR1[11]+" damage.");
          else if(RR[6]<50||RR[7]<50&&skill==1) System.out.println(CR1[10]+" damage.");
          System.out.println("|");
        //update RR  
          RR[6]=(RR[6]-RR[6])+(Math.random()*100);
          RR[7]=(RR[7]-RR[7])+(Math.random()*100);
        }
        ///RR8 skill 2
        if(skill==2){
        if(skill==2)System.out.println("Chan use Haevy hit..");    
        if(RR[8]>50&&skill==2)System.out.print("Head");
         else if(RR[8]<50&&skill==2)System.out.print("Tail");
        System.out.print(" ");
        //RR9
        if(RR[9]>50&&skill==2)System.out.println("Head");
          else if(RR[9]<50&&skill==2) System.out.println("Tail");
        //skill 2 canculate
         if(RR[8]>50&&RR[9]>50&&skill==2)System.out.println(CR1[12]+" damage.");
          else if(RR[8]<50&&RR[9]<50&&skill==2) System.out.println(CR1[14]+" damage.");
          else if(RR[8]<50||RR[9]<50&&skill==2) System.out.println(CR1[13]+" damage.");
          System.out.println("|");
        //update RR  
          RR[8]=(RR[8]-RR[8])+(Math.random()*100);
          RR[9]=(RR[9]-RR[9])+(Math.random()*100); 
  
        }
        ///RR10 skill 3
        if(skill==3){
        if(skill==3)System.out.println("Chan use Gale kick..");    
        if(RR[10]>50&&skill==3)System.out.println("Head");
         else if(RR[10]<50&&skill==3)System.out.println("Tail");
        //skill 2 canculate
         if(RR[10]>50&&skill==3)System.out.println(CR1[15]+" damage.");
         else if(RR[10]<50&&skill==3) System.out.println(CR1[16]+" damage.");
         System.out.println("|");
        //update RR
        RR[10]=(RR[10]-RR[10])+(Math.random()*100);
        
        }  
        
        }
       }
       System.out.println("END");//End character 2
       
  }
        
        
        
      }
  }
