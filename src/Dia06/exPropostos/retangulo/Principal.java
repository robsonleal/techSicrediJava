package Dia06.exPropostos.retangulo;

public class Principal {
    public static void main(String[] args) {
        Retangulo chao = new Retangulo();

        chao.setBase(10);
        chao.setAltura(15);

        double areaChao = chao.calcularArea();

        Retangulo piso = new Retangulo();

        piso.setBase(0.508);
        piso.setAltura(0.508);

        double areaPiso = piso.calcularArea();

        System.out.println(areaChao);
        System.out.println(areaPiso);
        System.out.println("Quantidade de piso necessária: " + Math.ceil(areaChao / areaPiso));
        System.out.println("Tamanho necessário do rodapé: " + chao.calcularPerimetro());
    }
}
