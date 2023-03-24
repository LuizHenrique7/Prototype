public class PlacaVideo implements Cloneable {
    private String marca;
    private String modelo;
    private String memoria;


    public PlacaVideo(String marca, String modelo, String memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PlacaVideo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", memoria='" + memoria + '\'' +
                '}';
    }



}
