package Dia09.supermercado;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado", 550, 3);        
        Produto produto2 = new Produto("Mouse", 250, 5);        
        Produto produto3 = new Produto("Processador", 1250, 1);        

        Pedido pedido = new Pedido();
        pedido.adicionarItem(produto1, 2);
        pedido.adicionarItem(produto2, 3);
        pedido.adicionarItem(produto3, 1);
        pedido.adicionarItem(produto3, 1);
        pedido.fecharPedido();

        System.out.println("FIM DO PROGRAMA!");
    }
}
