package maratonaJava.introducao;

public class ProjetoJava04EstruturasdeRepeticaoFor {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 a 100000
        for (int i = 0; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}