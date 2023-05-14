/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_Funcoes;

import java.util.Scanner;

/**
 *
 * @author ligor
 */
public class Exer02 {

    static void ordem(int[] v, char car) {

        switch (car) {
            case 'C':
                for (int j = 0; j < 10; j++) {
                    System.out.print(v[j] + " ");
                }
                break;
            case 'I':
                int k;
                k = 9;
                for (int j = 0; j < 10; j++) {
                    System.out.print(v[k] + " ");
                    k--;
                }
                break;
            default:
                System.out.println("Char invalido");
                break;
        }
        //return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Digite a ordem da impressao");
        char car = scanf.nextLine().charAt(0);
        ordem(numeros, car);
        //System.out.println(ordem(numeros, car));

    }

}
