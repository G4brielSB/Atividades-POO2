

public class Calculadora {
    private int primeiroValor;
    private int segundoValor;
    private int soma;
    private int multiplicacao;


    private void atualizarSoma() {
        soma = primeiroValor + segundoValor;
    }

    private void atualizarMultiplicacao(){
        multiplicacao = primeiroValor * segundoValor;
    }

    public int getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValorSoma(int primeiroValor) {
        this.primeiroValor = primeiroValor;
        atualizarSoma();
    }

    public void setPrimeiroValorMultiplicacao(int primeiroValor) {
        this.primeiroValor = primeiroValor;
        atualizarMultiplicacao();
    }


    public int getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValorSoma(int segundoValor) {
        this.segundoValor = segundoValor;
        atualizarSoma();
    }

    public void setSegundoValorMultiplicacao(int segundoValor) {
        this.segundoValor = segundoValor;
        atualizarMultiplicacao();
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao(int multiplicacao) {
        this.multiplicacao = multiplicacao;
    }    

}
