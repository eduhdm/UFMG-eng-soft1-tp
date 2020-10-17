package dcc603.veiculos-policiais.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dcc603.veiculosPoliciais.Projeto;

public class ProjetoTest {
  @Test
  public void testStart(){
    // nota que eu tenho...
    Projeto projeto = new Projeto();

    // quando eu faco...
    projeto.fecharProjeto();

    // entao eu epero que aconteca...
    assertTrue("Hello world!", projeto.start());
  }
}
