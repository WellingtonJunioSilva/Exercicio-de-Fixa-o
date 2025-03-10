package ExercicioFixacaoRetangulo;

import java.util.Scanner;

public class ExFix01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os valores de largura e altura
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        // Criando o objeto do tipo Retangulo
        Retangulo retangulo = new Retangulo(largura, altura);

        // Exibindo os resultados
        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        System.out.println("O perímetro do retângulo é: " + retangulo.calcularPerimetro());
        System.out.println("A diagonal do retângulo é: " + String.format("%.2f", retangulo.calcularDiagonal()));

        scanner.close();
    }


}
