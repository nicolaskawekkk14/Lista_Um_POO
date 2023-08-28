package Lista;

import java.util.Scanner;

public class Questao20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor ganho por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorPorHora * horasTrabalhadas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto de IR (11%): R$ " + ir);
        System.out.println("Desconto de INSS (8%): R$ " + inss);
        System.out.println("Desconto de Sindicato (5%): R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}



