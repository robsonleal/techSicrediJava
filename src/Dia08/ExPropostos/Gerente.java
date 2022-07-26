package Dia08.ExPropostos;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente [Nome=" + getNome() + "]";
    }
}
