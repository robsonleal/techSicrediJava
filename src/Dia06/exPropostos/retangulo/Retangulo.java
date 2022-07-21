package Dia06.exPropostos.retangulo;

public class Retangulo {
    private double base;
    private double altura;

    public double calcularArea() {
        return this.altura * this.base;
    }

    public double calcularPerimetro() {
        return this.altura * 2 + this.base * 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
