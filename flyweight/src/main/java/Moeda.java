public class Moeda {

    private String sigla;
    private float valor;

    public Moeda(String sigla,float valor){
        this.sigla = sigla;
        this.valor = valor;
    }

    public String getSigla() {
        return sigla;
    }

    public float getValor() {
        return valor;
    }

}
