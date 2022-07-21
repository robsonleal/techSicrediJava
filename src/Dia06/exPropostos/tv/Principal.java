package Dia06.exPropostos.tv;

public class Principal {
    public static void main(String[] args) {
        Tv televisor = new Tv();

        televisor.setCanal(12);
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.diminuirVolume();

        System.out.println("Canal atual: " + televisor.getCanal());
        System.out.println("Volume atual: " + televisor.getVolume());

        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.setCanal(200);
        System.out.println("Canal atual: " + televisor.getCanal());
        System.out.println("Volume atual: " + televisor.getVolume());
    }
}
