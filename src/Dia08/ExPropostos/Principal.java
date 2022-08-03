package Dia08.ExPropostos;

public class Principal {
    public static void main(String[] args) {
        Gerente gerenteDep01 = new Gerente("Roberta Jacira", 5500.);
        Secretario secretarioDep01 = new Secretario("Carlos Manolo", 3500.);
        Departamento dep01 = new Departamento(gerenteDep01, secretarioDep01);
        
        Operario operario01Dep01 = new Operario("Jubileu Rodrigues", 1200.);
        Operario operario02Dep01 = new Operario("Jamerson Leal", 1200.);
        Operario operario03Dep01 = new Operario("Jaime Silva", 1200.);
        dep01.addOperario(operario01Dep01);
        dep01.addOperario(operario02Dep01);
        dep01.addOperario(operario03Dep01);

        System.out.println(dep01);
        
        Gerente gerenteDep02 = new Gerente("Roberto Gerônimo", 5500.);
        Secretario secretarioDep02 = new Secretario("Carlos de Aragão", 3500.);
        Departamento dep02 = new Departamento(gerenteDep02, secretarioDep02);
        
        Operario operario01Dep02 = new Operario("Jubileu Teixeira", 1200.);
        Operario operario02Dep02 = new Operario("Jamerson Leal", 1200.);
        Operario operario03Dep02 = new Operario("Jaime Jutson", 1200.);
        dep02.addOperario(operario01Dep02);
        dep02.addOperario(operario02Dep02);
        dep02.addOperario(operario03Dep02);

        System.out.println(dep02);
    }
}
