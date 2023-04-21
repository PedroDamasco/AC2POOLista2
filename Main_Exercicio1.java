import java.util.ArrayList;
import java.util.Scanner;

public class Ex01Main {

	public static void main(String[] args) {
		int opcao = 0;
        Scanner tec = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();

        while (opcao != 6) {
            System.out.println("§");
            System.out.println("Criar Curso ->1");
            System.out.println("Criar Aluno ->2");
            System.out.println("Remover Aluno ->3");
            System.out.println("Mostrar Todos os Cursos ->4");
            System.out.println("Mostra alunos do curso ->5");
            System.out.println("Sair -> 6");
            opcao = Integer.parseInt(tec.nextLine());
            
            switch (opcao) {
                case 1 -> {
                    Curso c = new Curso();
                    System.out.println("Digite o código do curso");
                    c.setCodigo(Integer.parseInt(tec.nextLine()));
                    System.out.println("Digite o nome do curso");
                    c.setNome(tec.nextLine());
                    System.out.println("Digite a carga horária");
                    c.setCargaHoraria(Integer.parseInt(tec.nextLine()));
                    cursos.add(c);
                }
                case 2 -> {
                    Aluno a = new Aluno();
                    System.out.println("Digite o Ra.");
                    a.setRa(tec.nextLine());
                    System.out.println("Digite o Nome");
                    a.setNome(tec.nextLine());
                    System.out.println("Selecione o Curso");
                    for (int i = 0; i < cursos.size(); i++) {
                        int x = i + 1;
                        System.out.println(x +" - " + cursos.get(i).getNome());
                    }
                    int opcaoDeCurso = Integer.parseInt(tec.nextLine());
                    cursos.get(opcaoDeCurso - 1).setAlunos(a);
                }
                case 3 -> {
                    System.out.println("Digite o nome do aluno a ser removido");
                    String nomeAlunoRemover = tec.nextLine();
                    for (Curso curso : cursos) {
                        for (int i = 0; i < curso.getAlunos().size(); i++) {
                            if (nomeAlunoRemover.
                                    equals(curso.getAlunos().get(i).getNome())) {
                                curso.removerAluno(i);
                            }
                        }
                    }
                }
                case 4 -> {
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimir());
                    }
                }
                case 5 -> {
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimirCompleto());
                    }
                }
                case 6 -> System.out.println("Adeus");
                default -> System.out.println("Não existente tente novamente.");
            }
            
        }
    }
