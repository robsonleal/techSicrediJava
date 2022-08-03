package Dia09.macaco;

public class Principal {
    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Macaquildo");
        Alimento alimento = new Alimento("Banana");
        macaco1.alimentar("banana");
        macaco1.alimentar("maça");
        macaco1.alimentar(alimento);
        System.out.println(macaco1.verBucho());

        Macaco macaco2 = new Macaco("Macaca");
        macaco1.alimentar(macaco2);

        System.out.println(macaco1.verBucho());
    }
}
