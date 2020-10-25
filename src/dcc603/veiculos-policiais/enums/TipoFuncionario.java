public enum TipoFuncionario {
    POLICIAL(0),
    ATENDENTE(1);

    private final int valor;
    TipoFuncionario(int valorOpcao){
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }
  }