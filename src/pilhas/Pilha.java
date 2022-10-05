package pilhas;

public class Pilha {
    
    int[] pilha = new int[10];
    int topo;
    
    public Pilha() {
        this.topo = 0;
    }
    
    public void empilha(int valor) {
        if (pilhaCheia()) {
            System.out.println("pilha cheia");
        } else {
            System.out.println("Empilhei: " + valor);
            pilha[topo] = valor;
            topo++;
        }
    }
    
    public void desempilha() {
        if (pilhaVazia()) {
            System.out.println("pilha vazia");
        } else {
            int posicao = topo - 1;
            topo--;
            System.out.println("Desempilhei: " + pilha[posicao]);
        }
    }
    
    public int getTopo() {
        return this.topo;
    }
    
    public int getTamanho() {
        return this.pilha.length;
    }
    
    public int getEstado() {
        return topo + 1;
    }
    
    public boolean pilhaVazia() {
        return topo == 0;
    }
    
    public boolean pilhaCheia() {
        return topo == pilha.length;
    }
    
    public void verPilha() {
        for (int posicao = 0; posicao < topo; posicao++) {
            System.out.printf(
                "Posicao[%d]: %d \n",
                posicao, pilha[posicao]
            );
        }
    }
}
