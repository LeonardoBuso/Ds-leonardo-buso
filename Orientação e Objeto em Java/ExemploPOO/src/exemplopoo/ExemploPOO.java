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
// Classe Carro    }
       public class Carro {
       private String modelo; // atributo de carro
       private String cor;  // atributo de carro
       private String marca;  // atributo de carro
      
       public String getmodelo(){
           return modelo;
       }
       
       public void setmodelo(String modelo){
           this.modelo = modelo;
       }
       
       public String getcor(){
           return cor;
       }
       
       public void setcor(String cor) {
           this.cor = cor;
       }
       
        public String getmarca(){
           return marca;
       }
       
       public void setmarca(String marca) {
           this.marca = marca;
       }
       
       public void acelerar(){
           System.out.println("O carro acelerou");  
       }
       public void freiar(){
           System.out.println("O carro freiou");
       }
    }

// Classe Peças
        public class Peças extends Carro {
        private String carburador; // atributos da classe peças que é uma "filha" da classe carro
        private String lanterna;
        private String volante;

       public String getcarburador(){
           return carburador;
       }
       
       public void setcarburador(String carburador){
           this.modelo = modelo;
       }
       
       public String getcor(){
           return cor;
       }
       
       public void setcor(String cor) {
           this.cor = cor;
       }
       
        public String getmarca(){
           return marca;
       }
       
       public void setmarca(String marca) {
           this.marca = marca;
       }
        
        public void print() { // imprime todos os dados referentes aos seus devidos atributos
            System.out.println(getModelo() + " " + getCor() + " " + getMarca() + " " + carburador + " " + lanterna + " " + volante);
        }
    }

}
