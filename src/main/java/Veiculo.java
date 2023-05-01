public class Veiculo implements IVeiculo {
    private String chassi;
    private String modelo;
    private String montadora;

    public Veiculo(String codigoChave, String modelo, String montadora) {
        this.chassi = codigoChave;
        this.modelo = modelo;
        this.montadora = montadora;
    }

    public Veiculo(String chassi) {
        this.chassi = chassi;
        var veiculo = VeiculoRepository.getVeiculo(chassi);
        this.modelo = veiculo.getModelo();
        this.montadora = veiculo.getMontadora();
    }

    public String getChassi() {
        return chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    @Override
    public boolean abrir(Chave chave) {
        return true;
    }

    @Override
    public String obterDados() {
        return "Modelo: " + modelo + ", Montadora: " + montadora;
    }
}
