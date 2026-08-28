package maratonaJava.introducao;

public class Aula06EstruturasCondicionaisIfElse {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        }else{
            System.out.println("Nao autorizado a comprar bebida alcoolica");
        }
    }
}
