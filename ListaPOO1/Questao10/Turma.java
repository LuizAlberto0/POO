package ListaPOO1.Questao10;

import java.security.SecureRandom;
import java.util.*;

public class Turma {
    private final String codigo;
    private ArrayList<Aluno> alunos;

    public Turma(){ this.codigo = randomString.gerarID(3);
        this.alunos = new ArrayList<>();
    }

    public boolean adicionarAluno(Aluno a){
        for(Aluno b : alunos){
            if(b.getMatricula().equals(a.getMatricula())) return false;
        }
        this.alunos.add(a);
        return true;
    }
    public boolean removerAlunoPorMatricula(String matricula){
        return alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }
    public Aluno buscarPorMatricula(String matricula){
        Aluno a = new Aluno();
        for(Aluno b : this.alunos){
            if(b.getMatricula().equals(matricula)) return b;
        }
        return null;
    }
    public ArrayList<Aluno> buscarPorNomeContendo(String nome){
        ArrayList<Aluno> alunosComNomeContido = new ArrayList<>();
        for(Aluno a : alunos){
            if(a.getNome().contains(nome)) alunosComNomeContido.add(a);
        }
        return alunosComNomeContido;
    }
    public String listarAlunos(){ return this.alunos.toString(); }
    public int getQuantidade(){ return alunos.size(); }
    public String getCodigo(){ return this.codigo; }
    public ArrayList<Aluno> getAlunos(){ return this.alunos; }
}
class randomString{
    private static final String CHARS = "1234567890";
    private static final SecureRandom random = new SecureRandom();

    public static String gerarID(int x){
        StringBuilder sb = new StringBuilder(x);
        for(int i = 0; i < x; i++) sb.append(CHARS.charAt(random.nextInt(CHARS.length())));
        return sb.toString();
    }
}
