import java.util.ArrayList;
import java.util.List;
public class Bolsa {

    private List<Cotacao> cotacoes = new ArrayList<>();

    public void adicionarCotacao(String nomeCotacao, String siglaMoeda, float valorMoeda){
        Moeda moeda = MoedaFactory.getMoeda(siglaMoeda, valorMoeda);
        Cotacao cotacao = new Cotacao(nomeCotacao, moeda);
        cotacoes.add(cotacao);
    }

    public List<String> obterCotacoes(){
        List<String> saida = new ArrayList<String>();
        for (Cotacao cotacao: this.cotacoes){
            saida.add(cotacao.obterCotacao());
        }
        return saida;
    }
}
