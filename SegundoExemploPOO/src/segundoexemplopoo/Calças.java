/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoexemplopoo;

/**
 *
 * @author Usuário
 */
public class Calças extends Roupas {
    private String cor;
    private String modelagem;
    
    public Calças(String marca, double valor, String tamanho) {
        super(marca, valor, tamanho);
    }
    
    public String getcor(){
        return cor;
    }
    
    public void setcor(String cor){
        this.cor = cor;
    }
    
    public String getmodelagem(){
        return modelagem;
    }
    
    public void setmodelagem(String modelagem){
        this.modelagem = modelagem;
    }
    

}
