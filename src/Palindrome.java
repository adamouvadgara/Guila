import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Palindrome {
    public static void main (String[] args){
        String t= new String();
        t="";
        int i=0,j;
        j=t.length()-1;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer une chaine de caractère : ");
        t=clavier.nextLine();
        
        while((  i< j)&&(t.charAt(i)==t.charAt(j))){
            i=i+1;j=j-1;
            {
                if(t.charAt(i)!=t.charAt(j)){
                    System.out.println("la chaine de caractère entrer n'est pas un palindrme");
                    
                    
                    
                    
                }
                else
                {
                  System.out.println("la chaine de caractère entrer est un  palindrme");
                       
                }
                clavier.close();
            }
        
        
            
            
        }
        
    }
   
    
}
