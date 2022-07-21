package Dia06.exPropostos.contaCorrente;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("0001-79", "Robson");

        conta1.depositar(500);
        System.out.println(conta1);

        conta1.sacar(300);
        System.out.println(conta1);

        conta1.sacar(300);
        System.out.println(conta1);
    }
}
