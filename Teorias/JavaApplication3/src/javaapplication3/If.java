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
public class If {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número");
        int n1 = teclado.nextInt();
        System.out.println("Digite um segundo número");
        int n2 = teclado.nextInt();
        System.out.println("Digite um terceiro número");
        int n3 = teclado.nextInt();
        if (n1 > n2 && n1 > n3){
            System.out.println("O maior número é o primeiro");
        } else if (n2 > n1 && n2 > n3){
            System.out.println("O maior núemro é o segundo");
        } else {
            System.out.println("O maior número é o terceiro");
        }
    }
}
