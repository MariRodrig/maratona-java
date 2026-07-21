package maratonaJava.revisaoJavaCore.Ex48_List01;

//  Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários.
//  Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
//  Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
//  mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
//  Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
//  Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionariosTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de funcionários que serão registrados:");
        int numFunc = sc.nextInt();
        sc.nextLine();

        List<Funcionarios> funcionarios = new ArrayList<>();

        for (int i = 0; i < numFunc; i++) {

            System.out.println("Digite o id do funcionário:");
            int idFunc = sc.nextInt();
            sc.nextLine();

            boolean idExiste = false;

            for (Funcionarios funcionario : funcionarios) {
                if (funcionario.getId() == idFunc) {
                    idExiste = true;
                    break;
                }
            }

            if (idExiste) {
                System.out.println("Id já cadastrado!");
            } else {

                System.out.println("Digite o nome do funcionário:");
                String nomeFunc = sc.nextLine();

                System.out.println("Digite o salário do funcionário:");
                double salFunc = sc.nextDouble();
                sc.nextLine();

                Funcionarios funcionario = new Funcionarios(nomeFunc, idFunc, salFunc);
                funcionarios.add(funcionario);
            }
        }

        System.out.println("Insira o ID do funcionário que receberá o aumento salarial:");
        int idAumenSal = sc.nextInt();

        System.out.println("Insira a porcentagem do aumento:");
        double porcentagem = sc.nextDouble();

        boolean funcionarioEncontrado = false;

        for (Funcionarios funcionario : funcionarios) {
            if (funcionario.getId() == idAumenSal) {
                funcionario.aumentarSalario(porcentagem);
                funcionarioEncontrado = true;
                break;
            }
        }

        if (!funcionarioEncontrado) {
            System.out.println("Esse ID não existe!");
        }

        System.out.println();
        System.out.println("Lista de funcionários:");

        for (Funcionarios funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        sc.close();
    }
}