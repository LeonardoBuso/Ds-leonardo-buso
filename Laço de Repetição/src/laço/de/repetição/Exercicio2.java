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
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite a primeiro nota");
    int nota1 = teclado.nextInt();
    
    while (nota1 < 0 || nota1 > 10)
    {
        System.out.println("A nota é inválida, digite uma nota de 0 a 10");
        nota1 = teclado.nextInt();
    }
    System.out.println("Digite a segunda nota");
    int nota2 = teclado.nextInt();
    while (nota2 < 0 || nota2 > 10)
    {
        System.out.println("A nota é inválida, digite uma nota de 0 a 10");
        nota2 = teclado.nextInt();
    }
    
    double soma = nota1+nota2;
    double divisao = soma/2;
        System.out.println("A sua media é: " +divisao);
      
    }
    }

