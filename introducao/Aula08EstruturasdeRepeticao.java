package maratonaJava.introducao;

public class Aula08EstruturasdeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        //      WHILE
        // se a condição for falsa, ele nao executa o codigo
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count = count + 1;
        }

//  DO WHILE: muito parecido com o While, a diferença é que ele vai executar pelo menos 1x
// independe se a condição é verdadeira ou falsa

        do {
            System.out.println("dentro do do-while");
        } while (count < 10);

//  FOR: usado quando sabemos o número de iterações de antemão
        for (int i=0 ; i < 10; i++){
            System.out.println("For " + i);
        }
    }
}

