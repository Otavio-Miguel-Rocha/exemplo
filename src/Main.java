import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //menu de login e inicial e funcionalidades do sistema
        System.out.println("Insira o seu nome: ");
        String nome = sc.next();
        System.out.println("Insira o seu CPF: ");
        long cpf = sc.nextLong();
        System.out.println("Insira o seu e-mail: ");
        String email = sc.next();
        Professor professorCadastrado = new Professor(nome, cpf,email);
    }
}
