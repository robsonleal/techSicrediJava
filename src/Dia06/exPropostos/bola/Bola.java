package Dia06.exPropostos.bola;

public class Bola {
    private String cor;
    private int circunferencia;
    private String material;

    public Bola(String material, int circunferencia) {
        this.material = material;
        this.circunferencia = circunferencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
