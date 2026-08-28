package maratonaJava.objetos.Vio.test;

// File: trabalha com o arquivo em si
// FileWriter: é pra escrever um arquivo mas não é otimizada
// FileReade: só para leitura
// BufferedWriter: escrita no arquivo com dados em memoria, melhor performance
//  BufferedReade: leitura mais eficiente, com performance melhor

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Excelente curso de Java!");
            fw.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
