package maratonaJava.objetos.Npolimorfismo.Test;

import maratonaJava.objetos.Npolimorfismo.repositorio.Repositorio;
import maratonaJava.objetos.Npolimorfismo.repositorio.RepositorioArquivo;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
