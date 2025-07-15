package maratonaJava.objetos.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
// 0 - Bloco de inicializacao estático é executado quando a JVM carregar classe
// 1 - Alocado espaço em memoria por objeto
// 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada
// 3 - Bloco de inicializacao é exectado
// 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicializacao estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 3");
    }
    {
    System.out.println("Dentro do bloco de inicializacao não estático");
}

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
