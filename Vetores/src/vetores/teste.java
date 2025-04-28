/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;

public class teste {
    public static void main(String[] args) {
        // Definindo o vetor
        int[] vetor = {1, 2, 3, 4, 5};

        // Invertendo a ordem dos elementos
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {
            // Troca os elementos
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            // Atualiza os índices
            inicio++;
            fim--;
        }

        // Exibindo o vetor invertido
        System.out.println(Arrays.toString(vetor));
    }
}
