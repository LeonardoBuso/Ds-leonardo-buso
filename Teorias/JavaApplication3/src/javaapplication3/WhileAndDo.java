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
public class WhileAndDo {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        String resp;
        int s = 0, n;
        do{
        System.out.println("Digite um número");
        n = teclado.nextInt();
        s += n;
        System.out.println("Quer continuar? [S/N] ");
        resp = teclado.next().toUpperCase();
        }   while (resp.equals("S"));
            System.out.println(s);
    }
}
