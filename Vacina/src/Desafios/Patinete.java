/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafios;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Usuário
 */
public class Patinete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê as duas listas de notas
        int[] notas1 = new int[4];
        int[] notas2 = new int[4];

        // Leitura do primeiro conjunto de notas
        for (int i = 0; i < 4; i++) {
            notas1[i] = sc.nextInt();
        }

        // Leitura do segundo conjunto de notas
        for (int i = 0; i < 4; i++) {
            notas2[i] = sc.nextInt();
        }

        // Junta os dois arrays
        int[] todasNotas = new int[8];
        System.arraycopy(notas1, 0, todasNotas, 0, 4);
        System.arraycopy(notas2, 0, todasNotas, 4, 4);

        // Ordena o array
        Arrays.sort(todasNotas);

        // Calcula a média (arredondando para baixo)
        int soma = 0;
        for (int nota : todasNotas) {
            soma += nota;
        }
        int media = soma / todasNotas.length;

        // Exibe o array e a média
        System.out.println(Arrays.toString(todasNotas));
        System.out.println(media);

        sc.close();
    }
}
