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
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
        
        String palavra;
        
        int i, f; //i = inicio; f = fim
        
        System.out.println("Digite uma palavra: ");
        palavra = ler.next();
        
        System.out.println("Digite a posicao da palavra onde deseja comecar");
        i = ler.nextInt();
        
        System.out.println("Digite a posicao da palavra onde deseja terminar");
        f = ler.nextInt();
        
        System.out.println(" ");
        
        System.out.println("-----APRESENTACAO-----");
        //System.out.println(palavra.substring(i, f));
        
        if ( i < 0 || f < 0 || i > f ||  i > palavra.length() || f > palavra.length()) {
            System.out.println("Essas sao posicoes inexistentes na palavra! ");
        }
        else{
            System.out.println(palavra.substring(i, f));
        }
    }
}
