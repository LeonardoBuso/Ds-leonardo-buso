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
public class Exercicio1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um numero");
            double numero1 = teclado.nextDouble();
        System.out.println("Digite um segundo numero");
            double numero2 = teclado.nextDouble();
    
        while (numero2 == 0)
        {
            System.out.println("O numero digitado tem que ser diferente de zero");
            numero2 = teclado.nextInt();
        }
        
        double divisao = numero1/numero2;
        System.out.println("A divisão dos números é: " +divisao);
    
    }
    
}
