package Dia06.exPropostos.pontoRetangulo;

import java.util.Scanner;

public class Retangulo {
    private int base;
    private int altura;
    private Ponto verticeInicial;
    private Ponto centroRetangulo;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        this.verticeInicial = new Ponto(0, altura);
        this.centroRetangulo = new Ponto(getCentro());
    }

    public void mudarAltura() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o novo valor para a altura - ");
        int novaAltura = input.nextInt();
        this.setAltura(novaAltura);
        this.centroRetangulo.setValorY((double)novaAltura/2);
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void mudarBase() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o novo valor para base - ");
        int novaBase = input.nextInt();
        this.setBase(novaBase);
        this.centroRetangulo.setValorX((double)novaBase / 2);
    }

    public void setBase(int base) {
        this.base = base;
    }

    public static double [] getCentro(double valorX, double valorY) {
        double vetor [] = {valorX, valorY};
        return getCentro(vetor);
    }

    private static double [] getCentro(double[] vetor) {
        return vetor;
    }


    public double [] getCentro() {
        double centro[] = {(double)this.base / 2, (double)this.altura / 2};
        return centro;
    }

    @Override
    public String toString() {
        return "Retângulo {" +
                "base=" + base +
                ", altura=" + altura +
                ", verticeInicial= " + verticeInicial +
                ", centroRetangulo= " + centroRetangulo +
                '}';
    }
}
