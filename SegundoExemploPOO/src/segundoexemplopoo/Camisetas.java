/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoexemplopoo;

/**
 *
 * @author Usuário
 */
public class Camisetas extends Roupas {
    private String modelagem;
    private String cor;
    
    public Camisetas(String marca, double valor, String tamanho) {
        super(marca, valor, tamanho);        
    }
    
    public String getmodelagem(){
        return modelagem;
    }
    
    public void setmodelagem(String modelagem){
        this.modelagem = "Moletom";
    }
    
    public String getcor(){
        return cor;
    }
    
    public void setcor(String cor){
        this.cor = "Azul";
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("A cor da camiseta é: " + cor);
        System.out.println("A modelagem é: " + modelagem);
    }
}
