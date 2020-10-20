package dcc603.veiculos-policiais;

public class Servicos {
  public String nome;
  public String telefone:


  public String getNome() {
    return this.tipo;
  }

  public String getTelefone() {
    return this.urgencia;
  }

  public String setNome(String nome) {
    this.tipo = nome;
  }

  public String setTelefone(String telefone) {
    this.urgencia = telefone;
  }

  public ligarServico() {
    ligacao(this.telefone);
  }
}