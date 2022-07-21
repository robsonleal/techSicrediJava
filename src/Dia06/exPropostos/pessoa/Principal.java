package Dia06.exPropostos.pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Robson", 19, 69., 1.7);

        pessoa.envelhecer();
        pessoa.envelhecer();
        pessoa.envelhecer();
        pessoa.envelhecer();
        pessoa.envelhecer();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getPeso());
        System.out.println(pessoa.getAltura());
    }
}
