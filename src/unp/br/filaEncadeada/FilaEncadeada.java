
package unp.br.filaEncadeada;


public class FilaEncadeada implements interfaceFilaEncadeada {
    private int quantidade = 0;
    private NoFilaEncadeada inicio;
    private NoFilaEncadeada fim;

    @Override
    public void criarFila(int tamanho) {
          inicio = new NoFilaEncadeada (-1,null);
          
                }

    @Override
    public boolean eCheia() {
        return fim == capacidade;
        
    }

    @Override
    public boolean eVazia() {
        return fim == quantidade;
    }

    @Override
    public int tamanho() {
        return 0;
        
    }

    @Override
    public NoFilaEncadeada enfileirar(int valor) {
        return null;
        
    }

    @Override
    public NoFilaEncadeada desenfileirar() {
        return null;
        
    }

    @Override
    public int pegarInicio() {
        return 0;
        
    }

    @Override
    public void listar() {
        
    }
    
}
