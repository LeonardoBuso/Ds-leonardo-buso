/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

public class Exercicio10 {
    public static void main(String[] args) {
        int[] numeros = {5, -3, 7, -1, 9, -6, 2, -8, 0, 4};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
            System.out.println(numeros[i]);
        }
    }
}
