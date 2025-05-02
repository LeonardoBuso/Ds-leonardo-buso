/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int constante = 3;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= constante;
            System.out.println(numeros[i]);
        }
    }
}

