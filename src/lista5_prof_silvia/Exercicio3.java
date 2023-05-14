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
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
        
        double mat [][] = new double [6][6];
        int i, j;
        double soma = 0;
        double mult = 1;
        
        System.out.println("-----MATRIZ-----");
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                System.out.println("mat[" + i + "]" + "[" + j + "]:");
                mat[i][j] = ler.nextDouble();
            }
        }
        System.out.println("------APRESENTACAO------");
        System.out.println("SOMA DOS ELEMENTOS DA PRIMEIRA COLUNA:");
        for ( i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                if (mat[i][j] == mat[i][1]) {
                    soma += mat[i][j];
                }
            }
        }
        System.out.println("Resultado: " + soma);
        System.out.println(" ");
        System.out.println("------APRESENTACAO------");
        System.out.println("MULTIPLICACAO DOS ELEMENTOS DA TERCEIRA LINHA:");
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                if (mat[i][j] == mat[3][j]) {
                    mult *= mat[i][j];
                }
            }
        }
        System.out.println("Resultado: " + mult);
        System.out.println(" ");
        System.out.println("------APRESENTACAO------");
        System.out.println("SOMA DOS ELEMENTOS DA DIAGONAL PRINCIPAL:");
        soma = 0;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                if ((i== 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j ==2) || (i == 3 && j == 3) && (i == 4 && j == 4)&& (i == 5 && j == 5)) {
                    soma += mat[i][j];
                }
            }
        }
        System.out.println("Resultado: " + soma);
    }
}
