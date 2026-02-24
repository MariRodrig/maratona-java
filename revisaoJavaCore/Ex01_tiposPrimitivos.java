package maratonaJava.revisaoJavaCore;

/* Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, moro no endereco <endereco>,
confirmo que recebi o salario de <salario>, na data <data>
 */

import java.time.LocalDate;

public class Ex01_tiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Mariana";
        String endereco = "Rua Pitangui, 250";
        Double salario = 7.000;
        LocalDate data = LocalDate.now();

        System.out.println("Eu "+nome+ ", moro na "+endereco+ " confirmo querecebi o salario de "+salario+ ".");
    }
}
