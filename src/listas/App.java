package listas;

public class App {

    public static void main(String[] args) {
        System.out.println("Tipos Primitivos");
        int numeroInteiro = 10;
        float numeroFloat = 10.23f;
        double numeroDouble = 10.23;
        String texto = "esse eh um texto";
        char letra = 'a';
        boolean estaFeito = true;
        System.out.println("Tipos abstratos de dados - TAD");
        
        Aluno alunoUnis = new Aluno();
        alunoUnis.ra = "202201123123";
        alunoUnis.nome = "Jose Pequeteh";
        alunoUnis.curso = "Podologia";
        
        Aluno alunoFPA = new Aluno();
        alunoFPA.ra = "202201123123";
        alunoFPA.nome = "Jose Pequeteh";
        alunoFPA.curso = "Podologia";
        
        MetrosQuadrados m2 = new MetrosQuadrados();
        m2.comprimento = 10.5;
        m2.largura = 5.23;
        System.out.println(m2.calcular());
                
        
    }
    
}
