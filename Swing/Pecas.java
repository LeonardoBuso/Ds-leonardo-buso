public class Pecas extends Carro {
    private String carburador;
    private String lanterna;
    private String volante;

    public Pecas(String modelo, String cor, String marca) {
        super(modelo, cor, marca);
    }

    public String getCarburador() {
        return carburador;
    }

    public void setCarburador(String carburador) {
        this.carburador = carburador;
    }

    public String getLanterna() {
        return lanterna;
    }

    public void setLanterna(String lanterna) {
        this.lanterna = lanterna;
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }
}

