package dcc603.veiculos-policiais.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.veiculosPoliciais.Atendente;

public class IncidenteTest {

  @Test
  public void testGetStatus() {
    Atendente atendente = new Atendente();
    atendente.setStatus('Em chamada');
    assertTrue(atendente.getStatus() == 'Em chamada');
  }

  @Test
  public void testSetStatus() {
    Atendente atendente = new Atendente();
    atendente.setStatus('Disponivel');
    assertTrue(atendente.getStatus() == 'Disponivel');
  }
  
}
