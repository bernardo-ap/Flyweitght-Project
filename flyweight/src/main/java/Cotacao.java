public class Cotacao {
    private String nome;
    private Moeda moeda;

    public Cotacao(String nome, Moeda moeda){
        this.nome = nome;
        this.moeda = moeda;
    }

    public String obterCotacao(){
        return "Cotacao{" +
                "nome='" + this.nome + '\'' +
                "siglaMoeda='" + moeda.getSigla() + '\'' +
                "valorMoeda='" + moeda.getValor() + '\'' +
                '}';
    }
}
