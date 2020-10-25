public enum TipoVeiculo {
    CARRO(0),
    CARRO_SEDA(1),
    CARRO_SUV(2),
    CAMINHONETE(3),
    ONIBUS(4),
    MOTOCICLETA(5);

    private final int valor;
    TipoVeiculo(int valorOpcao){
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }
  }
  