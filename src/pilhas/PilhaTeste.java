package pilhas;

import java.util.Stack;

public class PilhaTeste {
    
    public static void main(String[] args) {
        Pilha p = new Pilha();
        System.out.println("Tamanho da pilha: " + p.getTamanho());
        System.out.println("Topo da pilha: " + p.getTopo());
        p.desempilha();
        p.verPilha();
        p.empilha(10);
        p.empilha(20);
        p.empilha(30);
        p.empilha(40);
        p.desempilha();
        p.empilha(50);
        p.empilha(60);
        p.empilha(70);
        p.desempilha();
        p.empilha(80);
        p.empilha(90);
        p.empilha(100);
        p.empilha(110);
        p.empilha(120);
        p.empilha(130);
        p.desempilha();
        p.verPilha();
        
        Stack pilha2 = new Stack();
        pilha2.push(2);
        pilha2.pop();
        pilha2.empty();
    }
    
}
