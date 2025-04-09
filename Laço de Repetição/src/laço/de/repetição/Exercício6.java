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
public class Exercício6 {
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    int numero = teclado.nextInt();
    
    for (int i = 1; i <= numero; i++){
        System.out.println("O seu número é:\n" +i);
    }
   }
}
