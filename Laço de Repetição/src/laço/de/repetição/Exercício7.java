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
public class Exercício7 {
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite um número maior que zero:");
    int numero = teclado.nextInt();
    
    while (numero == 0){
        System.out.println("Número inválido! Digite um número maior que zero:");
        numero = teclado.nextInt();
    }
    
    for (int i = 1; i <= numero; i++){
        System.out.println("Os seus números são:\n" +i);
    }
  }
}
