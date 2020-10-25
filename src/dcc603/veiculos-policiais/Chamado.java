package dcc603.veiculos-policiais;
package com.zetcode;

import java.util.ArrayList;
import java.util.List;

public class Chamado {
  public String tipo;
  public String status; 
  public String urgencia;
  public String localizacao;
  public Veiculo veiculoResponsavel; 
  
  
  public Chamado(
    String tipo,
    String urgencia,
    String localizacao,
    Veiculo veiculoResponsavel
    ) {
	  this.localizacao = localizacao;
	  this.tipo = tipo;
	  this.urgencia = urgencia;
	  this.tipo = tipo;
	  this.status = 'ABERTO';
  }
  
  
  public String emitirChamado(Incidente incidente) {
	  veiculoResponsavel.responderChamado(incidente);
	  return this.status = "Em andamento";
  }
  
  public void setTipo(String tipo) {
	  this.tipo = tipo;
  }
  
  public void setStatus(String status) {
	  this.status = status;
  }
  
  public void setUrgencia(String urgencia) {
	  this.urgencia = urgencia;
  }
  
  public void setLocalizacao(String localizacao) {
	  this.localizacao = localizacao;
  }
  
  public void setVeiculoResponsavel(Veiculo veiculoResponsavel) {
	  this.veiculoResponsavel = veiculoResponsavel;
  }
  
  public String getTipo() {
	  return this.tipo;
  }
  
  public String getStatus() {
	  return this.status;
  }
  
  public String getUrgencia() {
	  return this.urgencia;
  }
  
  public String getLocalizacao() {
	  return this.localizacao;
  }
  
  public Veiculo getVeiculoResponsavel() {
	  return this.veiculoResponsavel;
  }
  
  
}