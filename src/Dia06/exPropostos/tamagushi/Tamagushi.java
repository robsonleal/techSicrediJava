package Dia06.exPropostos.tamagushi;

import java.util.Random;

public class Tamagushi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagushi(String nome) {
        this.nome = nome;
        this.saude = 8;
        this.fome = 6;
    }

    public String getHumor() {
        double humor = (double)(this.saude + this.fome) / 2;

        if(humor >= 9.5)
            return "Muito feliz :D";
        else if(humor >= 7)
            return "Feliz :)";
        else if(humor >= 5)
            return "No tédio :|";
        else if(humor >= 3)
            return "Triste ):";
        else
            return "Muito triste D:";
    }

    public void brincar() {
        Random random = new Random();

        if (this.fome > 0 && this.saude > 0) {
            this.fome -= random.nextInt(4);
            this.saude -= random.nextInt(2);
        } else {
            setFome(0);
            setSaude(0);
            System.out.println("Você me mandou brincar com fome, agora estou doente!");
        }
    }

    public void envelhecer() {
        this.idade++;
    }

    public void alimentar() {
        this.fome++;
    }

    public void curar() {
        this.saude++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Tamagushi {" +
                "Nome= '" + nome + '\'' +
                ", Fome= " + fome +
                ", Saúde= " + saude +
                ", Idade= " + idade +
                ", Humor= " + getHumor() +
                '}';
    }
}
