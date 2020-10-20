
package dcc603.veiculos-policiais.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.veiculosPoliciais.DepartamentoPolicial;

public class DepartamentoPolicialTest {
  @Test
  public void testGetPoliciaisDisponiveis(){
    // nota que eu tenho...
    Projeto projeto = new Projeto();

    // quando eu faco...
    projeto.fecharProjeto();

    // entao eu epero que aconteca...
    assertTrue("Hello world!", projeto.start());
  }
}