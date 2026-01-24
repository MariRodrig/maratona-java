package maratonaJava.objetos.Ycolecoes.test;

import maratonaJava.objetos.Ycolecoes.dominio.Manga;
import maratonaJava.objetos.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

    class MangaPrecoComparator implements Comparator<Manga>{
        @Override
        public int compare(Manga o1, Manga o2) {
            return Double.compare(o1.getPreco(), o2.getPreco());
        }
    }

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.20));
        mangas.add(new Manga(2L, "Aaragon", 2.99));

        for (Manga manga : mangas) {  // descendingSet inverte a ordem
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 8.0, 5);

        //  lower < traz imediatamente o menor
        //  floor <= traz exatamente o mesmo elemento ou o logo abaixo
        //  higher > traz imediatamente o maior
        //  ceiling >= traz exatamente o mesmo elemento ou o primeiro superior

        System.out.println("-------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());   // pollFirst tira o primeiro elemento da lista
        System.out.println(mangas.pollLast());    // pollLast tira o último elemento
    }
}


