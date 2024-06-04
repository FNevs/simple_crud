import java.util.ArrayList;
import java.util.List;

public class SistemaDeCadastro {
    private List<Curso> cursos;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public SistemaDeCadastro() {
        cursos = new ArrayList<>();
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public Curso consultarCurso(String nome) {
        for (Curso curso : cursos) {
            if (curso.getNome().equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno consultarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
    }

    public Professor consultarProfessor(String nome) {
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                return professor;
            }
        }
        return null;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}
