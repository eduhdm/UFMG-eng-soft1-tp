public enum TipoUrgercia {
    BAIXA(0),
    MÉDIA(1),
    ALTA(2);

    private final int valor;
    TipoUrgencia(int valorOpcao){
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }
  }