package Dia06.exPropostos.bombaCombustivel;

public class Principal {
    public static void main(String[] args) {
        BombaCombustivel bomba01 = new BombaCombustivel("Gasolina Comum", 5.89, 300);

        System.out.println(bomba01.abastecerPorValor(100.));
        System.out.println(bomba01.abastecerPorLitro(100.));
        System.out.println(bomba01.abastecerPorLitro(100.));
        System.out.println(bomba01.abastecerPorLitro(100.));
        System.out.println(bomba01.abastecerPorLitro(100.));
        System.out.println(bomba01.abastecerPorValor(100.));

        System.out.println(bomba01);
    }
}
