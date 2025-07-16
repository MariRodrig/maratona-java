package maratonaJava.objetos.Hheranca.Teste;

import maratonaJava.objetos.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
// 0 - Bloco de inicializacao estático da super classe é executado quando a JVM carregar classe pai
// 1 - Bloco de inicializacao estático da sub classe é executado quando a JVM carregar classe filha
// 2 - Alocado espaço em memoria por objeto da superclasse
// 3 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado da classe pai
// 4 - Bloco de inicializacao da superclasse é executado na ordem em que aparece
// 4 - Construtor é executado da superclasse
// 6 - Alocado espaço em memoria por objeto da subclasse
// 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
// 8 - Bloco de inicializacao da subclasse é executado na ordem em que aparece
// 9 - Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Leticia");
    }
}
