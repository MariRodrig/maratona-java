package maratonaJava.objetos.ZZClambdas.test;

// Reference to an instance method of a particular object

import maratonaJava.objetos.ZZClambdas.dominio.Anime;
import maratonaJava.objetos.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
