package Dia06.exPropostos.pontoRetangulo;

public class Ponto {
    private double valorX;
    private double valorY;

    public Ponto(double valorX, double valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public Ponto(double [] pontos) {
        this.valorX = pontos[0];
        this.valorY = pontos[1];
    }

    public void setValorX(double valorX) {
        this.valorX = valorX;
    }

    public void setValorY(double valorY) {
        this.valorY = valorY;
    }

    @Override
    public String toString() {
        return "Ponto {" +
                "X=" + valorX +
                ", Y=" + valorY +
                '}';
    }
}
