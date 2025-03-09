/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercíciosaulajava;

/**
 *
 * @author Usuário
 */
public class Exercicio9 {
     public static void main(String[] args) {
         int Nulos = 2000;
         int Brancos = 2000;
         int Validos = 6000;
         int VotosTotais = Nulos + Brancos + Validos;
         
         float Porcentagem_Votos_Nulos = Nulos*100/VotosTotais;
         float Porcentagem_Votos_Brancos = Brancos*100/VotosTotais;
         float Porcentagem_Votos_Validos = Validos*100/VotosTotais;
         
         System.out.println("Total de Votos:"+VotosTotais);
         System.out.println("Votos validos: "+Validos+"("+Porcentagem_Votos_Validos+"%)");
         System.out.println("Votos nulos: "+Nulos+"("+Porcentagem_Votos_Nulos+"%)");
         System.out.println("Votos brancos: "+Brancos+"("+Porcentagem_Votos_Brancos+"%)");
     
     }
}
