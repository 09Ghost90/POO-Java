package Cadastro_Pessoas;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Bruno", 19, "Computação");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Curso: " + p.getCurso());
    }
}
