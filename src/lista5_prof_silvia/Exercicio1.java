/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5_prof_silvia;

import java.util.Scanner;

/**
 *
 * @author ligor
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner ler = new Scanner (System.in);
        int [] vec = new int [20];
        double res = 0;
        int i;
        System.out.println("---Vector---");
        int cont = 0;
        for (i = 0; i != vec.length; i++) {
            
            if(i > 9){
                
                vec[i] = vec[9-cont];
                cont++;
                
            }
            else{
                
                System.out.println("Digite um numero: ");
                System.out.print("[" + i + "]: ");
                vec[i] = ler.nextInt();
            
            }
        }
        
        for (i = 0; i != 20; i++) {
           System.out.print (" | " + vec[i] + " ");

        }
    }
}