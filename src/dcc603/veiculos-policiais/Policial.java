package dcc603.veiculos-policiais;

import enums.StatusPolicial;

public class Policial extends Funcionario {
  private String statusPolicial;
  private Veiculo veiculo;


  public Policial(Funcionario funcionario, Veiculo veiculo) {
    super(funcionario.nome, funcionario.nomeDepartamento, funcionario.id, TipoFuncionario.POLICIAL);

    this.statusPolicial = StatusPolicial.DISPONIVEL;
    this.veiculo = veiculo;
  }

  public String emitirRelatorio(Incidente incidente, String statusFinal, String descricao) {
	  // processa todas as informa��es do ocorrido e retorna um relatorio final; 
	  String relatorio = "localizacao, resolucao, descricao"; 
	  
	  return relatorio;
  }
  
  public void atualizarLocalizacao() {
	  // atualiza a posi��o atual do policial, atualizando tamb�m seu atributo
  }
  
  public boolean confirmarResolucao(Incidente incidente) {
	  // policial confirma resolucao do incidente
	  return true;
  }
  
  public String getStatusPolicial() {
    return this.statusPolicial;
  }

  public void setStatusPolicial(String statusPolicial) {
    this.statusPolicial = statusPolicial;
  }

  public boolean fazerPolicialDisponivel() {
    return this.statusPolicial == StatusPolicial.DISPONIVEL;
  }
}