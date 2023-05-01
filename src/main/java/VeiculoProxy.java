public class VeiculoProxy implements IVeiculo {
    private Veiculo veiculo;
    private final String chassi;

    public VeiculoProxy(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public boolean abrir(Chave chave) {
        if (this.veiculo == null) {
            this.veiculo = new Veiculo(this.chassi);
        }

        return this.veiculo.getChassi().equals(chave.getCodigo());
    }

    @Override
    public String obterDados() {
        if (this.veiculo == null) {
            this.veiculo = new Veiculo(this.chassi);
        }
        return this.veiculo.obterDados();
    }
}
