/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Tableau {
    
    public static void main(String[] args){
               int[]tab = {12,15,13,10,8,9,13,14};
        int n;
        
        boolean estLa = false;
          Scanner clavier=new Scanner (System.in);
        System.out.println("Entre un nombre :");
        n=clavier.nextInt();
        // n=Terminal.lireInt();
        for(int i=0;i<tab.length; i++){
            if(tab[i]==n){
                estLa=true;
                
            }
        }
         if(estLa){
             System.out.println("le nombre est dans le tableau");
            // Terminal.ecrireStringln("Lnombre est dant le tableau");
             
         } else {
             System.out.println("le nombre n'est pas dans le tableau");
         }     
    
    }
          
}    
    

    


