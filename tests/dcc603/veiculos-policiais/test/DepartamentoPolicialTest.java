
package dcc603.veiculos-policiais.test;

import static org.junit.Assert.*;

import org.junit.Test;
import dcc603.veiculosPoliciais.enums.TipoVeiculo;
import dcc603.veiculosPoliciais.DepartamentoPolicial;

public class DepartamentoPolicialTest {

  @Test
  public void testBuscarVeiculoNecessarioRetornaVeiculo() {
    // Arrange
    String localizacao = "teste";
    DepartamentoPolicial departamentoPolicial = new DepartamentoPolicial();
    
    // Act
    Veiculo retorno = departamentoPolicial.buscarVeiculoNecessario(localizacao, TipoVeiculo.CARRO);

    // Assert
    assertTrue(retorno != null);
  }

  @Test
  public void testBuscarVeiculoMaisProximoRetornaVeiculo() {
    // Arrange
    String localizacao = "teste";
    var veiculosDisponiveis = new ArrayList<Veiculos>() {
      new Veiculo()
    };
    DepartamentoPolicial departamentoPolicial = new DepartamentoPolicial();
    
    // Act
    Veiculo retorno = departamentoPolicial.buscarVeiculoMaisProximo(localizacao);

    // Assert
    assertTrue(retorno != null);
  }

  @Test
  public void testBuscarVeiculoMaisProximoNaoRetornaVeiculo() {
    // Arrange
    String localizacao = "teste";
    var veiculosDisponiveis = new ArrayList<Veiculos>();
    DepartamentoPolicial departamentoPolicial = new DepartamentoPolicial();
    
    // Act
    Veiculo retorno = departamentoPolicial.buscarVeiculoMaisProximo(localizacao);

    // Assert
    assertTrue(retorno == null);
  }

  @Test
  public void testGetVeiculosDisponiveisByTipoRetornaVeiculos() {
    // Arrange
    DepartamentoPolicial departamentoPolicial = new DepartamentoPolicial();
    
    // Act
    Veiculo[] retorno = departamentoPolicial.getVeiculosDisponiveisByTipo(TipoVeiculo.CARRO);

    // Assert
    assertTrue(retorno != null);
  }
}