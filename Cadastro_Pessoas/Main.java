package Cadastro_Pessoas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Pessoa p = new Pessoa("Bruno", 19, "Computação");

        // Coletar entrada
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        p.setNome(nome);

        // Coletando a idade
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        p.setIdade(idade);

        // Coletando o curso
        System.out.println("Digite o curso: ");
        String curso = scanner.next();
        p.setCurso(curso);

        scanner.close();

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Curso: " + p.getCurso());
    }
}
