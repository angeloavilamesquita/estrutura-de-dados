package funcoes;

public class ParametroPorValor {
    
    public static void main(String[] args) {
    
        int numero = 10;
        System.out.println(numero);
        ParametroPorValor.dobro(numero);
        System.out.println(numero);
    }
    
    public static void dobro(int numero) {
        System.out.println(numero += 2);
    }
    
}
