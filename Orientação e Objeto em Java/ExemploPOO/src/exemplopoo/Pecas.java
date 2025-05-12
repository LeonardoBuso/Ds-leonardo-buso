/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplopoo;

/**
 *
 * @author Usuário
 */
public class Pecas extends Carro {
        private String carburador; // atributos da classe peças que é uma "filha" da classe carro
        private String lanterna;
        private String volante;

        public Pecas(String modelo, String cor, String marca) {
            super(modelo, cor, marca);
        }
       public String getcarburador(){
           return carburador;
       }
       
       public void setcarburador(String carburador){
           this.carburador = carburador;
       }
       
       public String getlanterna(){
           return lanterna;
       }
       
       public void setlanterna(String lanterna) {
           this.lanterna = lanterna;
       }
        
        public String getvolante(){
           return volante;
       }
       
       public void setvolante(String volante) {
           this.volante = volante;
       }
       

    }

