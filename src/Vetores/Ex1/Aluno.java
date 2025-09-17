package Vetores.Ex1;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno() {
        this.nome = "Desconhecido";
        this.notas = new double [4];
    }

    public Aluno(String nome, double n0, double n1, double n2, double n3) {
        this.nome = nome;
        this.notas = new double[4];
        this.notas[0] = n0;
        this.notas[1] = n1;
        this.notas[2] = n2;
        this.notas[3] = n3;
    }

    public void imprimirInformacoes(){
        System.out.println("Nome: " + nome );
        for ( double nota : notas){
            System.out.println(nota + "");
        }
        System.out.println();
    }

    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        return soma/ notas.length;
    }

    public void verificarNotaAprovacao(double valor){
        valor = 5;

        for (int valorNotas = 0; valorNotas < 10; valorNotas++){
        notas[notas.length] = valorNotas;
            //notas[valorNotas] = ;
        }
        for (int i = 0; i < notas.length; i++){
        if (valor > notas[i] ){
            System.out.println("Aprovado? ");
        }
        }
        return;
    }

}
