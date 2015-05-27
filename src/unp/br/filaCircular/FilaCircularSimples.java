package unp.br.filaCircular;

public class FilaCircularSimples implements interfaceFilaArranjoSimples {

    private int capacidade;
    private int quantidade = 0;
    private NoCircularSimples fila[];
    private int inicio = 0;
    private int fim = 0;

    @Override
    public void criarFila(int tamanho) {
        this.fila = new NoCircularSimples[tamanho];
        this.capacidade = tamanho;

    }

    @Override
    public boolean eCheia() {
        return fim == capacidade;

    }

    @Override
    public boolean eVazia() {
        return fim == inicio;

    }

    @Override
    public int tamanho() {
        return quantidade;

    }

    @Override
    public NoCircularSimples enfileirar(int valor) {
        if (!eCheia()) {
            NoCircularSimples elemento = new NoCircularSimples(valor);
            if (quantidade < capacidade && fim < capacidade) {
                fila[fim++] = elemento;
                quantidade++;
                System.out.println("Elemento" + valor + "foi colocado no campo" + fim);
            }}
            System.out.println("Fila cheia");
            return null;
      
    }
        @Override
        public NoCircularSimples desenfileirar (){
                                   
         if (!eVazia()) {
                NoCircularSimples aux = fila[inicio];
                fila[inicio++] = null;
                quantidade--;
                System.out.println("Elemento" + aux.getValor() + "tirado do campo" + inicio);
                return aux;
            }
            System.out.println("Fila não possui elementos");
            return null;

        }

        @Override
        public int pegarInicio
                    

        
            () {
          if (inicio != 0 && fim != 0) {
                return fila[inicio].getValor();
            } else {
                return -1;
            }

        }

        @Override
        public void listar

        
            () {
         if (!eVazia()) {
                for (int i = inicio; i < fim; i++) {
                    System.out.println(fila[i].getValor());
                }
                System.out.println("----------------------------------");
            }
        }
    }
