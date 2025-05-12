/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplopoo;

/**
 *
 * @author CAMARGO
 */
public class Main {
        public static void main (String[] args)  {  // a main é necessária para executar o código e para que os dados possam corresponder aos seus devidos atributos.
        Pecas meuCarro = new Pecas("Nivus", "Cinza", "Volkswagen");
   
        meuCarro.setcarburador("Carburador-X10");
        meuCarro.setlanterna("Farol");
        meuCarro.setvolante("Esportivo");

        System.out.println("Modelo: " + meuCarro.getmodelo());
        System.out.println("Cor: " + meuCarro.getcor());
        System.out.println("Marca: " + meuCarro.getmarca());
        System.out.println("Carburador: " + meuCarro.getcarburador());
        System.out.println("Lanterna: " + meuCarro.getlanterna());
        System.out.println("Volante: " + meuCarro.getvolante());

        meuCarro.acelerar();
        meuCarro.freiar();
        
    }        
        
}

