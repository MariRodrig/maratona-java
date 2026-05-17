package maratonaJava.revisaoJavaCore.Ex29_CRUDFuncionarios.test;

/*  Crie uma classe chamada Funcionario com os atributos:
nome, idade e salario
Crie: construtor, getters e toString
Crie uma lista de funcionários
Adicione 5 funcionários
Mostre todos os funcionários
Aumente o salário de um funcionário específico
Remova um funcionário pelo nome
Mostre os funcionários atualizados
DESAFIO: Use Stream para mostrar apenas funcionários com salário >= 6000
*/

import maratonaJava.revisaoJavaCore.Ex29_CRUDFuncionarios.dominio.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Lucas", 25, 6000.00));
        funcionarios.add(new Funcionario("Leticia", 31, 9500.00));
        funcionarios.add(new Funcionario("Rodrigo", 28, 4000.00));
        funcionarios.add(new Funcionario("Fernanda", 34, 3500.00));
        funcionarios.add(new Funcionario("Gabriel", 32, 5500.00));

        System.out.println("\nFuncionarios:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals("Leticia")) {
                funcionario.setSalario(funcionario.getSalario() * 1.10);
                break;
            }
        }

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals("Rodrigo")) {
                funcionarios.remove(funcionario);
                break;
            }
        }
        System.out.println("\nFuncionarios atualizados:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        System.out.println("\nFuncionarios com salario >= 6000.00:");
        funcionarios.stream()
                .filter(funcionario -> funcionario.getSalario() >= 6000.00)
                .forEach(System.out::println);
    }
}