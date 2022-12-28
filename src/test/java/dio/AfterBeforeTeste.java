package dio;
import org.junit.jupiter.api.*;

import one.dio.GerenciadorConexaoDB;
import one.dio.Pessoa;
import java.time.LocalDateTime;

public class AfterBeforeTeste {

    @BeforeAll
    static void configuraConexao() {
        GerenciadorConexaoDB.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        GerenciadorConexaoDB.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        GerenciadorConexaoDB.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorConexaoDB.finalizarConexao();
    }
}
