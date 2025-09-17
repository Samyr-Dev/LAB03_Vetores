package Vetores.Ex2;

public class Turma {

    private String nomeTurma;
    private String[] alunos;

    public Turma() {
        this.nomeTurma = "Sem Nome";
        this.alunos = new String[5];
    }

    public Turma(String nomeTurma, String[] alunos) {
        this.nomeTurma = nomeTurma;
        this.alunos = alunos;
    }
    public void imprimirTurma() {
        System.out.println("Turma: " + this.nomeTurma);
        System.out.println("Lista de alunos:");
        for (String aluno : alunos) {
            if (aluno != null) {
                System.out.println(aluno);
            }
        }
    }
    public int quantidadeAlunos() {
        int contador = 0;
        for (String aluno : alunos) {
            if (aluno != null) {
                contador++;
            }
        }
        return contador;
    }

    public boolean buscarAluno(String nome) {
        for (String aluno : alunos) {
            if (aluno != null && aluno.equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
}
