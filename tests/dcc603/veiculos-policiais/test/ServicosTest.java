package dcc603.construtora;
import dcc603.veiculosPoliciais.Atendente;

import static org.junit.Assert.*;
import org.junit.Test;


public class ServicosTest {
  @Test
  public void testSetNome() {
    Servico servicos = new Servico();
    servicos.setNome('Bombeiros');

    assertTrue(servicos.getNome() == 'Bombeiros');
  }

  @Test
  public void testGetNome() {
      Servico servicos = new Servico();
      servicos.setNome('SAMU');
      assertTrue(card.getNome() == 'SAMU');
  }

  @Test
  public void testSetNome() {
    Servico servicos = new Servico();
    servicos.setTelefone('911');

    assertTrue(servicos.getTelefone() == '911');
  }

  @Test
  public void testGetNome() {
      Servico servicos = new Servico();
      servicos.setTelefone('191');
      assertTrue(card.getTelefone() == '191');
  }

}