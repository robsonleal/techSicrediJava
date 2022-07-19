package Dia06m2;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro(55);

        carro.abastecer(30);
        carro.abastecer(30);

        System.out.println("Quantidade de combustível: " + carro.getQuantidadeCombustivel());

        carro.deslocar(200);
        carro.deslocar(200);
        carro.deslocar(200);
        carro.deslocar(200);
        carro.deslocar(25);
        carro.deslocar(25);

        System.out.println("Quilometragem: " + carro.getQuilometragem());
        System.out.println("Quantidade de combustível: " + carro.getQuantidadeCombustivel());
    }
}
