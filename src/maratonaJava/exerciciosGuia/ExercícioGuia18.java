package maratonaJava.exercíciosGuia1a10;

//  Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
//  Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara supere Francisco.

public class ExercícioGuia18 {
    public static void main(String[] args) {

        int francisco = 150;
        int sara = 110;

        int cresceF = 2;
        int cresceS = 3;

        int anos = 0;

        while (sara <= francisco) {
            sara += cresceS;
            francisco += cresceF;
            anos++;
        }

            System.out.println("Serão necessários " + anos + " ano(s).");
            System.out.println("Alturas finais: Francisco = " + francisco + " cm, Sara = " + sara + " cm");
        }
    }
