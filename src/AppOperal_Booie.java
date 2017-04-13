

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class AppOperal_Booie {
  public static void main (String [] args) 
  {
      int x=4,y=8,z=3,t=7,calcul=0;
      boolean booll;
      booll=x<y;
      System.out.println("x<y est " + booll);
      booll=(x<y)&(z==t);
      System.out.println("(x<y)&(z==t) est " +booll);
     booll=(x<y)| (z==t);
     System.out.println("(x<y) |(z==t) est "  +  booll);
     booll=(x<y)&&(z==t);
     System.out.println("(x<y)&&(z==t) est"  +  booll);
    booll=(x<y)||(z==t);
    System.out.println("(x<y)||(z==t) est"  + booll);
    booll=(x<y)|((calcul=z)==t);
    System.out.println("(x<y)|((calcul=z)==t) est "  + booll);
    
  }
  
}
      
      
      