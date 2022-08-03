package Dia10.professores;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeProfessores {
    List<Professor> professoresCadastrados = new ArrayList<>();

    public CadastroDeProfessores() {
    }

    public CadastroDeProfessores(List<Professor> professoresCadastrados) {
        this.professoresCadastrados = professoresCadastrados;
    }

    public List<Professor> getProfessoresCadastrados() {
        return professoresCadastrados;
    }

    public int indiceDe(Professor p) {
        return professoresCadastrados.indexOf(p);
    }

    public void removeInicio() {
        try {
            professoresCadastrados.remove(0);
        } catch (IndexOutOfBoundsException e) {
            IndexOutOfBoundsException excecao = new IndexOutOfBoundsException("Lista de professores está vazia!");
            throw excecao;
        }
    }
}
