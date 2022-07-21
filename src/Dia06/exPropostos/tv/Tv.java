package Dia06.exPropostos.tv;

public class Tv {
    private int canal;
    private int volume;

    public void aumentarVolume() {
        if(volume < 100)
            this.volume += 10;
    }

    public void diminuirVolume() {
        if(volume > 0)
            this.volume -= 10;
    }

    public void setCanal(int canal){
        if (canal >= 2 && canal <= 49)
            this.canal = canal;
        else
            System.out.println("Canal escolhido não foi encontrado");
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
