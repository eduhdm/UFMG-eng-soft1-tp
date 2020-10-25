package dcc603.veiculos-policiais;

import enums.TipoVeiculo;
import enums.StatusVeiculo;

public class Veiculo {
  private String tipoVeiculo = TipoVeiculo.CARRO;
  private String statusVeiculo = StatusVeiculo.DISPONIVEL;
  private String localizacaoVeiculo;
  private Policial policial;
  private Incidente incidenteAtual; 

  public Veiculo(String tipoVeiculo, String statusVeiculo, String localizacaoVeiculo) {
    this.tipoVeiculo = tipoVeiculo;
    this.statusVeiculo = statusVeiculo;
    this.localizacaoVeiculo = localizacaoVeiculo;
  }
  public void responderChamada(Incidente incidente) {
	  this.statusVeiculo = StatusVeiculo.OCUPADO;
	  this.localizacaoVeiculo = incidente.getLocalizacao(); 
	  this.incidenteAtual = incidente; 
  }

  public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
    this.tipoVeiculo = tipoVeiculo;
  }

  public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
    this.statusVeiculo = statusVeiculo;
  }

  public void setLocalizacaoVeiculo(String localizacaoVeiculo) {
    this.localizacaoVeiculo = localizacaoVeiculo;
  }
  public void setPiolicial(Policial policial) {
	this.policial = policial; 
  }

  public TipoVeiculo getTipoVeiculo() {
    return this.tipoVeiculo;
  }

  public StatusVeiculo getStatusVeiculo() {
    return this.statusVeiculo;
  }

  public String getLocalizacaoVeiculo() {
    return this.localizacaoVeiculo;
  }
  
  public Policial getPolicial() {
	return this.policial;  
  }

  public boolean isDisponivel() {
    return this.statusVeiculo == StatusVeiculo.DISPONIVEL;
  }
}