package dcc603.veiculos-policiais;

import package.external-api.ligacao;

public class Servico {
  private String nome;
  private String telefone:

  public Servico(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
  }

  public String getNome() {
    return this.tipo;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public String setNome(String nome) {
    this.tipo = nome;
  }

  public String setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void ligarServico() {
    ligacao(this.telefone);
  }
}