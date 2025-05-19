/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundoexemplopoo;

/**
 *
 * @author Usuário
 */
public class Main {
    public static void main(String[] args) {
        Roupas camiseta = new Camisetas("Nike", 50.00, "M");
        
        Roupas calca = new Calças("Nike", 100.00, "M");
        Roupas blusa = new Blusas_de_Frio("Nike", 200.00, "M");
        Roupas meias = new Meias("Nike", 30.00, "M");
        Camisetas.exibirDetalhes();
        
    }
}
