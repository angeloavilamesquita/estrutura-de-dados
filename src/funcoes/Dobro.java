package funcoes;

import java.util.Scanner;

public class Dobro {

    public static void main(String[] args) {
        Scanner read = Leitor.get();
        Dobro.exibeDialogoDeEntrada();
        double number = read.nextDouble();
        double resultado = Dobro.calculaDobro(number);
        Dobro.exibeResultado(resultado);
    }
    
    public static void exibeDialogoDeEntrada() {
        System.out.print("Digite um numero real: ");
    }
    
    public static double calculaDobro(double numero) {
        return numero * 2;
    }
    
    public static void exibeResultado(double resultado) {
        System.out.println("O resultado eh: " + resultado);
    }
}