public class Aluno extends Pessoa {
    private String nivel;

    public Aluno(String nome, int idade, String nivel) {
        super(nome, idade);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nível: " + nivel;
    }
}
