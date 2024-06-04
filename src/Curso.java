import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    @Override
    public String toString() {
        return "Curso: " + nome + ", Professor: " + professor + ", Alunos: " + alunos;
    }
}
