import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
class BolsaTest {

    @Test
    void deveRetornarCotacoes() {
        Bolsa bolsa = new Bolsa();
        bolsa.adicionarCotacao("Cotacao1", "BRL", 10);
        bolsa.adicionarCotacao("Cotacao2", "USD", 50);
        bolsa.adicionarCotacao("Cotacao3", "AUD", 48);
        bolsa.adicionarCotacao("Cotacao4", "JPY", 200);

        List<String> saida = Arrays.asList(
                "Cotacao{nome='Cotacao1'siglaMoeda='BRL'valorMoeda='10.0'}",
                "Cotacao{nome='Cotacao2'siglaMoeda='USD'valorMoeda='50.0'}",
                "Cotacao{nome='Cotacao3'siglaMoeda='AUD'valorMoeda='48.0'}",
                "Cotacao{nome='Cotacao4'siglaMoeda='JPY'valorMoeda='200.0'}");

        assertEquals(saida, bolsa.obterCotacoes());
    }

    @Test
    void deveRetornarTotalMoedas() {
        Bolsa bolsa = new Bolsa();
        bolsa.adicionarCotacao("Cotacao1", "EUR", 120);
        bolsa.adicionarCotacao("Cotacao2", "EUR", 120);
        bolsa.adicionarCotacao("Cotacao3", "EUR", 120);
        bolsa.adicionarCotacao("Cotacao4", "GBP", 90);

        assertEquals(2, MoedaFactory.getTotalMoedas());
    }
}