package dcc603.veiculos-policiais;

import java.util.ArrayList;

public class DepartamentoPolicial {
  private Veiculo[] veiculos;
  private Policial[] policiais;
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

  public Veiculo[] getVeiculosDisponiveisByTipo(String tipoVeiculo) {
    var veiculosTipo = new ArrayList<Veiculo>();
    var veiculosDisponiveis = this.getVeiculosDisponiveis();

    for (Veiculo veiculo: veiculosDisponiveis) {
      if (veiculo.getTipoVeiculo() == tipoVeiculo) {
        veiculosTipo.add(veiculo);
      }
    }

    return veiculosTipo;
  }
}
