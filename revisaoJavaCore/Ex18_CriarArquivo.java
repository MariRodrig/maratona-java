package maratonaJava.revisaoJavaCore;

// Crie um programa que crie um arquivo chamado "dados.txt".
// Utilize classes do Java para manipulação de arquivos.
// Caso ocorra erro na criação do arquivo, trate utilizando try-catch.
// Exiba uma mensagem informando se o arquivo foi criado com sucesso ou não.

import java.io.File;
import java.io.IOException;

public class Ex18_CriarArquivo {
    public static void main(String[] args) {

        File arquivo = new File("dados.txt");

        try{
            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e){
            System.out.println("Erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }
}
