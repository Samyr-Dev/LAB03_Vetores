package Vetores.Ex4;

public class Empresa {

    private String nome;
    private String[] funcionarios;

    public Empresa() {
        this.nome = "Empresa Desconhecida";
        this.funcionarios = new String[8];
    }
    public Empresa(String nome, String[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void imprimirFuncionarios() {
        System.out.println("Empresa: " + this.nome);
        System.out.println("Lista de funcionários:");
        for (String funcionario : funcionarios) {
            if (funcionario != null) {
                System.out.println("- " + funcionario);
            }
        }
    }
    public int contarFuncionarios() {
        int contador = 0;
        for (String funcionario : funcionarios) {
            if (funcionario != null) {
                contador++;
            }
        }
        return contador;
    }
    public boolean verificarFuncionario(String nomeFuncionario) {
        for (String funcionario : funcionarios) {
            if (funcionario != null && funcionario.equalsIgnoreCase(nomeFuncionario)) {
                return true;
            }
        }
        return false;
    }
}
