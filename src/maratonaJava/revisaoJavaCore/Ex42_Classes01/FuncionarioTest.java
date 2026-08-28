package maratonaJava.revisaoJavaCore.Ex42_Classes01;

//  Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
//  Em seguida, mostrar os dados do funcionário (nome e salário líquido).
//  Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem)
//  e mostrar novamente os dados do funcionário.


import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionario:");
        funcionario.nome = scanner.nextLine();
        System.out.println("Digite o salário bruto desse funcionario:");
        funcionario.salarioBruto = scanner.nextDouble();
        System.out.println("Digite o imposto do salário desse funcionario:");
        funcionario.imposto = scanner.nextDouble();

        System.out.printf("Funcionário: %s, $ %.2f%n", funcionario.nome, funcionario.salarioLiquido());

        System.out.println("Qual a porcentagem de aumento salarial? ");
        double porcentagem = scanner.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.printf("Salário atualizado: %s, $ %.2f", funcionario.nome, funcionario.salarioLiquido());

        scanner.close();
    }
}
