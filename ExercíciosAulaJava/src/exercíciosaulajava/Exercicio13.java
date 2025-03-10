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
public class Exercicio13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Entre com o numero de carros vendidos");
        float Carros_Vendidos = teclado.nextInt();
        System.out.println("Entre com o valor total de vendas");
        float Total_Vendas = teclado.nextInt();
        System.out.println("Entre com seu salario fixo");
        float Salario = teclado.nextInt();
        System.out.println("Entre com o valor por carro vendido");
        float Valor_Carro= teclado.nextInt();
        float SomaCarros = Carros_Vendidos * Valor_Carro;
        float SomaVendas = Total_Vendas * 0.05f;
        float SomaTotal = SomaCarros + SomaVendas + Salario;
        System.out.println("O salario total e: " +SomaTotal);
        
    }
}
