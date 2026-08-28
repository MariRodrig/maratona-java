package maratonaJava.introducao;

public class Aula06EstruturasCondicionaisOperadorTernario {
    public static void main(String[] args) {
        // Operador ternario: criado pra simplificar condicoes if e else
        // Doar se salario > 5000

        double salario = 8000;
        String mensagemDoar = "Eu vou doar 500 para Leticia";
        String mensagemNaoDoar = "Ainda nao tenho condições, mas vou ter!";
        // condição? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}

/* MESMO QUE ESSE CODIGO
 if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}*/
