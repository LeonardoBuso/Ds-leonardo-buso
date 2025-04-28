/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author CAMARGO
 */
public class Exercício3 {
    public static void main (String[] args){
    int idades[] = {22, 33, 52, 34, 74, 24, 12, 13};
    int menoridade = idades[0];
    
    for (int idade : idades) {
      if (menoridade > idade) {
          
          menoridade = idade;
      }  
    }
    
        System.out.println("O menor número é: "+menoridade);
  } 
}
