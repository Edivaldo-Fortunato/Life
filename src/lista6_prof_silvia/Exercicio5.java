/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6_prof_silvia;

import java.util.Scanner;

/**
 *
 * @author ligor
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner ler = new Scanner (System.in);
        
        String word;
        
        
        System.out.println("Digite uma frase: ");
        word = ler.nextLine();
        System.out.println(word.replace(" ", "_"));
    }   
}
