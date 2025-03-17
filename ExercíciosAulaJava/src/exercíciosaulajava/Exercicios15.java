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
public class Exercicios15 {
    public static void main (String[] args){
         Scanner teclado = new Scanner (System.in);
         double precoAlcool = 2.90;
         double precoGasolina = 3.30;
         
         System.out.println("Digite o tipo do combustivel (A para alcool, G para gasolina):");
         char tipoCombustivel = teclado.next().toUpperCase().charAt(0);
         
         System.out.println("Digite a quantidade de Litros:");
         double litros = teclado.nextDouble();
         double precoPorLitro, desconto = 0;
         
         if (tipoCombustivel == 'A'){
             precoPorLitro = precoAlcool;
             desconto = (litros <= 20) ? 0.03 : 0.05;
            }else if (tipoCombustivel == 'G'){
                precoPorLitro = precoGasolina;
                desconto = (litros <= 20) ? 0.04 : 0.06;
            }else{
                System.out.println("Tipo do combustivel invalido");
                return;
            }
            double totalSemDesconto = litros * precoPorLitro;
            double valorDesconto = totalSemDesconto * desconto;
            double totalPagar = totalSemDesconto - valorDesconto;
         System.out.printf("Valor a ser pago: R$ %.2f%n", totalPagar);
            teclado.close();
         }
    }
   

