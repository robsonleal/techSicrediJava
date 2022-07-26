package Dia08.ExPropostos;

public class Secretario extends Funcionario {
    public Secretario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Secretário [Nome=" + getNome() + "]";
    }
}
