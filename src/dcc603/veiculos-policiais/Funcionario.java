package dcc603.veiculos-policiais;

import enums.tipoFuncionario;

public class Funcionario {
  protected String tipoFuncionario;
  protected String nome;
  protected String nomeDepartamento;
  protected String id;

  public Funcionario(
    String nome,
    String nomeDepartamento,
    String id,
    String tipoFuncionario,
  ) {
    this.nome = nome;
    this.nomeDepartamento = nomeDepartamento;
    this.id = id;
    this.tipoFuncionario = tipoFuncionario;
  }


  public String getNome() {
    return this.nome;
  }

  public String getNomeDepartamento() {
    return this.nomeDepartamento;
  }

  public String getId() {
    return this.id;
  }

  public void setTipoFuncionario(String tipoFuncionario) {
    this.tipoFuncionario = tipoFuncionario;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNomeDepartamento(String nomeDepartamento) {
    this.nomeDepartamento = nomeDepartamento;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setTipoFuncionario(String tipoFuncionario) {
    this.tipoFuncionario = tipoFuncionario;
  }
}