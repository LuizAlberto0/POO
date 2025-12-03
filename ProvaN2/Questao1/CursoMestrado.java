package ProvaN2.Questao1;

import java.util.ArrayList;

public class CursoMestrado extends Curso{
    private boolean strictoSensu;
    private double adicionalDiploma;

    public CursoMestrado(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<Aluno> alunos, boolean strictoSensu){
        this.setCodigo(codigo);
        this.setCargaHoraria(cargaHoraria);
        this.setSala(sala);
        this.setNome(nome);
        this.setNomeProfessor(nomeProfessor);
        this.setValorCurso(valorCurso);
        this.setAlunos(alunos);
        this.strictoSensu = strictoSensu;
    }

    public void setAdicionalDiploma(){
        int qtdAlunos = this.alunos.size();
        if(qtdAlunos<=5) this.adicionalDiploma = qtdAlunos*45;
        if(qtdAlunos>5&&qtdAlunos<=15) this.adicionalDiploma = qtdAlunos*43;
        if(qtdAlunos>15&&qtdAlunos<=30) this.adicionalDiploma = qtdAlunos*40;
        if(qtdAlunos>30) this.adicionalDiploma = qtdAlunos*36;
    }

    @Override
    public String toString() {
        return super.toString()+" - Stricto sensu: "+this.strictoSensu+" - Adicional Diploma: R$"+this.adicionalDiploma;
    }
}
