package Dia06.exPropostos.quadrado;

public class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }
}
