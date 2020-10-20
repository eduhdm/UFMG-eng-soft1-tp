package dcc603.veiculos-policiais;
package com.zetcode;

import java.util.ArrayList;
import java.util.List;

public class Incidente {
  public String tipo;
  public String urgencia;
  public String localizacao;
  public Veiculos veiculosNecessarios;
  public Servicos servicosDeEmergencia;

  public String getTipo() {
    return this.tipo;
  }

  public String getUrgencia() {
    return this.urgencia;
  }

  public String getLocalizacao() {
    return this.localizacao;
  }

  public Veiculos getVeiculosNecessarios() {
    return this.veiculosNecessarios;
  }

  public Veiculos getServicosDeEmergencia() {
    return this.servicosDeEmergencia;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setUrgencia(String urgencia) {
    this.urgencia = urgencia;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public void setVeiculosNecessarios(Array veiculosNecessarios) {
    this.veiculosNecessarios = veiculosNecessarios;
  }

  public void setServicosDeEmergencia(Array servicosDeEmergencia) {
    this.servicosDeEmergencia = servicosDeEmergencia;
  }

  public enum TipoUrgercia {
    BAIXA,
    MÉDIA,
    ALTA,
  }
}