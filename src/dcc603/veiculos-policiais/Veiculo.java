package dcc603.veiculos-policiais;

public class Veiculo {
  private string tipoVeiculo = TipoVeiculo.CARRO;
  private string statusVeiculo = StatusVeiculo.DISPONIVEL;
  private string localizacaoVeiculo;

  public Veiculo(String tipoVeiculo, String statusVeiculo, String localizacaoVeiculo) {
    this.tipoVeiculo = tipoVeiculo;
    this.statusVeiculo = statusVeiculo;
    this.localizacaoVeiculo = localizacaoVeiculo;
  }

  public void setTipoVeiculo(String tipoVeiculo) {
    this.tipoVeiculo = tipoVeiculo;
  }

  public void setStatusVeiculo(String statusVeiculo) {
    this.statusVeiculo = statusVeiculo;
  }

  public void setLocalizacaoVeiculo(String localizacaoVeiculo) {
    this.localizacaoVeiculo = localizacaoVeiculo;
  }

  public String setTipoVeiculo() {
    return this.tipoVeiculo;
  }

  public String setStatusVeiculo() {
    return this.statusVeiculo;
  }

  public String setLocalizacaoVeiculo() {
    return this.localizacaoVeiculo;
  }

  public boolean isDisponivel() {
    return this.statusVeiculo == StatusVeiculo.DISPONIVEL;
  }
}

public enum StatusVeiculo {
  DISPONIVEL,
  OCUPADO,
  QUEBRADO,
  EM_MANUTENCAO,
}

public enum TipoVeiculo {
  CARRO,
  CARRO_SEDA,
  CARRO_SUV,
  CAMINHONETE,
  ONIBUS,
  MOTOCICLETA,
}
