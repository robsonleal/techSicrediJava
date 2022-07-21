package Dia06.exPropostos.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa() {
        this("Robson", 26, 20.5, 7.5);
    }

    public void envelhecer() {
        this.idade++;
        this.crescer();
    }

    public void crescer() {
        if(this.idade <= 21) {
            this.altura += 0.05;
        }
    }

    public void emagrecer() {
        this.peso--;
    }

    public void engordar() {
        this.peso++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
