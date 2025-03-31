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
        int numeroFinal = teclado.nextInt();
        int numero = 1;
        while (numero < numeroFinal){
            System.out.println("Os números ímpares são:\n"+numero);
            numero += 2;
        }
        while (numero < numeroFinal){
            System.out.println("Os números pares são:\n"+numero);
            numero += 1;
        }   
    }
}
