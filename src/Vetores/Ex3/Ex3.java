package Vetores.Ex3;

public class Ex3 {
    public static void main(String[] args) {

    Biblioteca b1 = new Biblioteca();
        b1.imprimirLivros();
        System.out.println("Livros disponíveis: " + b1.contarLivrosDisponiveis());
        System.out.println("Verificar 'Dom Casmurro': " + b1.verificarDisponibilidade("Dom Casmurro"));

        System.out.println("----------------------------");

    // Biblioteca com parâmetros
    String[] listaLivros = {"Dom Casmurro", "O Pequeno Príncipe", null, "1984", "Senhor dos Anéis"};
    Biblioteca b2 = new Biblioteca("Biblioteca Central", listaLivros);
        b2.imprimirLivros();
        System.out.println("Livros disponíveis: " + b2.contarLivrosDisponiveis());
        System.out.println("Verificar '1984': " + b2.verificarDisponibilidade("1984"));
        System.out.println("Verificar 'Harry Potter': " + b2.verificarDisponibilidade("Harry Potter"));
}
}
