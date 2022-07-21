package Dia06.exPropostos.bola;

public class Principal {
    public static void main(String[] args) {
        Bola bola = new Bola("Sintético", 20);
        System.out.println(bola.getCor());
        bola.setCor("vermelho");
        System.out.println(bola.getCor());
    }
}
