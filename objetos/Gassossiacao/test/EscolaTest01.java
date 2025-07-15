package maratonaJava.objetos.Gassossiacao.test;

import maratonaJava.objetos.Gassossiacao.dominio.Escola;
import maratonaJava.objetos.Gassossiacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Alfredo Rodrigues");
        Professor professor2 = new Professor("Kakashi Rodrigues");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();

    }
}
