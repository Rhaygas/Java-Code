import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        System.out.println("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = salario.nextDouble();

        double percentualAumento;
        double salarioNovo;
        double aumento;
        double aumentoReal;

        if (salarioAtual <= 280.0) {
            percentualAumento = 20.0;
        } else if (salarioAtual <= 700.0) {
            percentualAumento = 15.0;
        } else if (salarioAtual <= 1500.0) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }

        aumento = salarioAtual * (percentualAumento / 100);
        salarioNovo = salarioAtual + aumento;
        aumentoReal = aumento - (aumento * 0.038);

        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.2f%%%n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n", salarioNovo);
        System.out.printf("Valor do aumento real, descontada a inflação: R$ %.2f%n", aumentoReal);

    }
}
