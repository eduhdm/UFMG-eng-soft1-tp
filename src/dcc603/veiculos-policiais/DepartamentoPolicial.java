package dcc603.veiculos-policiais;

import java.util.ArrayList;
import Policial;
import Veiculo;
import Funcionario;
import Atendente;
import enums.TipoVeiculo;

public class DepartamentoPolicial {
  private Veiculo[] veiculos;
  private Policial[] policiais;
  private Atendente[] atendentes;
  private String localizacao;
  private String nome;

  public DepartamentoPolicial(
    Veiculo[] veiculos,
    Policial[] policiais,
    String localizacao,
    String nome,
  ) {
    this.veiculos = veiculos;
    this.policiais = policiais;
    this.localizacao = localizacao;
    this.nome = nome;
  }

  public void atualizarLocalizacaoVeiculos() {
	  // atualiza a localizacao atual de todos os veiculos
  }
  
  public Veiculo buscarVeiculoNecessario(String localizacao, TipoVeiculo tipo) {
	 Veiculo[] veiculosDisponiveis = getVeiculosDisponiveisByTipo(tipo);
	 
	 Veiculo veiculoProx = buscarVeiculoMaisProximo(localizacao, veiculosDisponiveis);
	 
	 return veiculoProx;
  }
  
  private Veiculo buscarVeiculoMaisProximo(String localizacao, Veiculo[] veiculosDisponiveis) {
	  // retorna o veiculo mais proximo para atender a ocorrencia
  }

  public Veiculo[] getVeiculos() {
    return this.veiculos;
  }

  public Policial[] getPoliciais() {
    return this.policiais;
  }

  public String getLocalizacao() {
    this.localizacao;
  }

  public String getNome() {
    this.nome;
  }

  public void setVeiculos(Veiculo[] veiculos) {
    this.veiculos = veiculos;
  }

  public void setPoliciais(Policial[] policiais) {
    this.policiais = policiais;
  }

  public void setAtendentes(Atendente[] atendentes) {
    this.atendentes = atendentes;
  }

  public Atendente[] getAtendentes() {
    return this.atendentes;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Policial[] getPoliciaisDisponiveis() {
    var policiaisDisponiveis = new ArrayList<Policial>();

    for (Policial policial: this.policiais) {
      if (policial.isDisponivel()) {
        policiaisDisponiveis.add(policial);
      }
    }

    return policiaisDisponiveis;
  }

  public Veiculo[] getVeiculosDisponiveis() {
    var veiculosDisponiveis = new ArrayList<Veiculo>();

    for (Veiculo veiculo: this.veiculos) {
      if (veiculo.isDisponivel()) {
        veiculosDisponiveis.add(veiculo);
      }
    }

    return veiculosDisponiveis;
  }

  public Veiculo[] getVeiculosDisponiveisByTipo(TipoVeiculo tipoVeiculo) {
    var veiculosTipo = new ArrayList<Veiculo>();
    var veiculosDisponiveis = this.getVeiculosDisponiveis();

    for (Veiculo veiculo: veiculosDisponiveis) {
      if (veiculo.getTipoVeiculo() == tipoVeiculo) {
        veiculosTipo.add(veiculo);
      }
    }

    return veiculosTipo;
  }

  public void cadastrarPolicial(Funcionario funcionario, Veiculo veiculo) {
    Policial novoPolicial = new Policial(funcionario, veiculo);
    var policiais = getPoliciais();
    policiais.add(novoPolicial);
    setPoliciais(policiais);
  }

  public void cadastrarAtendente(Funcionario funcionario, DepartamentoPolicial departamentoPolicial) {
    Atendente atendente = new Atendente(funcionario, departamentoPolicial);
    var atendentes = getAtendentes();
    atendentes.add(atendente);
    setAtendentes(atendentes);
  }
}
