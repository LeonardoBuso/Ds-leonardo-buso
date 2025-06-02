public class Carro {
    // Atributos privados
    private String modelo;
    private String cor;
    private String marca;

    // Construtor
    public Carro(String modelo, String cor, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Métodos de ação (simples exemplo)
    public String acelerar() {
        return "O carro está acelerando.";
    }

    public String frear() {
        return "O carro está freiando.";
    }
}

