package Dia10.professores;

import java.util.List;

public class TestCadastroProfessor {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Alexia");
        Professor professor2 = new Professor("Robson");
        Professor professor3 = new Professor("Jubileu");

        CadastroDeProfessores cadastro1 = new CadastroDeProfessores(List.of(professor1, professor2, professor3));
        System.out.println(cadastro1.getProfessoresCadastrados());

        CadastroDeProfessores cadastro2 = new CadastroDeProfessores();

        cadastro2.removeInicio();

    }
}
