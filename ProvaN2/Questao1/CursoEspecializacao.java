package ProvaN2.Questao1;

import java.util.ArrayList;

public class CursoEspecializacao extends Curso{
    private boolean latoSensu;
    private double adicionalDiploma;

    public CursoEspecializacao(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<Aluno> alunos, boolean latoSensu){
        this.setCodigo(codigo);
        this.setCargaHoraria(cargaHoraria);
        this.setSala(sala);
        this.setNome(nome);
        this.setNomeProfessor(nomeProfessor);
        this.setValorCurso(valorCurso);
        this.setAlunos(alunos);
        this.latoSensu=latoSensu;
    }
    public void setAdicionalDiploma(){
        int qtdAlunos = this.alunos.size();
        if(qtdAlunos<=10) this.adicionalDiploma = qtdAlunos*25;
        if(qtdAlunos>10&&qtdAlunos<=30) this.adicionalDiploma = qtdAlunos*20;
        if(qtdAlunos>30) adicionalDiploma = qtdAlunos*18;
    }

    @Override
    public String toString() {
        return super.toString()+" - Lato Sensu: "+this.latoSensu+" - Adicional Diploma: R$"+this.adicionalDiploma;
    }
}
