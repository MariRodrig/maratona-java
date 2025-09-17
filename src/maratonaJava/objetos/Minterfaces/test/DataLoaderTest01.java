package maratonaJava.objetos.Minterfaces.test;


import maratonaJava.objetos.Minterfaces.dominio.DataLoader;
import maratonaJava.objetos.Minterfaces.dominio.DatabaseLoader;
import maratonaJava.objetos.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}

