package maratonaJava.objetos.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIXE = 10;
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
