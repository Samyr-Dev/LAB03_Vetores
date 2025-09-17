package Vetores.Ex5;

public class Ex5 {
    public static void main(String[] args) {
        Estoque e1 = new Estoque();
        e1.imprimirEstoque();
        System.out.println("Total em estoque: " + e1.calcularTotalEstoque());
        System.out.println("Disponível acima de 10? " + e1.verificarDisponibilidade(10));

        System.out.println("----------------------------");

        Estoque e2 = new Estoque("Notebook", 5, 12, 8, 0, 20);
        e2.imprimirEstoque();
        System.out.println("Total em estoque: " + e2.calcularTotalEstoque());
        System.out.println("Disponível acima de 10? " + e2.verificarDisponibilidade(10));
    }
}
