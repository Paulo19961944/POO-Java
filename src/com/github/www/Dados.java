package com.github.www;
import java.util.Scanner;

public class Dados {
    public void Alunos() {
        Scanner scanner = new Scanner(System.in);

        // Crie instâncias de RegistraAluno para Aluno 1 e Aluno 2
        RegistraAluno aluno1 = new RegistraAluno();
        RegistraAluno aluno2 = new RegistraAluno();

        // Coleta dados do Aluno 1
        System.out.println("Digite os dados do Aluno 1:");
        System.out.print("Nome: ");
        aluno1.setNome(scanner.nextLine());
        System.out.print("Curso: ");
        aluno1.setCurso(scanner.nextLine());
        System.out.print("Idade: ");
        aluno1.setIdade(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        System.out.print("Profissão: ");
        aluno1.setProfissao(scanner.nextLine());

        // Coleta dados do Aluno 2
        System.out.println("\nDigite os dados do Aluno 2:");
        System.out.print("Nome: ");
        aluno2.setNome(scanner.nextLine());
        System.out.print("Curso: ");
        aluno2.setCurso(scanner.nextLine());
        System.out.print("Idade: ");
        aluno2.setIdade(scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        System.out.print("Profissão: ");
        aluno2.setProfissao(scanner.nextLine());

        // Fecha o scanner
        scanner.close();

        // Exibe os dados dos alunos
        System.out.println("\n*********** ALUNOS ***********\n");
        exibirDadosAluno(aluno1);
        exibirDadosAluno(aluno2);
        System.out.println("\n*********** FIM ***********\n");
    }

    // Método para exibir os dados de um aluno
    private void exibirDadosAluno(RegistraAluno aluno) {
        System.out.println("Nome do Aluno(a): " + aluno.getNome());
        System.out.println("Curso do Aluno(a): " + aluno.getCurso());
        System.out.println("Idade do Aluno(a): " + aluno.getIdade());
        System.out.println("Profissão do Aluno(a): " + aluno.getProfissao() + "\n");
    }
}
