package maratonaJava.revisaoJavaCore;

// Crie uma String invertida sem usar funcao pronta

public class Ex06_InverterString {
    public static void main(String[] args) {

        String nome = "Alfredo";
        
        String invertida = "";

        for (int i = nome.length() -1; i >= 0 ; i--) {
            invertida += nome.charAt(i);
        }
        System.out.println("String invertida: " +invertida);
    }
}
