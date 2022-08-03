package Dia11.parquimetro;

public class Parquimetro2 {
    private double saldo;

    public void inserirMoeda(int valor){
        if (valor == 1 ||
            valor == 5 ||
            valor == 10 ||
            valor == 25 ||
            valor == 50 ||
            valor == 100)
            saldo += valor;
        //else

    }

    public double getSaldo() {
        return saldo;
    }

    public boolean emiteTicket() {
        if(saldo >= 2.) {
            saldo -= 2.;
            return true;
        }

        return false;
    }

    public double devolve() {
        double devolve = saldo;
        saldo = 0;
        return devolve;
    }
}
