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
public class Exercício6 {
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
        System.out.println("Escreva 10 números");
        int contador = 1;
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;
        
        while (contador <= 10){
            System.out.println("Digite o número"+contador+":");
        
            int numero = teclado.nextInt();
            
            if (numero > maior){
                segundoMaior = maior;
                maior = numero;
            }else if (numero >segundoMaior){
                segundoMaior = numero;
            }
            
            contador++;
        }
        System.out.println("O maior número é:"+maior);
        System.out.println("O segundo maior é:"+segundoMaior);
    }
}
