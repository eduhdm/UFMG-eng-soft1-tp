public enum StatusVeiculo {
    DISPONIVEL(0),
    OCUPADO(1),
    QUEBRADO(2),
    EM_MANUTENCAO(3);

    private final int valor;
    StatusVeiculo(int valorOpcao){
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }
  }