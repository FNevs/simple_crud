import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        SistemaDeCadastro sistema = new SistemaDeCadastro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir novo aluno");
            System.out.println("2. Incluir novo professor");
            System.out.println("3. Incluir novo curso");
            System.out.println("4. Consultar aluno");
            System.out.println("5. Consultar professor");
            System.out.println("6. Consultar curso");
            System.out.println("7. Alterar dados de aluno");
            System.out.println("8. Alterar dados de professor");
            System.out.println("9. Alterar dados de curso");
            System.out.println("10. Excluir aluno");
            System.out.println("11. Excluir professor");
            System.out.println("12. Excluir curso");
            System.out.println("13. Imprimir lista de alunos");
            System.out.println("14. Imprimir lista de professores");
            System.out.println("15. Imprimir lista de cursos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Idade do aluno: ");
                    int idadeAluno = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Nível do aluno: ");
                    String nivelAluno = scanner.nextLine();
                    Aluno aluno = new Aluno(nomeAluno, idadeAluno, nivelAluno);
                    sistema.adicionarAluno(aluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("Idade do professor: ");
                    int idadeProfessor = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Especialização do professor: ");
                    String especializacaoProfessor = scanner.nextLine();
                    Professor professor = new Professor(nomeProfessor, idadeProfessor, especializacaoProfessor);
                    sistema.adicionarProfessor(professor);
                    System.out.println("Professor adicionado com sucesso!");
                    break;
                case 3:
                    System.out.print("Nome do curso: ");
                    String nomeCurso = scanner.nextLine();
                    System.out.print("Nome do professor responsável: ");
                    String nomeProfessorCurso = scanner.nextLine();
                    Professor professorCurso = sistema.consultarProfessor(nomeProfessorCurso);
                    if (professorCurso != null) {
                        Curso curso = new Curso(nomeCurso, professorCurso);
                        sistema.adicionarCurso(curso);
                        System.out.println("Curso adicionado com sucesso!");
                    } else {
                        System.out.println("Professor não encontrado. Curso não adicionado.");
                    }
                    break;
                case 4:
                    System.out.print("Nome do aluno: ");
                    String nomeAlunoConsulta = scanner.nextLine();
                    Aluno alunoConsulta = sistema.consultarAluno(nomeAlunoConsulta);
                    if (alunoConsulta != null) {
                        System.out.println(alunoConsulta);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Nome do professor: ");
                    String nomeProfessorConsulta = scanner.nextLine();
                    Professor professorConsulta = sistema.consultarProfessor(nomeProfessorConsulta);
                    if (professorConsulta != null) {
                        System.out.println(professorConsulta);
                    } else {
                        System.out.println("Professor não encontrado.");
                    }
                    break;
                case 6:
                    System.out.print("Nome do curso: ");
                    String nomeCursoConsulta = scanner.nextLine();
                    Curso cursoConsulta = sistema.consultarCurso(nomeCursoConsulta);
                    if (cursoConsulta != null) {
                        System.out.println(cursoConsulta);
                    } else {
                        System.out.println("Curso não encontrado.");
                    }
                    break;
                case 7:
                    System.out.print("Nome do aluno a alterar: ");
                    String nomeAlunoAlterar = scanner.nextLine();
                    Aluno alunoAlterar = sistema.consultarAluno(nomeAlunoAlterar);
                    if (alunoAlterar != null) {
                        System.out.print("Novo nome do aluno: ");
                        String novoNomeAluno = scanner.nextLine();
                        System.out.print("Nova idade do aluno: ");
                        int novaIdadeAluno = scanner.nextInt();
                        scanner.nextLine();  
                        System.out.print("Novo nível do aluno: ");
                        String novoNivelAluno = scanner.nextLine();
                        alunoAlterar.setNome(novoNomeAluno);
                        alunoAlterar.setIdade(novaIdadeAluno);
                        alunoAlterar.setNivel(novoNivelAluno);
                        System.out.println("Dados do aluno alterados com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 8:
                    System.out.print("Nome do professor a alterar: ");
                    String nomeProfessorAlterar = scanner.nextLine();
                    Professor professorAlterar = sistema.consultarProfessor(nomeProfessorAlterar);
                    if (professorAlterar != null) {
                        System.out.print("Novo nome do professor: ");
                        String novoNomeProfessor = scanner.nextLine();
                        System.out.print("Nova idade do professor: ");
                        int novaIdadeProfessor = scanner.nextInt();
                        scanner.nextLine();  
                        System.out.print("Nova especialização do professor: ");
                        String novaEspecializacaoProfessor = scanner.nextLine();
                        professorAlterar.setNome(novoNomeProfessor);
                        professorAlterar.setIdade(novaIdadeProfessor);
                        professorAlterar.setEspecializacao(novaEspecializacaoProfessor);
                        System.out.println("Dados do professor alterados com sucesso!");
                    } else {
                        System.out.println("Professor não encontrado.");
                    }
                    break;
                case 9:
                    System.out.print("Nome do curso a alterar: ");
                    String nomeCursoAlterar = scanner.nextLine();
                    Curso cursoAlterar = sistema.consultarCurso(nomeCursoAlterar);
                    if (cursoAlterar != null) {
                        System.out.print("Novo nome do curso: ");
                        String novoNomeCurso = scanner.nextLine();
                        System.out.print("Nome do novo professor responsável: ");
                        String nomeNovoProfessorCurso = scanner.nextLine();
                        Professor novoProfessorCurso = sistema.consultarProfessor(nomeNovoProfessorCurso);
                        if (novoProfessorCurso != null) {
                            cursoAlterar.setNome(novoNomeCurso);
                            cursoAlterar.setProfessor(novoProfessorCurso);
                            System.out.println("Dados do curso alterados com sucesso!");
                        } else {
                            System.out.println("Novo professor não encontrado. Dados do curso não alterados.");
                        }
                    } else {
                        System.out.println("Curso não encontrado.");
                    }
                    break;
                case 10:
                    System.out.print("Nome do aluno a excluir: ");
                    String nomeAlunoExcluir = scanner.nextLine();
                    Aluno alunoExcluir = sistema.consultarAluno(nomeAlunoExcluir);
                    if (alunoExcluir != null) {
                        sistema.removerAluno(alunoExcluir);
                        System.out.println("Aluno excluído com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 11:
                    System.out.print("Nome do professor a excluir: ");
                    String nomeProfessorExcluir = scanner.nextLine();
                    Professor professorExcluir = sistema.consultarProfessor(nomeProfessorExcluir);
                    if (professorExcluir != null) {
                        sistema.removerProfessor(professorExcluir);
                        System.out.println("Professor excluído com sucesso!");
                    } else {
                        System.out.println("Professor não encontrado.");
                    }
                    break;
                case 12:
                    System.out.print("Nome do curso a excluir: ");
                    String nomeCursoExcluir = scanner.nextLine();
                    Curso cursoExcluir = sistema.consultarCurso(nomeCursoExcluir);
                    if (cursoExcluir != null) {
                        sistema.removerCurso(cursoExcluir);
                        System.out.println("Curso excluído com sucesso!");
                    } else {
                        System.out.println("Curso não encontrado.");
                    }
                    break;
                case 13:
                    System.out.println("Lista de alunos:");
                    for (Aluno a : sistema.getAlunos()) {
                        System.out.println(a);
                    }
                    break;
                case 14:
                    System.out.println("Lista de professores:");
                    for (Professor p : sistema.getProfessores()) {
                        System.out.println(p);
                    }
                    break;
                case 15:
                    System.out.println("Lista de cursos:");
                    for (Curso c : sistema.getCursos()) {
                        System.out.println(c);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
