package maratonaJava.introducao;

public class Aula01OperadoresAritmeticoseLogicos {
    public static void main (String[] args) {
// + - / *
    int num01 = 10;
    int num02 = 20;
    int result = num01 + num02;
    System.out.println(result);

//  %
    int resto = 21 % 2;
        System.out.println(resto);

//  OPERADORES LOGICOS  < > <= >= == !=
        boolean isDezmaiorVinte = 10 > 20;
        System.out.println(isDezmaiorVinte);

//  OPERADORES LOGICOS AND, OR LOGICO e NOT LOGICO
//  AND &&: todas as condições precisam ser verdadeiras para o resultado final ser verdadeiro
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorTrinta " +isDentroDaLeiMaiorTrinta);
        System.out.println  ("isDentroDaLeiMenorTrinta " +isDentroDaLeiMenorTrinta);

//  OR ||: usado para verificar se pelo menos uma das condicoes e verdadeira
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float  valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel "+ isPlayStationCincoCompravel);

    }
}
