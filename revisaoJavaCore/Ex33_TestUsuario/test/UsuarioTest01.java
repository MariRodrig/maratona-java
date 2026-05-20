package maratonaJava.revisaoJavaCore.Ex33_TestUsuario.test;

/*  Crie uma classe chamada Usuario com os atributos: nome, email e idade
Crie: constructor e getters
1. Crie um usuário
2. Teste se o nome é igual ao esperado
3. Teste se o email contém "@"
4. Teste se a idade é maior que 18
5. Teste se o objeto não é nulo
DESAFIO: Teste se dois usuários diferentes NÃO são iguais
*/

import maratonaJava.revisaoJavaCore.Ex33_TestUsuario.dominio.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UsuarioTest01 {
    @Test
    void shouldReturnTrue_WhenNameIsEqual() {
        Usuario usuario = new Usuario(
                "Afonso",
                "afonso.parreira@yahoo.com.br",
                35
        );

        Assertions.assertEquals("Afonso", usuario.getNome());
    }

    @Test
    void isEmailContainsArroba() {
        Usuario usuario = new Usuario(
                "Afonso",
                "afonso.parreira@yahoo.com.br",
                35
        );
        Assertions.assertTrue(usuario.getEmail().contains("@"));
    }

    @Test
    void shouldReturnTrue_WhenAgeIsGreaterThan18() {
        Usuario usuario = new Usuario(
                "Afonso",
                "afonso.parreira@yahoo.com.br",
                35
        );
        Assertions.assertTrue(usuario.getIdade() > 18);
    }

    @Test
    void isUser_shouldNotBeNull() {
        Usuario usuario = new Usuario(
                "Afonso",
                "afonso.parreira@yahoo.com.br",
                35
        );

        Assertions.assertNotNull(usuario);
    }

    @Test
    void shouldReturnTrue_WhenTwoUsersAreNotEqual() {
        Usuario usuario1 = new Usuario(
                "Afonso",
                "afonso.parreira@yahoo.com.br",
                35
        );

        Usuario usuario2 = new Usuario(
                "Alfredo",
                "silvaalfredo@yahoo.com.br",
                43
        );

        Assertions.assertNotEquals(usuario1, usuario2);
    }
}

