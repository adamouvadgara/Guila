
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Exo6 {
    public static void  main(String []args) {
        int n;
        int []tab ={12,15,13,10,8,9,13,14,};
        int indice=-1;
        Scanner clavier =new Scanner (System.in);
        System.out.println("Entreer le nombre a chercher ");
        n=clavier.nextInt();
        for(int i=0;i<tab.length;i++){
            if((tab[i]==n)&&(indice==-1)){
                indice=i;
                
            }
        }
        if(indice!=-1){
            System.out.println("le nombre est a l'indice "+ indice);
        }else{
             System.out.println("le nombre n'est pas dans le tableau ");
            
        }
        
        
        
        
        
    }
    
}
