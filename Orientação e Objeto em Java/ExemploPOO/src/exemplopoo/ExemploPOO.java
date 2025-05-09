/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopoo;

/**
 *
 * @author Usuário
 */
public class ExemploPOO {
    
    public static void main (String[] args){  // a main é necessária para executar o código e para que os dados possam corresponder aos seus devidos atributos.
        Peças meu_carro = new Peças ("Nivus", "Cinza", "Volkswagen", "Carburador-xx", "Farol", "Esportivo");
        meu_carro.print();
    }  
}
// Classe Carro    }
    class Carro {
       private String modelo; // atributo de carro
       private String cor;  // atributo de carro
       private String marca;  // atributo de carro
       
       Carro(String modelo, String cor, String marca) {
           this.modelo = modelo; // mostra o valor do atributo
           this.cor = cor;
           this.marca = marca;  
       }
       
       public String getModelo() { // aceesa pelo get o valor  do medelo desejado e retorna
           return modelo;
       }
       
       public String getCor() {
           return cor;
       }
       
       public String getMarca() {
           return marca;
       }
       
    }
// Classe Peças
    class Peças extends Carro {
        private String carburador; // atributos da classe peças que é uma "filha" da classe carro
        private String lanterna;
        private String volante;

        public Peças(String modelo, String cor, String marca, String carburador, String lanterna, String volante) {
            super(modelo, cor, marca); // chama os valores da "mãe" para poder usá-los através do "super"
            this.carburador = carburador; // valor dos atributos
            this.lanterna = lanterna;
            this.volante = volante;
        }
        
        public void print() { // imprime todos os dados referentes aos seus devidos atributos
            System.out.println(getModelo() + " " + getCor() + " " + getMarca() + " " + carburador + " " + lanterna + " " + volante);
        }
    }

