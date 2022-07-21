package Dia06.cofrinho;

public class Porquinho {
    private double saldo;

    public void depositar(int valor) {
        switch (valor) {
            case 1:
                this.saldo += 0.05;
                System.out.println("Você depositou 5 centavos!");
                break;
            case 2:
                this.saldo += 0.1;
                System.out.println("Você depositou 10 centavos!");
                break;
            case 3:
                this.saldo += 0.25;
                System.out.println("Você depositou 25 centavos!");
                break;
            case 4:
                this.saldo += 0.5;
                System.out.println("Você depositou 50 centavos!");
                break;
            case 5:
                this.saldo += 1;
                System.out.println("Você depositou 1 real!");
                break;
            default:
                System.out.println("Valor de depósito inválido!");
        }
    }

    public void quebrar() {
        System.out.printf("Você quebrou o porquinho, saldo total acumulado R$ %.2f%n", this.getSaldo());
        this.saldo = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
