package maratonaJava.objetos.Gassossiacao.test;

import maratonaJava.objetos.Gassossiacao.dominio.Jogador;

public class JogadorTest01  {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Ronaldo");
        Jogador [] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}
