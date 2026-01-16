package maratonaJava.objetos.uRegex.test;

// Expressões regulares: linguagem desenvolvida que utiliza símbolos

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //  \d = todos os dígitos
        //  \D = tudo o que não for dígito
        //  \s = todos os espaços em branco \t \n \f \r
        //  \S = todos os caracteres excluindo os brancos
        //  \w = a-zA-Z, dígitos, _
        //  \W = tudo que nao for incluso no \w
        //  [] = traz o conjunto de caracter especificado entre []

    //    String regex = "\\d";
        String regex = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0X 0xFFABC 0X109 0X1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: "+texto2);
        System.out.println("índice: 0123456789");
        System.out.println("reger "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+"\n");
        }
    }
}
