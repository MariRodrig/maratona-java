package maratonaJava.revisaoJavaCore.Ex13_SistemaFuncionarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Leticia", 2000);
        System.out.println("Funcionario bonus: " + funcionario.calcularBonus());

        Gerente gerente = new Gerente("Leticia", 2000);
        System.out.println("Gerente bonus: " + gerente.calcularBonus());
    }
}
