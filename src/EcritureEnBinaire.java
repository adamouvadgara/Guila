/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class EcritureEnBinaire {
    public void EcritureEnBinaire(int x){
        System.out.println("x en binaire est :");
        int tab[] = new int[32];
        int r,i=1;
        while(1<=x){
            r=x%2;
            x=x/2;
            tab[i]=r;
            i=i+1;
        }
        int d=i-1;
        
        while(0<=d){
        System.out.print(tab[d]);
       d=d-1;
    }
        System.out.println(" ");
    }
    
}
//tyy