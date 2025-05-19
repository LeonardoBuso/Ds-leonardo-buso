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
        Camisetas Camisetas = new Camisetas("Nike", 50.00, "M");
        Calças Calças = new Calças("Nike", 100.00, "M");
        Blusas_de_Frio Blusas_de_Frio = new Blusas_de_Frio("Nike", 200.00, "M");
        Meias Meias = new Meias("Nike", 30.00, "M");
        
        Camisetas.exibirDetalhes();
        Calças.exibirDetalhes();
        Blusas_de_Frio.exibirDetalhes();
        Meias.exibirDetalhes();
        
        
    }
}
