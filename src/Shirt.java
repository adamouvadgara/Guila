/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Shirt {
    public int shirtID = 0 ;
    public String description ="-description required-";
    public char colorCode = 'u';
    public double prince = 0.0 ;
    public int quantityInStock = 0 ;
    
     public void displayShirtInformation() {
        System.out.println("shirtID:" + shirtID);
        System.out.println("shirtID:" + description);
        System.out.println("shirtID:" + colorCode);
        System.out.println("shirt ID:" + prince);
        System.out.println("shirtID:" + quantityInStock);
        
    }
}
