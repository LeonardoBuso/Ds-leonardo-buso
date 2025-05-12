/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplopoo;

/**
 *
 * @author Usuário
 */
public class Carro {
   // Classe Carro    
       private String modelo; // atributo de carro
       private String cor;  // atributo de carro
       private String marca;  // atributo de carro

    public Carro(String modelo, String cor, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
    }
      
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

