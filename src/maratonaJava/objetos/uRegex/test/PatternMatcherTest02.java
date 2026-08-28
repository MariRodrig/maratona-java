package maratonaJava.objetos.uRegex.test;

// Expressões regulares: linguagem desenvolvida que utiliza símbolos

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //  \d = todos os dígitos
        //  \D = tudo o que não for dígito
        //  \s = todos os espaços em branco \t \n \f \r
        //  \S = todos os caracteres excluindo os brancos
        //  \w = a-Z Z-a, dígitos, _
        //  \W = tudo que nao for incluso no \w

        String regex = "\\d";
        String texto2 = "hhj212gvh21";
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
