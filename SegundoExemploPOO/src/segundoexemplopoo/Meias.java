/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoexemplopoo;

/**
 *
 * @author Usuário
 */
public class Meias extends Roupas {
    private String modelagem;
    private String cor;
    
    public Meias(String marca, double valor, String tamanho) {
        super(marca, valor, tamanho);
    }
    
    public String getmodelagem(){
        return modelagem;
    }
    
    public void setmodelagem(String modelagem){
        this.modelagem = "De lã";
    }
    
    public String getcor(){
        return cor;
    }
    
    public void setcor(String cor){
        this.cor = "Preta";
    }
      public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("A cor da meia é: " + cor);
        System.out.println("A modelagem é: " + modelagem);
    }
}
