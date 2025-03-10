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
public class Exercicio12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Entre com o custo de fábrica: ");
        int Custo = teclado.nextInt();
        float PorcentagemDistribuidor = 1.28f;
        float Imposto = 1.45f;
        float Valor_Com_Distribuidor = Custo*PorcentagemDistribuidor;
        float Valor_Com_Imposto = Custo*Imposto;
        float ValorTotal = (Custo + Valor_Com_Distribuidor + Valor_Com_Imposto);
        System.out.println("O custo é de: " +ValorTotal);
    }
}
