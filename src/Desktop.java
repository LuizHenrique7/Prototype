public class Desktop implements Cloneable {

    private String processador;
    private PlacaVideo placaVideo;
    private String memoriaRAM;
    private String placaMae;
    private String armazenamento;
    private String fonte;


    public Desktop(String processador, PlacaVideo placaVideo, String memoriaRAM, String placaMae, String armazenamento, String fonte) {
        this.processador = processador;
        this.placaVideo = placaVideo;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = placaMae;
        this.armazenamento = armazenamento;
        this.fonte = fonte;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setPlacaVideo(PlacaVideo placaVideo) {
        this.placaVideo = placaVideo;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getProcessador() {
        return processador;
    }

    public PlacaVideo getPlacaVideo() {
        return placaVideo;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getFonte() {
        return fonte;
    }



    @Override
    public Desktop clone() throws CloneNotSupportedException {
        Desktop desktopClone = (Desktop) super.clone();
        desktopClone.placaVideo = (PlacaVideo) desktopClone.placaVideo.clone();
        return desktopClone;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "processador='" + processador + '\'' +
                ", placaVideo=" + placaVideo.toString() + // chamada ao método toString()
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", placaMae='" + placaMae + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                ", fonte='" + fonte + '\'' +
                '}';
    }
}
