package dcc603.veiculos-policiais;

import enums.TipoStatus;

public class Atendente extends Funcionario {
  private DepartamentoPolicial departamento;
  public String status;

  public Atendente(Funcionario funcionario, DepartamentoPolicial departamento) {
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

  public boolean receberChamado( Chamado chamado) {  
    String tipo = chamado.getTipo();
    String urgencia = chamado.getUrgencia();
    String localizacao = chamado.getLocalizacao();	    
    Servico servicosDeEmegencia = new Servico();
      
    try {	  
      Veiculo veiculoNecessario = calcularVeiculoProximo(localizacao, tipo);  
      Incidente novoIncidente = cadastrarIncidente(tipo, urgencia, localizacao, veiculoNecessario, servicosDeEmergencia);  
      alertarServicosEmergenciais(servicosDeEmegencia);
      return chamado.emitirChamado(novoIncidente);
        
      } catch (Exception e) {
        e.printStackTrace();
      }
      return chamado;
    }
    
    // retorna o melhor veiculo para responder a chamada
    public calcularVeiculoProximo(String localizacao, String tipo) {
        veiculoNecessario = departamento.buscarVeiculoNecessario(localizacao, tipo);
        
        return veiculoNecessario;
    }
  
  public Incidente cadastrarIncidente(
    String tipo,
    String urgencia,
    String localizacao,
    Veiculo veiculosNecessarios,
    Servico servicosDeEmegencia,
  ) {
    Incidente incidente = new Incidente (
      tipo,
      urgencia,
      localizacao,
      veiculosNecessarios,
      servicosDeEmegencia
    );
    
    boolean statusSalvamento = salvarIncidente(incidente);
    
    if(!statusSalvamento) {
    	throw new Exception("Problema ao salvar incidente no banco");
    }
    
    return incidente;
  }

  //simula o salvamento do Incidente no banco e retorna o status
  private boolean salvarIncidente(Incidente incidente) {
    if (incidente) {
    return true;
    }
  return false;
 }

  public void alertarServicosEmergenciais(Servico servicosDeEmegencia) {
    servicosDeEmegencia.ligarServico();
  }

  public boolean isDisponivel() {
    return TipoStatus.DISPONIVEL;
  }
}
