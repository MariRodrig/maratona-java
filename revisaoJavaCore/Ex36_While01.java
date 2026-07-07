package maratonaJava.revisaoJavaCore;

//  Escreva um programa que repita a leitura de uma senha até que ela seja válida.
//  Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
//  Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
//  Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Ex36_While01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senha = 2002;

        System.out.println("Digite a senha para acesso ao sistema:");
        int x = scanner.nextInt();

        while (x != senha) {
            System.out.println("Senha inválida!");
            x = scanner.nextInt();
        }
        if (x == senha) {
            System.out.println("Acesso permitido!");
        }
    }
}

