package Dia05;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Robson", 26, 70.);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
    }
}
