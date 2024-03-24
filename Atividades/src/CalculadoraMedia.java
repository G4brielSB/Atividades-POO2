public class CalculadoraMedia {

    private double primeiroValor;
    private double segundoValor;
    private double terceiroValor;
    private double media;

    private void atualizarMedia(){
        media = (primeiroValor + segundoValor + terceiroValor) / 3;
    }

    public double getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(double primeiroValor) {
        this.primeiroValor = primeiroValor;
        atualizarMedia();
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
        atualizarMedia();
    }

    public double getTerceiroValor() {
        return terceiroValor;
    }

    public void setTerceiroValor(double terceiroValor) {
        this.terceiroValor = terceiroValor;
        atualizarMedia();
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
}
