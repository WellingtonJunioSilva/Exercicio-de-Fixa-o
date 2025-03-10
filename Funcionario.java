package ExercicioDeFixacaoFuncionario;

public class Funcionario {
    private final String nome;
    private double salarioBruto;
    private final double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double calcularSalarioLiquido(){
        return salarioBruto - imposto;
    }

    public  void aumentarSalario(double porcentagem){
        salarioBruto += salarioBruto + porcentagem / 100;
    }

    public String getNome(){
        return nome;
    }

    public double getSalarioBruto(){
        return salarioBruto;
    }
}
