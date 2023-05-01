import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoProxyTest {
    @BeforeEach
    void setUp() {
        VeiculoRepository.addVeiculo(new Veiculo("123ABC", "Lancer X", "Mitsubishi"));
        VeiculoRepository.addVeiculo(new Veiculo("CBA321", "Marea Turbo", "Fiat"));
    }

    @Test
    void deveRetornarDadosVeiculo() {
        var veiculo = new VeiculoProxy("123ABC");
        assertEquals(veiculo.obterDados(), "Modelo: Lancer X, Montadora: Mitsubishi");
    }

    @Test
    void deveAbrirVeiculo() {
        var chave = new Chave("CBA321");
        var veiculo = new VeiculoProxy("CBA321");

        assertTrue(veiculo.abrir(chave));
    }

    @Test
    void naoDeveAbrirVeiculo() {
        var chave = new Chave("123ABC");
        var veiculo = new VeiculoProxy("CBA321");
        assertFalse(veiculo.abrir(chave));
    }
}
