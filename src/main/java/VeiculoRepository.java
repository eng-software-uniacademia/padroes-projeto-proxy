import java.util.HashMap;
import java.util.Map;

public class VeiculoRepository {
    private static final Map<String, Veiculo> veiculos = new HashMap<>();

    public static Veiculo getVeiculo(String chassi) {
        return veiculos.get(chassi);
    }

    public static void addVeiculo(Veiculo veiculo) {
        veiculos.put(veiculo.getChassi(), veiculo);
    }
}
