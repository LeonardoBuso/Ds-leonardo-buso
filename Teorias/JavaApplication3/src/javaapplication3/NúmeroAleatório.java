/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Usuário
 */
public class NúmeroAleatório {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double ale = Math.random(); // gera um número aleatório
       int n = (int) (5 + ale * (10 - 5)); // nada abaixo de 5 e acima de 10
        System.out.println(+n);
    }
    
}
