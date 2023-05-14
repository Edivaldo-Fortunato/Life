/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ligor
 */
public class Exer01 {

    static float x(float[] v) {
        float resultado = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                System.out.println(resultado);
                resultado += v[i] * v[j];
            }

        }
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float[] numeros = {4, 2};
        System.out.println(x(numeros));

    }

}
