package maratonaJava.objetos.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)){
//            char [] in = new char[1];
//            fr.read(in);     read: retorna a quantitade de caracteres lidos dentro do array
//            for (char c : in) {
//                System.out.println(c);
//            }
            int i;
            while ((i= fr.read() )!= -1){
                System.out.print((char)i);
            }
            System.out.println(fr.read());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
