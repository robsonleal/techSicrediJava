package Dia06.exPropostos.quadrado;

public class Principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        System.out.println("Tamanho do lado: " + quadrado.getLado());
        quadrado.setLado(5);
        System.out.println("Tamanho do lado: " + quadrado.getLado());
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
    }
}
