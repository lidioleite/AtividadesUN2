
package unp.br.filaEncadeada;


public class NoFilaEncadeada {
    private int valor;
    private NoFilaEncadeada proximo;

    public NoFilaEncadeada(int valor, NoFilaEncadeada proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoFilaEncadeada getProximo() {
        return proximo;
    }

    public void setProximo(NoFilaEncadeada proximo) {
        this.proximo = proximo;
    }
  
    
}
