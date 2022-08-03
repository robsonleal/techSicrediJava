package Dia09.macaco;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;
    private List<Object> bucho;

    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = new ArrayList<>();
    }

//    public void alimentar(String alimento){
//        bucho.add(alimento);
//    }

    public void alimentar(Object object){
        bucho.add(object);
    }

    public List<Object> verBucho() {
        return bucho;
    }

    public void digerir(){
        bucho.clear();
    }

    @Override
    public String toString() {
        return "Macaco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
