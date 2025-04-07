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
public class Exercício8 {
    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);
    
        System.out.print("Digite o tamanho do lado do quadrado (1 a 20):");
        int tamanho = teclado.nextInt();
        
        if(tamanho < 1 || tamanho > 20){
            System.out.println("Tamanho inválido. Por favor digite um número de 1 a 20");
        }else{
            for(int linha = 1; linha <= tamanho; linha++){
                for(int coluna = 1; coluna <= tamanho; coluna++){
        
            if (linha == 1 || linha == tamanho || coluna == 1 || coluna == tamanho){
                System.out.print("*"); 
            }else{
                System.out.print("*");
            }
            }
            System.out.println();
        }
        }
        }
}

