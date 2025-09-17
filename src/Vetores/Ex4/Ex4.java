package Vetores.Ex4;

public class Ex4 {

    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        e1.imprimirFuncionarios();
        System.out.println("Quantidade de funcionários: " + e1.contarFuncionarios());
        System.out.println("Verificar 'Pedro': " + e1.verificarFuncionario("Pedro"));

        System.out.println("----------------------------");

        String[] listaFuncionarios = {"Pedro", "Lucas", "Maria", null, "João", "Carla", null, "Ana"};
        Empresa e2 = new Empresa("Tech Solutions", listaFuncionarios);
        e2.imprimirFuncionarios();
        System.out.println("Quantidade de funcionários: " + e2.contarFuncionarios());
        System.out.println("Verificar 'Maria': " + e2.verificarFuncionario("Maria"));
        System.out.println("Verificar 'Fernanda': " + e2.verificarFuncionario("Fernanda"));
    }
}
