import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Exo {
    
    public static void main (String [] args){
        int[]t;
        int taille;
        int somme=0;
        //jjfifggff
        Scanner sc=new Scanner (System.in);
        System.out.println("entrer le plus grand nombre indice :");
        taille=sc.nextInt();
        t=new int[taille+1];
        for(int i=0;i<=taille;i++){
            somme=0;
            for(int j=0;i<=i;j++){
                somme=somme+j;
            }
            t[i]=somme;
        }
        int i;
        
        for(i=0;i<=taille;i++){
            System.out.println("indice " + i + " valeur" + t[i]);
            
        }
    }
    
}
