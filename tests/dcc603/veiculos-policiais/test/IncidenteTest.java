package dcc603.veiculos-policiais.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.veiculosPoliciais.Incidente;

public class IncidenteTest {

  @Test
  public void testGetTipo() {
    Incidente incidente = new Incidente();
    incidente.setTipo('Acidente de carro');
    assertTrue(incidente.getTipo() == 'Acidente de carro');
  }

  @Test
  public void testSetTipo() {
    Incidente incidente = new Incidente();
    incidente.setIncidente('Assalto');
    assertTrue(incidente.getIncidente() == 'Assalto');
  }

  @Test
  public void testGetUrgencia() {
    Incidente incidente = new Incidente();
    incidente.setUrgencia('BAIXA');
    assertTrue(incidente.getUrgencia() == 'BAIXA');
  }

  @Test
  public void testSetUrgencia() {
    Incidente incidente = new Incidente();
    incidente.setUrgencia('ALTA');
    assertTrue(incidente.getUrgencia() == 'ALTA');
  }
  
  @Test
  public void testGetLocalizacao() {
    Incidente incidente = new Incidente();
    incidente.setLocalizacao('Av. Afonso Pena, 423');
    assertTrue(incidente.getLocalizacao() == 'Av. Afonso Pena, 423');
  }

  @Test
  public void testSetLocalizacao() {
    Incidente incidente = new Incidente();
    incidente.setLocalizacao('Av. Carlos Luz, 321');
    assertTrue(incidente.getLocalizacao() == 'Av. Carlos Luz, 321');
  }
  
}
