package ExercicioDeFixacaoFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class ExFix02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.println("Digite o salário bruto do funcionário: ");
        double salarioBruto = sc.nextDouble();

        System.out.println("Digite o valor do imposto do funcionário: ");
        double imposto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome,salarioBruto,imposto);

        System.out.println("\nDados do Funcionário: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário líquido: " + String.format("%.2f", funcionario.calcularSalarioLiquido()));

        System.out.println("\nDigite a porcentagem de aumento do salário: ");
        double porcentagem = sc.nextDouble();

        funcionario.aumentarSalario(porcentagem);


        System.out.println("\nDados do Funcionário após aumento: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário bruto após aumento: " + String.format("%.2f", funcionario.getSalarioBruto()));
        System.out.println("Salário líquido após aumento: "+ String.format("%.2f", funcionario.calcularSalarioLiquido()));

        sc.close();
    }
}
