package maratonaJava.objetos.Npolimorfismo.repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}

