package dio;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import one.dio.Conta;
//import one.dio.TransferenciaEntreContas;

public class ExceptionsTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

       // TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

       //Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
        System.out.println(contaDestino);
        System.out.println(contaOrigem);
    }
}
