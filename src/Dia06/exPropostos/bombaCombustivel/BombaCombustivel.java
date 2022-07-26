package Dia06.exPropostos.bombaCombustivel;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String abastecerPorValor(Double valorAbastecido){
        double quantidadeAbastecida = valorAbastecido / this.valorLitro;
        return String.format("Foram abastecidos: %.4fL", abastecer(quantidadeAbastecida));
    }

    public String abastecerPorLitro(Double quantidadeAbastecida){
        double valorAbastecido = quantidadeAbastecida * this.valorLitro;
        return String.format("Foram abastecidos R$ %.2f", abastecer(quantidadeAbastecida) * valorLitro);
    }

    private double abastecer(double quantidadeAbastecida) {
        // Retorna a quantidade de combustível abastecida;
        if(quantidadeAbastecida <= quantidadeCombustivel){
            quantidadeCombustivel -= quantidadeAbastecida;
            return quantidadeAbastecida;
        } else {
            quantidadeAbastecida = quantidadeCombustivel;
            quantidadeCombustivel = 0;
            return quantidadeAbastecida;
        }
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    @Override
    public String toString() {
        return "BombaCombustível {" +
                "Tipo Combustível= '" + tipoCombustivel + '\'' +
                ", Valor Litro= " + valorLitro +
                ", Quantidade Combustível= " + quantidadeCombustivel +
                '}';
    }
}
