package ProvaN2.Questao1;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private int cargaHoraria;
    private int sala;
    private String nome;
    private String nomeProfessor;
    private double valorCurso;
    ArrayList<Aluno> alunos;

    public Curso(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<Aluno> alunos){
        this.codigo=codigo;
        this.cargaHoraria=cargaHoraria;
        this.sala=sala;
        this.nome=nome;
        this.nomeProfessor=nomeProfessor;
        this.valorCurso=valorCurso;
        this.alunos=alunos;
    }
    public Curso(){}

    public void setCodigo(int codigo) { this.codigo = codigo;}
    public int getCodigo() { return this.codigo; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
    public int getCargaHoraria() { return cargaHoraria; }
    public void setSala(int sala) { this.sala = sala; }
    public int getSala() { return this.sala; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }
    public void setNomeProfessor(String nomeProfessor) { this.nomeProfessor = nomeProfessor; }
    public String getNomeProfessor() { return this.nomeProfessor; }
    public void setValorCurso(double valorCurso) { this.valorCurso = valorCurso; }
    public double getValorCurso() { return this.valorCurso; }
    public void setAlunos(ArrayList<Aluno> alunos) { this.alunos = alunos; }
    public ArrayList<Aluno> getAlunos() { return this.alunos; }

    public String toString(){
        return "Código: "+this.codigo+" - Nome: "+this.nome+" - Carga Horária: "+this.cargaHoraria+" horas - Nome Professor: "+this.nomeProfessor+" - Valor do Curso: R$"+this.valorCurso;
    }
}
