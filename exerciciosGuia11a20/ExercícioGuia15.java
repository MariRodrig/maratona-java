package maratonaJava.exercíciosGuia1a10;

/*     Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
meses e dias essa pessoa ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)       */

import java.util.Scanner;

public class ExercícioGuia15 {

    static class DiaExercicio15{
        int diaAtual;
        int mesAtual;
        int anoAtual;

    DiaExercicio15(int dia, int mes, int ano){
        this.diaAtual = dia;
        this.mesAtual = mes;
        this.anoAtual = ano;
    }
}
    public static void main(String[] args) {
        DiaExercicio15  objetoAno = new DiaExercicio15(03,9,2025);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dia de nascimento: ");
        int diaNascimento = sc.nextInt();
        System.out.println("Mês de nascimento: ");
        int mesNascimento = sc.nextInt();
        System.out.println("Ano de nascimento: ");
        int anoNascimento = sc.nextInt();

       int ano = objetoAno.anoAtual - anoNascimento;
       int mes = objetoAno.mesAtual - mesNascimento;
       int dia = objetoAno.diaAtual - diaNascimento;

        if(dia < 0){
            dia += 30;
            mes -= 1;
        }

       if(mes <0){
           mes += 12;
           ano -= 1;
       }

    /*   if(ano < 0){
           System.out.println("Data de nascimento no futuro. Verifique os valores.");
       } */

        System.out.println(ano + " anos "+ mes + " meses e " + dia + " dias.");
    }
}
