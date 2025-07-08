
package maratonaJava.objetos.Dconstrutores.test;

import maratonaJava.objetos.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Acao", "Producao IG");
        anime.imprime();
    }
}

