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
public class Exercício7 {
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);

    System.out.println("Digite o tamanho do lado do quadrado (1 a 20): ");
    int tamanho = teclado.nextInt();
    
    if(tamanho < 1 || tamanho > 20){
        System.out.println("Tamanho inválido. Por favor, digite um número entre 1 e 20:");
    }else{
        int linha = 1;
        
        while (linha <= tamanho){
            int coluna =1;
            
            while (coluna <= tamanho){
            System.out.print("*");
            coluna++;
            }
            
            System.out.println();
            
            linha++;
        }
   }
  }
}
