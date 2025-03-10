package ExercicioDeFixacaoEstudante;

import java.util.Scanner;

public class ExFix03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a nota do 1º trimestre: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota do 2º trimestre: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota do 3º trimestre: ");
        double nota3 = sc.nextDouble();

        Student aluno = new Student(nome, nota1, nota2, nota3);

        double notaFinal = aluno.calcularNotaFinal();

        System.out.printf("\nNota final de %s: %.2f\n", aluno.getNome(), notaFinal);

        if (aluno.estaAprovado()){
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.printf("O aluno não está aprovado! Faltam %.2f pontos para aprovação", aluno.pontoFaltado());
        }
        sc.close();
    }
}
