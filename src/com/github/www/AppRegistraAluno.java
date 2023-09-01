package com.github.www;

public class AppRegistraAluno {
    public static void main(String[] args) {
        /** Chama a Classe Registra Aluno */
        RegistraAluno paulo = new RegistraAluno();
        RegistraAluno bianca = new RegistraAluno();

        /** Insere os Dados dos Alunos */
        System.out.println();
        System.out.println("*********** ALUNOS ***********");
        System.out.println();
        paulo.setNome("Paulo");
        paulo.setCurso("Java");
        paulo.setIdade(27);
        paulo.setProfissao("Programador");

        bianca.setNome("Bianca");
        bianca.setCurso("Jornalismo");
        bianca.setIdade(23);
        bianca.setProfissao("Estagiaria");

        /** Printa na Tela */
        System.out.println("O nome do Aluno(a) é: " + paulo.getNome());
        System.out.println("O curso do Aluno(a) é: " + paulo.getCurso());
        System.out.println("A idade do Aluno(a) é: " + paulo.getIdade());
        System.out.println("A Profissão do Aluno(a) é: " + paulo.getProfissao());
        System.out.println();

        System.out.println("O nome do Aluno(a) é: " + bianca.getNome());
        System.out.println("O curso do Aluno(a) é: " +  bianca.getCurso());
        System.out.println("A idade do Aluno(a) é: " + bianca.getIdade());
        System.out.println("A Profissão do Aluno(a) é: " + bianca.getProfissao());
        System.out.println();
        System.out.println("*********** PAULO HENRIQUE AZEVEDO DO NASCIMENTO ***********");
        System.out.println();
        System.out.println("*********** FIM ***********");
        System.out.println();
    }
}
