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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
        
        double mat [][] = new double [5][3];
        int i, j;
        double maior = 0;
        
        System.out.println("-----MATRIZ-----");
        for ( i = 1; i != 5; i++) {
            for (j = 1; j != 3; j++) {
                System.out.println("Digite a altura do atleta: ");
                System.out.println("mat [" + i + "]" + "[" + j + "]:");
                mat[i][j] = ler.nextDouble();
            }
        }
        System.out.println("-----Apresentacao-----");
        for (i = 1; i != 6; i++) {
            maior = mat[i][0];
            for (j = 1; j != 4; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
            System.out.println("Maior altura: " + maior + " da equipa [" + i + "]");
        }
    }
}