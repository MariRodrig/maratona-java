package maratonaJava.objetos.Csobrecargametodos.test;

import maratonaJava.objetos.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Açao");
        anime.setGenero("Açao");
        anime.imprime();
    }
}

