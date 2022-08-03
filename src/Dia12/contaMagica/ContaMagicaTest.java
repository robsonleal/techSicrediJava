package Dia12.contaMagica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ContaMagicaTest {
    private ContaMagica c;

    @BeforeEach
    public void setUp() {
        c = new ContaMagica("Teste");
    }

    @Test
    public void categoriaSilverTest() {
        BigDecimal dep1 = new BigDecimal("1000.00");
        c.deposito(dep1);
        BigDecimal tmp = c.getSaldo();
        BigDecimal esp1 = new BigDecimal("1000.00");
        assertEquals(tmp, esp1);
    }

    @Test
    public void categoriaUpGoldTest() {
        BigDecimal dep1 = new BigDecimal("50000.00");
        c.deposito(dep1);
        BigDecimal dep2 = new BigDecimal("1000.00");
        c.deposito(dep2);
        BigDecimal tmp = c.getSaldo();
        BigDecimal esp1 = new BigDecimal("51010.00");
        assertEquals(esp1, tmp);
    }

    @Test
    public void categoriaUpPlatinumTest() {
        BigDecimal dep1 = new BigDecimal("200000.00");
        c.deposito(dep1);
        BigDecimal dep2 = new BigDecimal("1000.00");
        c.deposito(dep2);
        BigDecimal tmp = c.getSaldo();
        BigDecimal esp1 = new BigDecimal("201025.00");
        assertEquals(esp1, tmp);
    }

    @Test
    public void retiradaTest() {
        BigDecimal dep1 = new BigDecimal("1000.00");
        c.deposito(dep1);
        BigDecimal ret1 = new BigDecimal("1000.00");
        c.retirada(ret1);
        BigDecimal tmp = c.getSaldo();
        BigDecimal esp1 = new BigDecimal("0.00");
        assertEquals(esp1, tmp);
    }

    @Test
    public void categoriaDownGoldTest() {
        BigDecimal dep1 = new BigDecimal("200000.00");
        c.deposito(dep1);
        BigDecimal ret1 = new BigDecimal("110000.00");
        c.retirada(ret1);
        Categorias tmp = c.getStatus();
        assertEquals(Categorias.GOLD, tmp);
    }

    @Test
    public void categoriaDownUmaPorVezTest() {
        BigDecimal dep1 = new BigDecimal("200000.00");
        c.deposito(dep1);
        BigDecimal ret1 = new BigDecimal("180000.00");
        c.retirada(ret1);
        Categorias tmp = c.getStatus();
        assertEquals(Categorias.GOLD, tmp);
    }

    @Test
    public void categoriaDownSilverTest() {
        BigDecimal dep1 = new BigDecimal("200000.00");
        c.deposito(dep1);
        BigDecimal ret1 = new BigDecimal("180000.00");
        c.retirada(ret1);
        BigDecimal ret2 = new BigDecimal("5000.00");
        c.retirada(ret2);
        Categorias tmp = c.getStatus();
        assertEquals(Categorias.SILVER, tmp);
    }
}
