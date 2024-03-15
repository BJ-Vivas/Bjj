/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg5.vivas;

import java.util.Scanner;

public class Activity5Vivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        
        int targetCurrency; 
        
        System.out.println("Press 1 for 'Peso to Dollar'" + "\n" + 
                "Press 2 for 'Peso to Euro'" + "\n" + "Press 3 for 'Peso to Yen'" + "\n");
        
        targetCurrency = scn.nextInt();
        
        double sourceCurrency;
         
     switch (targetCurrency) {
           
            case 1:
     
                System.out.println("\n" + "You Chose - PESO TO DOLLAR");
                
                System.out.println("\n" + "Peso Amount : ");
                
                sourceCurrency = scn.nextDouble();
       
                double Dollar = sourceCurrency * 0.018;
                
                System.out.println("\n" + "Total of " + Dollar +" "+"Dollar");
                
            break;
            
            case 2:
                
                System.out.println("\n" + "You Chose - PESO TO EURO");
                
                System.out.println("\n" + "Peso Amount : ");
                
                sourceCurrency = scn.nextDouble();
                
                double Euro = sourceCurrency * 0.017;
                
                System.out.println("\n" + "Total of " + Euro +" "+ "Euro");
                
           break;
           
            case 3:
                
                System.out.println("\n" + "You Chose PESO TO YEN");
                
                System.out.println("\n" + "Peso Amount : ");
                
                sourceCurrency = scn.nextDouble();
                
                double Yen = sourceCurrency * 2.68;
                
                System.out.println("\n" + "Total of " + Yen +" "+ "Yen");
                
           break;
       } 
       
    }
    
}
       