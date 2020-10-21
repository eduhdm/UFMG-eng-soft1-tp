package dcc603.veiculos-policiais;
package com.zetcode;

import java.util.ArrayList;
import java.util.List;

public class Incidente {
  private String tipo;
  private String urgencia;
  private String localizacao;
  private Veiculos[] veiculosNecessarios;
  private Servico[] servicosDeEmergencia;

  public Incidente(
    String tipo,
    String urgencia,
    String localizacao,
    Veiculos[] veiculosNecessarios,
    Servico[] servicosDeEmegencia,
  ) {
    this.tipo = tipo;
    this.urgencia = urgencia;
    this.localizacao = localizacao;
    this.veiculosNecessarios = veiculosNecessarios;
    this.servicosDeEmegencia = servicosDeEmegencia;
  }

  public String getTipo() {
    return this.tipo;
  }

  public String getUrgencia() {
    return this.urgencia;
  }

  public String getLocalizacao() {
    return this.localizacao;
  }

  public Veiculos[] getVeiculosNecessarios() {
    return this.veiculosNecessarios;
  }

  public Veiculos[] getServicosDeEmergencia() {
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

  public void setVeiculosNecessarios(Veiculos[] veiculosNecessarios) {
    this.veiculosNecessarios = veiculosNecessarios;
  }

  public void setServicosDeEmergencia(Servico[] servicosDeEmergencia) {
    this.servicosDeEmergencia = servicosDeEmergencia;
  }

  public enum TipoUrgercia {
    BAIXA,
    MÉDIA,
    ALTA,
  }
}