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
public class Exercício12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja informar? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Quantidade inválida. O número deve ser maior que zero.");
            return;
        }

        int menor, maior, soma = 0;

        System.out.print("Digite o 1º número: ");
        int numero = scanner.nextInt();
        menor = maior = numero;
        soma += numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
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
  
