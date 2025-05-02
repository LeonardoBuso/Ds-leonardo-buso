/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;
public class Exercicio14 {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 7, 1, 6, 3, 8, 4, 9, 0};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 5) {
                numeros[i] = 5;
            }
            System.out.println(numeros[i]);
        }
    }
}
