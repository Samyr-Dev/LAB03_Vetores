package Vetores.Ex2;

import Vetores.Main;

public class Ex2 {
    public static void main(String[] args) {
        Turma t1 = new Turma();
        t1.imprimirTurma();
        System.out.println("Quantidade de alunos: " + t1.quantidadeAlunos());
        System.out.println("Buscar Pedro: " + t1.buscarAluno("Pedro"));

        System.out.println("-------------------------");

        // Usando construtor com parâmetros
        String[] lista = {"Pedro", "Lucas", "Maria", null, "João"};
        Turma t2 = new Turma("3º Ano A", lista);
        t2.imprimirTurma();
        System.out.println("Quantidade de alunos: " + t2.quantidadeAlunos());
        System.out.println("Buscar Maria: " + t2.buscarAluno("Maria"));
        System.out.println("Buscar Ana: " + t2.buscarAluno("Ana"));
    }
}
