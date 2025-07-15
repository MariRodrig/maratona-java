package maratonaJava.objetos.Gassossiacao.test;

import maratonaJava.objetos.Gassossiacao.dominio.Jogador;
import maratonaJava.objetos.Gassossiacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time ("Seleção Brasileira");

        jogador01.setTime(time);
        jogador01.imprime();
    }
}
