package Dia11.parquimetro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParquimetroTest {
    private Parquimetro parquimetro;

    @BeforeEach
    public void setUp() {
        parquimetro = new Parquimetro();
    }

    @Test
    public void testandoValoresInseridos() {
        parquimetro.insereMoeda(1);
        parquimetro.insereMoeda(5);
        parquimetro.insereMoeda(10);
        parquimetro.insereMoeda(25);
        parquimetro.insereMoeda(50);
        parquimetro.insereMoeda(100);
        assertEquals(parquimetro.getSaldo(), 291);
    }

    @Test
    public void inserirMoedaTest() {
        assertThrows(IllegalArgumentException.class, () -> parquimetro.insereMoeda(20));
    }

    @Test
    public void emitirTicketTrueTest() {
        parquimetro.insereMoeda(50);
        parquimetro.insereMoeda(50);
        parquimetro.insereMoeda(100);
        assertTrue(parquimetro.emiteTicket());
    }

    @Test
    public void emiteTicketFalseTest() {
        assertFalse(parquimetro.emiteTicket());
    }

    @Test
    public void testandoSaldoDepoisDaEmissaoDoTicket() {
        parquimetro.insereMoeda(50);
        parquimetro.insereMoeda(25);
        parquimetro.insereMoeda(25);
        parquimetro.insereMoeda(25);
        parquimetro.emiteTicket();
        assertEquals(parquimetro.getSaldo(), 25);
    }
}