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
public class Exercício11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        System.out.print(numero + "! = ");

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(".");
            }
        }

        System.out.println(" = " + fatorial);
        scanner.close();
    }
}



