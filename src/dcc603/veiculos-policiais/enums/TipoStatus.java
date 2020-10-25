public enum TipoStatus {
    EM_CHAMADA(0),
    DISPONIVEL(1);

    private final int valor;
    TipoStatus(int valorOpcao){
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }
  }