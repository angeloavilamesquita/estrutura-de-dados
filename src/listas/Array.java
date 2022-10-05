package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        // declaração tipo primitivo
        double nota = 10;
        // declaração vetores
        double[] notas = new double[10];
        Aluno[] turmaADS = new Aluno[12];
        // declaração vetores opção 2
        double[] notasBoas = {10, 9, 8, 7};
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();
        Aluno aluno03 = new Aluno();
        aluno01.ra = "202201123";
        aluno02.ra = "202201124";
        aluno03.ra = "202201125";
        Aluno[] top3 = {aluno01, aluno02, aluno03};
        top3[2].nome = "aluno 02";
                
        Scanner leia = new Scanner(System.in);
        int contador = 0;
        while (contador < notas.length) {
            System.out.println("Digita uma nota");
            notas[contador] = leia.nextDouble();
        }
        
        for (int cont = 0; cont < turmaADS.length; cont++) {
            System.out.println("Digite o RA do aluno");
            turmaADS[cont].ra = leia.next();
            System.out.println("Digite o Nome do aluno");
            turmaADS[cont].nome = leia.next();
            System.out.println("Digite o Curso do aluno");
            turmaADS[cont].curso = leia.next();
        }
        
        for (int counter = 0; counter < turmaADS.length; counter++) {
            System.out.println("RA: " + turmaADS[counter].ra);
            System.out.println("NOME: " + turmaADS[counter].nome);
            System.out.println("CURSO: " + turmaADS[counter].curso);
            
        }
        
        List<Aluno> novaTurmaADS = new ArrayList<>();
        Aluno alunoNovo = new Aluno();
        alunoNovo.nome = "Joaozinho";
        
        
        novaTurmaADS.add(alunoNovo);
        int ultimaPosicao = novaTurmaADS.size();
        Aluno ultimoAluno = novaTurmaADS.get(ultimaPosicao - 1);
        
        
        for (Aluno aluno : novaTurmaADS) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("RA: " + aluno.ra);
            System.out.println("Curso: " + aluno.curso);
        }
        
        novaTurmaADS.remove(ultimoAluno);
        
    }
    
}
