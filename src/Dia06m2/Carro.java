package Dia06m2;

public class Carro {
    private double quilometragem;
    private int capacidadeTanque;
    private double quantidadeCombustivel;

    public Carro (int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void deslocar(double distancia) {
        double combustivelConsumido = distancia / 15;

        if (combustivelConsumido <= quantidadeCombustivel){
            this.quantidadeCombustivel -= combustivelConsumido;
            this.quilometragem += distancia;
            System.out.println("Deslocamento concluído!");
        }
        else {
            this.quilometragem += this.quantidadeCombustivel * 15;
            this.quantidadeCombustivel = 0;
            System.out.println("Não foi possível concluir todo o percurso, veículo sem gasolina!");
        }
    }

    public void abastecer(int quantidade) {
        this.quantidadeCombustivel = (quantidade + quantidadeCombustivel) > capacidadeTanque ? capacidadeTanque :
                quantidadeCombustivel + quantidade;
        System.out.println("O Veículo foi abastecido!");
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
