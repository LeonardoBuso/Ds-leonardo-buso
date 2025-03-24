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
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("DIgite um núemro: ");
        int numero = teclado.nextInt ();
        
        while (numero <=10 )
        {
            
            System.out.println("O numero e:"+numero);
            numero++;
        }
        
        }
        
    }
    

