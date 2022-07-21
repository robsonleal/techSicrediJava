package Dia06.exPropostos.contaCorrente;

public class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
    }

    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    private boolean validarValor(double valor) {
        if (valor >= 0)
            return true;

        return false;
    }

    public void alterarNome(String novoNome) {
        this.nomeCorrentista = novoNome;
    }

    public void depositar(double valor) {
        if (validarValor(valor))
            this.saldo += valor;
    }

    public void sacar(double valor) {
        if (validarValor(valor) && valor <= this.saldo)
            this.saldo -= valor;
        else
            System.out.println("Valor de saque indisponível!");
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroConta='" + numeroConta + '\'' +
                ", nomeCorrentista='" + nomeCorrentista + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
