/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Ternário {
    public static void main(String []args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número");
        int n1 = teclado.nextInt();
        System.out.println("Digite um segundo número");
        int n2 = teclado.nextInt();
        int maior = n1>n2?n1:n2; // se n1 for maior que n2, escreva o maior (n1), se não, ecreva o maior (n2)
        System.out.println(maior);
        
    }
}
