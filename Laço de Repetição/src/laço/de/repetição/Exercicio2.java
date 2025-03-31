/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laço.de.repetição;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exercicio2 {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        char novocalculo;
        do {
            // Entrada da primeira nota
            System.out.println("Digite a primeira nota: ");
            double nota1 = teclado.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("NOTA INVÁLIDA! Digite a primeira nota (0 a 10): ");
                nota1 = teclado.nextDouble();
            }

            // Entrada da segunda nota
            System.out.println("Digite a segunda nota: ");
            double nota2 = teclado.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("NOTA INVÁLIDA! Digite a segunda nota (0 a 10): ");
                nota2 = teclado.nextDouble();
            }

            // Cálculo da média
            double soma = nota1 + nota2;
            double media = soma / 2;
            System.out.printf("A média das notas é: %.2f%n", media);

            // Pergunta se deseja continuar
            System.out.println("Deseja fazer um novo cálculo? (S/N)");
            novocalculo = teclado.next().toUpperCase().charAt(0);

        } while (novocalculo == 'S'); // Repete se o usuário digitar 'S'

        teclado.close();
        
     }
    }

