/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6_prof_silvia;

import java.util.*;

/**
 *
 * @author ligor
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
   
        String words/*, palavra*/;
        char character = 0, letra = 0;
        
        System.out.println("Digite a palavra: ");
        words = ler.next();
        StringBuilder word = new StringBuilder (words);
        
        System.out.println("Digite a outra palavra: ");
        String palavras = ler.next();
        StringBuilder palavra = new StringBuilder (palavras);
        System.out.println("-----APRESENTACAO-----");
        
        palavra = palavra.reverse();
        System.out.println(word);
        System.out.println(palavra);
        
        if (word == palavra) {
            System.out.println("E um anagrama!");
        }
        else{
            System.out.println("Nao e um anagrama!");
        }
        //verificacao de que e uma palavra
        //String aux = "", aux2 = "";
        /*for (int i = 0; i != word.length(); i++) {
             aux += word.charAt(i);
        }
        if (aux.equals(palavra)) {
            System.out.println("E igual! ");
        }*/
        //else{
            //for (int i = palavra.length(); i >= 0; i++) {
              //  aux2 += palavra.charAt(i);
            //}
            //if (aux2.equals(word)) {
              //  System.out.println("E um anagrama! ");
            //}
        //}
        /*if (palavra.length() > 2) {
            System.out.println(palavra.reverse());
            System.out.println("E um anagrama!");
        }
        else{
            System.out.println("Nao e uma palavra, logo nao e um anagrama! ");
        }*/
        
        /*for (int i = 0; i < word.length(); i++) {
            character = word.charAt(i);
            for (int j = 0; j < palavra.length(); j++) {
                letra = palavra.charAt(j);
            }
            if (character == letra) {
                if (word.equals(palavra.reverse())) {
                    System.out.println("Correto");
                }
                else{
                    System.out.println("Incorreto");
                }
            }
            else{
                System.out.println("As letras devem ser iguais!");
            }
        }*/
    }
}
