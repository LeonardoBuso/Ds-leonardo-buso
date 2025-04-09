/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laço.de.repetição;
import java.util.Scanner;
/**
 *
 * @author Usuário
 */
public class Exercício13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja informar? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Quantidade inválida. O número deve ser maior que zero.");
            return;
        }

        int menor = 0, maior = 0, soma = 0;

        for (int i = 1; i <= n; i++) {
            int numero;

            // Repetir até o número estar entre 0 e 1000
            while (true) {
                System.out.print("Digite o " + i + "º número (entre 0 e 1000): ");
                numero = scanner.nextInt();

                if (numero >= 0 && numero <= 1000) {
                    break;
                } else {
                    System.out.println("Número inválido. Digite um número entre 0 e 1000.");
                }
            }

            // Na primeira iteração, inicializa menor e maior
            if (i == 1) {
                menor = maior = numero;
            } else {
                if (numero < menor) {
                    menor = numero;
                }
                if (numero > maior) {
                    maior = numero;
                }
            }

            soma += numero;
        }

        System.out.println("\nResultado:");
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        scanner.close();
    }
}

