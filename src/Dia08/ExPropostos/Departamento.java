package Dia08.ExPropostos;

import java.util.ArrayList;

public class Departamento {
    private Gerente gerente;
    private Secretario secretario;
    private ArrayList<Operario> operarios;

    public Departamento(Gerente gerente, Secretario secretario) {
        this.gerente = gerente;
        this.secretario = secretario;
        this.operarios = new ArrayList<>();
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public ArrayList<Operario> getOperarios() {
        return operarios;
    }

    public void addOperario(Operario operario) {
        this.operarios.add(operario);
    }

    @Override
    public String toString() {
        return "Departamento ["+gerente +", " + secretario + ", Operários=" + operarios + "]";
    } 
}
