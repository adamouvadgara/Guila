import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Tab2 {
    public static void main (String [] args){
        //question 1
        
        
        int [][]ventes=new int [4][5];
        Scanner va =new Scanner(System.in);
        
        for(int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                System.out.println("entrer le nombre de modele");
        i=va.nextInt();
        System.out.println("entrer le nombre de vendeurs");
        j=va.nextInt();
        ventes[i][j]=va.nextInt();
        
                
                
            }
        }
        //qestion 2
        for(int i=0;i<4;i++){
        int total=0;
        for(int j=0;j<5;j++){
            total=total+ventes[i][j];
        }
        System.out.println("ventes du modele " + i +": ");
         System.out.println(total + "euros");
         
        
        
        
    }
        
    }
    
}
