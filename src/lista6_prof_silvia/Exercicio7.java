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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
        
        
        String word, aux = "";
        char letra = 0;
        
        System.out.println("Digite a String: ");
        word = ler.nextLine();
        
        System.out.println("-----APRESENTACAO-----");
        if (word.contains("a") || word.contains("A") || word.contains("e") || word.contains("E") || word.contains("i") || word.contains("I") || word.contains("u") || word.contains("U")) {
            System.out.println(word);
        }
        else{
            aux = word.trim();
            System.out.println(aux);
        }
    }
}
