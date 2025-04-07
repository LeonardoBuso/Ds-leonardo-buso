/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exercício3 {
        public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = teclado.nextInt();
        System.out.println("\nNúmeros pares de 1 até"+numero+":");
        for (int i = 1;i<=numero;i++){
        if (i % 2 == 0){
            System.out.println(i+"");   
        }
        }
       
        System.out.println("\n\nNúumeros ímpares de 1 até" +numero+ ":");
        for(int i = 1; i <= numero;i++){
            if (i % 2 != 0){
                System.out.println(i+"");
            }
        }  
      }   
    }

