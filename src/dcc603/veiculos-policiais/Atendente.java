package dcc603.veiculos-policiais;

public class Atendente extends Funcionario {
  public string status;

  public String getStatus() {
    return this.status;
  }

  public String setStatus() {
    this.status = status;
  }

  public void cadastrarIncidente(
    String tipo, 
    String urgencia, 
    String localizacao,
    Array veiculosNecessarios,
    Servicos servicosDeEmegencia
  ) {
    new Incidente(tipo,
      urgencia,
      localizacao,
      veiculosNecessarios,
      servicosDeEmegencia
    );
  }

  public void alertarServicosEmergenciais(Servicos servicosDeEmegencia) {
    servicosDeEmegencia.ligarServiço();
  }

  public enum TipoStatus {
    EM_CHAMADA,
    DISPONIVEL,
  }
}
