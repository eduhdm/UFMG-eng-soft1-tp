public enum StatusPolicial {
    DISPONIVEL(0),
    ATENDENDO_CHAMADO(1),
    EM_FERIAS(2);

    private final int valor;
    StatusPolicial(int valorOpcao){
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }
  }