package Dia11.supermercado2;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caixa de som", 1700, 10);
        Pedido pedido1 = new Pedido();

        pedido1.adicionarItem(produto1, 5);
        pedido1.adicionarItem(produto1, 5);
        pedido1.adicionarItem(produto1, 5);
        pedido1.exibirCarrinho();
    }
}
