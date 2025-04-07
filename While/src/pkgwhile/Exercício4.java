/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exercício4 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Quantos alunos tem na sua sala?");
        int alunos = teclado.nextInt();
        
        int contador = 1;
        double somaNotas = 0;
        
        while (contador <= alunos){
            System.out.println("Digite a nota do aluno"+contador+":");
            double nota = teclado.nextDouble();
            somaNotas += nota;
            contador ++;
        }
        
        double mediaGeral = somaNotas / alunos;
        System.out.println("A média geral da turma é" +mediaGeral);
    }
}
