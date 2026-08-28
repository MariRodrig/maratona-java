package maratonaJava.objetos.Oexception.runtime.test;

public class RuntimeExcepetionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                System.out.println("Fechando arquivo liberado pelo S0");
        }
        return null;
    }

    private static void abreConexao2(){
    try {
        System.out.println("Abrindo arquivo");
        System.out.println("Escrevendo dados no arquivo");
        throw new RuntimeException();
    } finally {
        System.out.println("Fechando recurso liberado pelo S0");
    }
}
}