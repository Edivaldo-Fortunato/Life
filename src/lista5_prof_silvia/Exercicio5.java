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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
        
        int i, j, n, auxi = 0, auxj = 0;
        
        
        System.out.println("Digite o tamanho que deseja para a matriz:");
        n = ler.nextInt();
        
        int mat [][] = new int [n][n];
        
        System.out.println("------MATRIZ------");
        System.out.println("APRESENTACAO DA PRIMEIRA MATRIZ");
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                if (i==j || (i+j == n-1)) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" . ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("------MATRIZ------");
        System.out.println("APRESENTACAO DA SEGUNDA MATRIZ");
        for (i = -n; i <= n; i++) {
            for (j = -n; j <= n; j++) {
                if (i*j <= j*j) {
                    System.out.print("* ");    
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println(" ");
        }
    }
}
