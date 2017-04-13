import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Wassa {
    public static void main (String [] args){
        Scanner clavier = new Scanner (System.in);
        int a,b,fact=1 ;
        
        System.out.println("Entrer a :");
        a = clavier.nextInt();
        System.out.println("Entrer b:");
        b = clavier.nextInt();
        
        if(a<b){
            System.out.println(" a est petit");
        }
        else  {
            System.out.println ("a est plus grand");
        
            
        }
        for(int i=1;i <=10;i++ ){
            System.out.println("le double de "  + i +  " çi_est "  +  2*i);
        }
        
          
                    
                    
        {
            System.out.println("FAIT PAR ADAMOU VADGARA");
                    
        } 
        
        
    }
    
}
