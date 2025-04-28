/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;
import java.util.Arrays;
/**
 *
 * @author CAMARGO
 */
public class Exercício4 {
    public static void main (String[] args){
    int numeros[] = {2,3,4,5,6,7};
    int inicio = 0;
    int fim  = numeros.length -1;
    
    while (inicio < fim) {
        int temp = numeros[inicio];
        numeros[inicio] = numeros[fim];
        numeros[fim] = temp;
        
        inicio++;
        fim--;
    }
        System.out.println(Arrays.toString(numeros));
   }
}
