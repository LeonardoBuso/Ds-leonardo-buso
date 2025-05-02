/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 3, 10, 7, 1, 6, 4, 2, 9, 11, 13, 12, 14, 15, 16, 17, 18, 19, 20};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número a ser buscado: ");
        int busca = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}

