/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        double media = soma / (double) numeros.length;
        System.out.println("Média: " + media);
    }
}

