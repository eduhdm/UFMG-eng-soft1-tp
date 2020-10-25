package dcc603.veiculos-policiais.test;

import static org.junit.Assert.*;

import org.junit.Test;
import dcc603.veiculosPoliciais.Chamado;
import dcc603.veiculosPoliciais.Atendente;
import dcc603.veiculosPoliciais.Incidente;

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

  @Test
  public void testReceberChamadoEmAndamento() {
    // Arrange
    Chamado chamado = new Chamado();
    Atendente atendente = new Atendente();

    // Act
    String retorno = atendente.receberChamado(chamado);

    // Assert
    assertTrue(retorno == "Em andamento");
  }

  @Test
  public void testReceberChamadoFalha() {
    // Arrange
    Chamado chamado = new Chamado();
    Atendente atendente = new Atendente();

    // Act
    String retorno = atendente.receberChamado(chamado);

    // Assert
    assertFalse(retorno == "Em andamento");
  }

  @Test
  public void testsalvarIncidenteSalvo() {
    // Arrange
    Atendente atendente = new Atendente();
    Incidente incidente = new Incidente();

    // Act
    String retorno = atendente.salvarIncidente(incidente);

    // Assert
    assertTrue(retorno);
  }

  @Test
  public void testsalvarIncidenteFalhou() {
    // Arrange
    Atendente atendente = new Atendente();
    Incidente incidente = new Incidente();

    // Act
    String retorno = atendente.salvarIncidente(incidente);

    // Assert
    assertFalse(retorno);
  }
}
