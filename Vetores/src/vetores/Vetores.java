/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Vetores {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        String nome[] = new String[4];
        String sobrenome[] = new String[4];
        
        for (int i = 0; i < nome.length; i++)
        {
            System.out.println("Digite o nome "+(i+1)+":");
            nome[i] = teclado.nextLine();
        }
        
        for (int j = 0; j < sobrenome.length; j++)
        {
            System.out.println("Digite o sobrenome "+(j+1)+":");
            sobrenome[j] = teclado.nextLine();
        }
        
        System.out.println("Seu nome completos são: ");
        for (int z = 0; z < nome.length; z++)
        {
            System.out.println(nome[z]+" "+sobrenome[z]);
        }
        
        teclado.close();
        
        
  }   
}
