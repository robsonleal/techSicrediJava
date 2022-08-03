package Dia11.supermercado2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private int id;
    private List<HashMap<Produto, Integer>> itens = new ArrayList<>();
    private double totalPedido;
    private String pagamento;

    public void adicionarItem(Produto produto, int quantidade) {
        if(quantidade <= produto.getQuantidade()){
            HashMap<Produto, Integer> novoProduto = new HashMap<>();
            novoProduto.put(produto, quantidade);
            produto.setQuantidade(quantidade);
            itens.add(novoProduto);
            System.out.println("Item adicionado ao carrinho!");
        } else
            System.out.println("Produto indisponível!");
    }

    public void fecharPedido() {
        System.out.println("================== ITENS NO CARRINHO ====================");
        exibirCarrinho();
        System.out.println("=========================================================");
        System.out.println(calcularTotalPedido());
        System.out.println("=========================================================");
        selecionaPagamento();
        System.out.printf("Você escolheu %s para pagamento!%n", pagamento);
    }

    public void selecionaPagamento() {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecione a forma de pagamento");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão");
        System.out.println("3 - Pix");

        while (true) {
            System.out.print("Digite uma opção - ");
            int opcao = input.nextInt();
            switch (opcao){
                default:
                    System.out.println("Opção inválida");
                    break;
                case 1:
                    pagamento = "Dinheiro";
                    break;
                case 2:
                    pagamento = "Cartão";
                    break;
                case 3:
                    pagamento = "Pix";
                    break;
            }
            if(pagamento != null)
                return;
        }
    }

    private String calcularTotalPedido() {
        for (HashMap<Produto, Integer> item : itens) {
            item.forEach((key, value) -> {
                totalPedido += key.getPreco() * value;
            });
        }

        return String.format("Valor total do pedido R$ %.2f", totalPedido);
    }

    public void exibirCarrinho() {
        for (HashMap<Produto, Integer> item : itens) {
            item.forEach((key, value) -> {
                System.out.println("Produto= " + key.getNome() + ", Valor= R$" + key.getPreco() + ", Quantidade= " + value);
            });
        }
    }

    public List<HashMap<Produto, Integer>> getItems() {
        return itens;
    }
}
