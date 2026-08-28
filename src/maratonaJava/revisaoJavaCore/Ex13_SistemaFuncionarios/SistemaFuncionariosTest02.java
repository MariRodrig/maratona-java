package maratonaJava.revisaoJavaCore.Ex13_SistemaFuncionarios;

// Criar a list<Funcionario>
// Adcionar funcionario e gerente, percorrer a lista e mostrar o bonus de cada um

import java.util.ArrayList;
import java.util.List;

public class SistemaFuncionariosTest02 {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Funcionario("Rafael", 2000);
        Gerente g1 = new Gerente("Lucas", 6000);

        funcionarios.add(f1);
        funcionarios.add(g1);

        for (Funcionario f : funcionarios){
            System.out.println("Nome: " + f.getNome());
            System.out.println("Bonus: " + f.calcularBonus());
            System.out.println("-----------");
        }
    }
}
