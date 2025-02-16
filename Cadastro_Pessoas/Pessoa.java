package Cadastro_Pessoas;

public class Pessoa {  // Adicione "public" aqui
    private String nome;
    private int idade;
    private String curso;

    public Pessoa(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
}
