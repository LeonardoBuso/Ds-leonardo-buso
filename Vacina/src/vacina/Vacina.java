/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vacina;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Vacina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] gene = new int[N];
        for (int i = 0; i < N; i++) {
            gene[i] = sc.nextInt();
        }

        boolean repetido = false;
        for (int i = 0; i < N - 1; i++) {
            if (gene[i] == gene[N - 1]) {
                repetido = true;
                break;
            }
        }

        if (repetido) {
            System.out.println("Ainda nao e o suficiente");
        } else if (repetido) {
            System.out.println("achei");
        } else {
            System.out.println("Sumiu");
        }

        // if (gene[N-1] > 0 && 2 < gene[N-1]){
        //   System.out.println("Sumiuu");
        //} else if (gene[N-1] > 1 && 3 > gene[N-1]){
        //  System.out.println("Ainda não é o suficiente");
        //} else {
        //  System.out.println("Achei o danado");
        //}
        sc.close();
    }
}
