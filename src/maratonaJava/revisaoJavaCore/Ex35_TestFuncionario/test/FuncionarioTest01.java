package maratonaJava.revisaoJavaCore.Ex35_TestFuncionario.test;

/*  Crie uma classe chamada Funcionario com os atributos: nome, cargo e salario
Crie: constructor e getters
1. Crie um funcionário
2. Teste se o nome está correto
3. Teste se o cargo é igual ao esperado
4. Teste se o salário é maior que 3000
5. Teste se o objeto foi criado corretamente
DESAFIO: Teste se o salário NÃO é menor que 1000
*/

import maratonaJava.revisaoJavaCore.Ex35_TestFuncionario.dominio.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTest01 {

    @Test
    void shouldHaveCorrectName() {
        Funcionario funcionario = new Funcionario(
                "Charles",
                "Analista de Sistemas",
                5500.00
        );

        Assertions.assertEquals("Charles", funcionario.getNome());
    }

    @Test
    void shouldHaveExpectedPosition() {
        Funcionario funcionario = new Funcionario(
                "Charles",
                "Analista de Sistemas",
                5500.00
        );
        Assertions.assertEquals("Analista de Sistemas", funcionario.getCargo());
    }

    @Test
    void shouldHavePriceGreaterThan3000() {
        Funcionario funcionario = new Funcionario(
                "Charles",
                "Analista de Sistemas",
                5500.00
        );
        Assertions.assertTrue(funcionario.getSalario() > 3000.00);
    }

    @Test
    void shouldHaveEmployeeNotBeNull(){
        Funcionario funcionario = new Funcionario(
                "Charles",
                "Analista de Sistemas",
                5500.00
        );
        Assertions.assertNotNull(funcionario);
    }

    @Test
    void shouldHaveSalaryNotBeLowerThan1000(){
        Funcionario funcionario = new Funcionario(
                "Charles",
                "Analista de Sistemas",
                5500.00
        );
        Assertions.assertTrue(funcionario.getSalario() >= 1000);
    }
}
