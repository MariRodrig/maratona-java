package maratonaJava.objetos.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println("path "+file.getAbsolutePath()); // mostra o caminho todo do arquivo
            System.out.println("is directory "+file.isDirectory()); // mostra se é um diretório
            System.out.println("is file "+file.isFile()); // mostra se é um arquivo
            System.out.println("is hidden "+file.isHidden()); // mostra se o arquivo é oculto
            System.out.println("last modified "+file.lastModified()); // mostra quando foi modificado
            boolean exists = file.exists();
            if (exists){
            System.out.println("Deleted "+file.delete());
        }
    } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}