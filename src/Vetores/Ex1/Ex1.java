package Vetores.Ex1;

public class Ex1 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.imprimirInformacoes();
        System.out.println("Média: " + a1.calcularMedia());
        System.out.println("Aprovado? " + a1.verificarNotaAprovacao(5.0));

        System.out.println("----------------------");

        // Testando o construtor com parâmetros
        Aluno a2 = new Aluno("Samyr", 8.0, 9.0, 9.9, 5.1);
        a2.imprimirInformacoes();
        System.out.println("Média: " + a2.calcularMedia());
        System.out.println("Aprovado? " + a2.verificarNotaAprovacao(6.0));

    }
}
