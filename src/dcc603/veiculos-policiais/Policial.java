package dcc603.veiculos-policiais;

public class Policial extends Funcionario {
  private String statusPolicial = StatusPolicial.DISPONIVEL;

  public Policial(Funcionario funcionario) {
    super(funcionario.nome, funcionario.nomeDepartamento, funcionario.id, TipoFuncionario.POLICIAL);

    this.tipoVeiculo = tipoVeiculo;
    this.statusVeiculo = statusVeiculo;
    this.localizacaoVeiculo = localizacaoVeiculo;
  }

  public String getStatusPolicial() {
    this.statusPolicial;
  }

  public void setStatusPolicial(String statusPolicial) {
    this.statusPolicial = statusPolicial;
  }

  public boolean isDisponivel() {
    return this.statusPolicial == StatusPolicial.DISPONIVEL;
  }
}

public enum StatusPolicial {
  DISPONIVEL,
  ATENDENDO_CHAMADO,
  EM_FERIAS,
}
