
package unp.br.filaEncadeada;


public class NoFilaDuplaEncadeada {
    private int valor;
    private NoFilaDuplaEncadeada proximo;
    private NoFilaDuplaEncadeada anterior;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoFilaDuplaEncadeada getProximo() {
        return proximo;
    }

    public void setProximo(NoFilaDuplaEncadeada proximo) {
        this.proximo = proximo;
    }

    public NoFilaDuplaEncadeada getAnterior() {
        return anterior;
    }

    public void setAnterior(NoFilaDuplaEncadeada anterior) {
        this.anterior = anterior;
    }

    public NoFilaDuplaEncadeada(int valor, NoFilaDuplaEncadeada proximo, NoFilaDuplaEncadeada anterior) {
        this.valor = valor;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    
    
}
