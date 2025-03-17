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
public class Exercicio14 
{
    public static void main (String[] args) 
    {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Entre com o seu nome");
        String Nome = teclado.nextLine();
        System.out.println("Entre com a sua altura");
        float Altura = teclado.nextInt();
        System.out.println("Entre com seu sexo M ou F");
        String Sexo = teclado.nextLine();
        float PesoIdealM = (72.7f * Altura/100)-58;
        float PesoIdealF = (62.1f * Altura/100)-44.7f;
        if (Sexo == "M" || Sexo == "m"){
            System.out.println("Seu peso ideal é "+PesoIdealM);
        }
        else{
            System.out.println("Seu peso ideal é "+PesoIdealF);
        }
    }
    
}
