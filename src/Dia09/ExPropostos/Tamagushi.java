package Dia09.ExPropostos;

public class Tamagushi {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagushi(String nome) {
        this.nome = nome;
        this.fome = 5;
        this.saude = 5;
    }

    public String getHumor() {
        float media = (float) (fome + saude) / 2;

        if (media > 5)
            return "Estou feliz!";
        else
            return "Estou triste!";
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void alimentar() {
        if (fome < 10) {
            System.out.println("Hmmmmmmmm que gostoso!");
            fome++;
        }
    }

    public void brincar() {
        if (fome > 0) {
            saude++;
            fome--;
            System.out.println("Ehhh estou brincando!");
        }
    }

    @Override
    public String toString() {
        return "Tamagushi{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome +
                ", saude=" + saude +
                ", humor=" + getHumor() +
                '}';
    }
}
