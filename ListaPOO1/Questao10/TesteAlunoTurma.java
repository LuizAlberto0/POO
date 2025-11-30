package ListaPOO1.Questao10;

import java.util.*;

public class TesteAlunoTurma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Turma> turmas = new ArrayList<>();

        System.out.println("Para montar a turma, precisamos inserir alguns alunos. Responda as perguntas para cada aluno.");
        String resp, mat;
        int opc;
        do {
            System.out.println("### Montando turmas ###");
            System.out.println("Escolha alguma opção para criar turmas.");
            System.out.println("(0) - Criar turma.");
            System.out.println("(1) - Acessar turma específica pelo código.");
            System.out.println("(2) - Encerrar programa.");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 0:
                    Turma turma = new Turma();
                    System.out.println("Vamos criar e inserir os alunos na turma.");
                    do {
                        Aluno a = new Aluno();
                        System.out.println("Insira o nome do aluno:");
                        a.setNome(sc.nextLine());
                        System.out.println("Insira a matrícula do aluno:");
                        a.setMatricula(sc.nextLine());

                        if (!turma.adicionarAluno(a))
                            System.out.println("A operação para adicionar um aluno falhou! Aluno já está na turma.");
                        else turma.adicionarAluno(a);

                        System.out.println("Deseja continuar adicionando alunos à turma? (sim/não)");
                        resp = sc.nextLine().toLowerCase();
                    } while (resp.equals("sim"));
                    turmas.add(turma);
                    break;
                case 1:
                    System.out.println("### Lista de Turmas ###");
                    for (Turma a : turmas) System.out.println(turmas.indexOf(a) + 1 + " - " + a.getCodigo());
                    System.out.println("Insira o número referente à turma que deseja acessar.");
                    int t = sc.nextInt() - 1;
                    do {
                        System.out.println("### Turma " + turmas.get(t).getCodigo() + " ###");
                        System.out.println("(0) - Adicionar um aluno.");
                        System.out.println("(1) - Remover um aluno através da matrícula.");
                        System.out.println("(2) - Buscar um aluno.");
                        System.out.println("(3) - Listar os alunos da turma.");
                        System.out.println("(4) - Sair.");
                        opc = sc.nextInt();
                        sc.nextLine();
                        switch (opc) {
                            case 0:
                                Aluno a = new Aluno();
                                System.out.println("Insira o nome do aluno:");
                                a.setNome(sc.nextLine());
                                System.out.println("Agora, insira a matrícula do mesmo:");
                                a.setMatricula(sc.nextLine());

                                if (!turmas.get(t).adicionarAluno(a))
                                    System.out.println("A operação falhou! Aluno já está na turma.\n");
                                else {
                                    System.out.println("Aluno adicionado com sucesso!\n");
                                    turmas.get(t).adicionarAluno(a);
                                }
                                break;
                            case 1:
                                System.out.println("Insira a matrícula do aluno que desejas remover:");
                                mat = sc.nextLine();
                                if (!turmas.get(t).removerAlunoPorMatricula(mat))
                                    System.out.println("Operação falhou! Matrícula não encontrada.\n");
                                else {
                                    turmas.get(t).removerAlunoPorMatricula(mat);
                                    System.out.println("Aluno removido com êxito!\n");
                                }
                                break;
                            case 2:
                                System.out.println("Qual opção desejas utilizar para buscar um aluno?\n(1) - Através da matrícula;\n(2) - Pelo nome.");
                                int busca = sc.nextInt();
                                sc.nextLine();
                                switch(busca) {
                                    case 1:
                                        System.out.println("Insira a matrícula que desejas buscar:");
                                        mat = sc.nextLine();

                                        Aluno achado = turmas.get(t).buscarPorMatricula(mat);
                                        if(achado == null) {
                                           System.out.println("Matricula não encontrada");
                                        }
                                        else {
                                            System.out.println("Matricula encontrado!\n" + achado);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Insira o nome que desejas buscar:");
                                        String nome = sc.nextLine();
                                        if(turmas.get(t).buscarPorNomeContendo(nome)==null){
                                            System.out.println("Nome não encontrado na turma!");
                                            break;
                                        }
                                        System.out.println("Nome encontrado!\n" + turmas.get(t).buscarPorNomeContendo(nome));
                                        break;
                                    default:
                                        System.out.println("Opção inválida! Tente novamente.");
                                        break;
                                }
                            case 3:
                                System.out.println("### Alunos da Turma ###\n"+turmas.get(t).listarAlunos());
                                break;
                            case 4:
                                System.out.println("Retornando à tela de turmas.");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                                break;
                        }
                    } while (opc != 4);
                case 2:
                    System.out.println("Encerrando programa! Tenha um bom dia.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while (opc != 2) ;
    }
}
