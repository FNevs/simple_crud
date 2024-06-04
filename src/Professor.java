public class Professor extends Pessoa {
    
    private String especializacao;

    public Professor(String nome, int idade, String especializacao) {
        super(nome, idade);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialização: " + especializacao;
    }
}
