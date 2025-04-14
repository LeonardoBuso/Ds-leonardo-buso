/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;
import java.util.Arrays; // atalho cheio de métodos úteis para lidar com arrays de forma simples, rápida e eficiente
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exercício1 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int x [] = new int[10];
    for(int i = 0; i < x.length; i++)
    {
        System.out.println("Digite o número "+(i+1)+":");
        x[i] = teclado.nextInt();
    }
    
        System.out.println("Seus números são: "+Arrays.toString(x)); // se for inteiro é só colocar toInt
    }
}
