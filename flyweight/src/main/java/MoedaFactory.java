import java.util.HashMap;
import java.util.Map;

public class MoedaFactory {

    private static Map<String, Moeda> moedas = new HashMap<>();

    public static Moeda getMoeda(String sigla, float valor) {
        Moeda moeda = moedas.get(sigla);
        if (moeda == null) {
            moeda = new Moeda(sigla, valor);
            moedas.put(sigla, moeda);
        }
        return moeda;
    }

    public static int getTotalMoedas() {
        return moedas.size();
    }
}
