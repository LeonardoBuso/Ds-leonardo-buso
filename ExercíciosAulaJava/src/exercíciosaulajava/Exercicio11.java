/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercíciosaulajava;
import java.util.Scanner;


/**
 *
 * @author CAMARGO
 */
public class Exercicio11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Entre com sua idade em anos");
        int IdadeAnos = teclado.nextInt();
        System.out.println("Entre com sua idade em meses");
        int IdadeMes = teclado.nextInt();
        System.out.println("Entre com sua idade em dias");
        int IdadeDia = teclado.nextInt();
        
        int SomaAnos = IdadeAnos*365;
        int SomaMeses = IdadeMes*30;
        int SomaTotal = SomaAnos+SomaMeses+IdadeDia;
        System.out.println("Sua idade em dias é: " +SomaTotal);
       
        
    
       
    }
}
