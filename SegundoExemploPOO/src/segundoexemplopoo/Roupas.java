/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoexemplopoo;

/**
 *
 * @author Usuário
 */
public class Roupas {
    private String marca;
    private double valor;
    private String tamanho;
    
    public Roupas(String marca, double valor, String tamanho) {
        this.marca = marca;
        this.valor = valor;
        this.tamanho = tamanho;
    }
    
    public String getmarca(){
        return marca;
    }
    
    public void setmarca(String marca){
        this.marca = marca;
    }
    
    public double getvalor(){
        return valor;
    }
    
    public void setvalor(double valor) {
        this.valor = valor;
    }
    
    public String gettamanho(){
        return tamanho;
    }
    
    public void settamanho(String tamanho){
        this.tamanho = tamanho;
    }
    
    public void vestir(){
        System.out.println("A pessoa vestiu-se ");
    }
    public void comprar(){
        System.out.println("A pessoa comprou");
    }
    

}

