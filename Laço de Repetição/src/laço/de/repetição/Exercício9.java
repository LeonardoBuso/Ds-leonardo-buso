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
public class Exercício9 {
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Escolha um número de 1 a 10");
    int numero = teclado.nextInt();
    
    System.out.println("Tabuada do número"+numero+"é:");
    
    for (int i = 1; i <= 10; i++){
    int resultado = numero * i;
    System.out.println(numero+" x "+i+" = " +resultado);
    }
  }
}
