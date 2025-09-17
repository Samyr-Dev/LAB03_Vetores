package Vetores.Ex5;

public class Estoque {
    private String produto;
    private int[] quantidades;

    public Estoque() {
        this.produto = "Produto Desconhecido";
        this.quantidades = new int[5];
    }
    public Estoque(String produto, int q1, int q2, int q3, int q4, int q5) {
        this.produto = produto;
        this.quantidades = new int[5];
        this.quantidades[0] = q1;
        this.quantidades[1] = q2;
        this.quantidades[2] = q3;
        this.quantidades[3] = q4;
        this.quantidades[4] = q5;
    }
    public void imprimirEstoque() {
        System.out.println("Produto: " + this.produto);
        System.out.println("Quantidades por lote:");
        for (int i = 0; i < quantidades.length; i++) {
            System.out.println("Lote " + (i + 1) + ": " + quantidades[i]);
        }
    }
    public int calcularTotalEstoque() {
        int total = 0;
        for (int q : quantidades) {
            total += q;
        }
        return total;
    }
    public boolean verificarDisponibilidade(int quantidadeMinima) {
        for (int q : quantidades) {
            if (q > quantidadeMinima) {
                return true;
            }
        }
        return false;
    }

}
