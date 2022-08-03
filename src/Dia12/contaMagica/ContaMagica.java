package Dia12.contaMagica;

import java.math.BigDecimal;

public class ContaMagica {
    private String nome;
    private BigDecimal saldo;
    private Categorias status;

    public ContaMagica(String nome) {
        this.nome = nome;
        this.saldo = new BigDecimal("0.00");
        this.status = Categorias.SILVER;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSaldo() {
        return saldo.setScale(2);
    }

    public Categorias getStatus() {
        return status;
    }

    private void upCategoria() {
        if(saldo.compareTo(new BigDecimal("200000.00")) >= 0)
            status = Categorias.PLATINUM;
        else if (saldo.compareTo(new BigDecimal("50000.00")) >= 0)
            status = Categorias.GOLD;
    }

    private void downCategoria() {
        if(saldo.compareTo(new BigDecimal("25000.00")) < 0)
            if(getStatus() == Categorias.PLATINUM)
                status = Categorias.GOLD;
            else
                status = Categorias.SILVER;
        else if (saldo.compareTo(new BigDecimal("100000.00")) < 0)
            status = Categorias.GOLD;
    }

    public void deposito(BigDecimal valor) {
        switch (getStatus()) {
            case SILVER:
                saldo = saldo.add(valor);
                break;
            case GOLD:
                saldo = saldo.add(valor.add(valor.multiply(new BigDecimal("0.01"))));
                break;
            case PLATINUM:
                saldo = saldo.add(valor.add(valor.multiply(new BigDecimal("0.025"))));
                break;
        }

        upCategoria();
    }

    public void retirada(BigDecimal valor) {
        saldo = saldo.subtract(valor);

        downCategoria();
    }
}
