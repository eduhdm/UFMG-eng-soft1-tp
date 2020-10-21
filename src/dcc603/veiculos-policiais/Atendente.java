package dcc603.veiculos-policiais;

public class Atendente extends Funcionario {
  public String status;

  public Atendente(Funcionario funcionario) {
    super(funcionario.nome, funcionario.nomeDepartamento, funcionario.id, TipoFuncionario.ATENDENTE);

    this.tipoVeiculo = tipoVeiculo;
    this.statusVeiculo = statusVeiculo;
    this.localizacaoVeiculo = localizacaoVeiculo;
    this.status = TipoStatus.EM_CHAMADA;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus() {
    this.status = status;
  }

  public Incidente cadastrarIncidente(
    String tipo,
    String urgencia,
    String localizacao,
    Veiculo veiculosNecessarios,
    Servico servicosDeEmegencia,
  ) {
    new Incidente (
      tipo,
      urgencia,
      localizacao,
      veiculosNecessarios,
      servicosDeEmegencia
    );
  }

  public void alertarServicosEmergenciais(Servico servicosDeEmegencia) {
    servicosDeEmegencia.ligarServiço();
  }

  public boolean isDisponivel() {
    return TipoStatus.DISPONIVEL;
  }
}

public enum TipoStatus {
  EM_CHAMADA,
  DISPONIVEL,
}
