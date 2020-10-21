package dcc603.veiculos-policiais;

import java.util.ArrayList;

public class CentralDeAtendimento {
  private Atendente[] atendentes;
  private DepartamentoPolicial[] departamentos;

  public CentralDeAtendimento(
    Atendente[] atendentes,
    DepartamentoPolicial[] departamentos,
  ) {
    this.atendentes = atendentes;
    this.departamentos = departamentos;
  }

  public Veiculo[] getAtendentes() {
    return this.veiculos;
  }

  public DepartamentoPolicial[] getDepartamentoPolicais() {
    return this.departamentos;
  }

  public void setAtendentes(Atendentes[] atendentes) {
    this.atendentes = atendentes;
  }

  public void setDepartamentos(DepartamentoPolicial[] departamentos) {
    this.departamentos = departamentos;
  }

  public Atendente[] getAtendentesDisponiveis() {
    var atendentesDisponiveis = new ArrayList<Atendente>();

    for (Atendete atendente: this.atendentes) {
      if (atendente.isDisponivel()) {
        atendentesDisponiveis.add(veiculo);
      }
    }

    return atendentesDisponiveis;
  }

  public alocarChamado(Chamado chamado) {
    var atendentesDisponiveis = getAtendentesDisponiveis();
    var atendente = atendentesDisponiveis[0];

    atendente.receberChamado(chamado);
  }
}
