package Dia11.teste;

public class Teste {
    public static int contador;

    private static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Teste.contador -= contador;
    }
}
