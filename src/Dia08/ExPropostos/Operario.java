package Dia08.ExPropostos;

public class Operario extends Funcionario {
    public Operario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "[Nome=" + getNome() + "]";
    }
}
