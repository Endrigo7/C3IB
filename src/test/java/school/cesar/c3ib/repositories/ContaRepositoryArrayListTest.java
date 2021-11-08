package school.cesar.c3ib.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import school.cesar.c3ib.entities.Conta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ContaRepositoryArrayListTest {

    private ContaRepositoryArrayList contaRepositoryArrayList;

    @BeforeEach
    public void setup() {
        contaRepositoryArrayList = ContaRepositoryArrayList.getInstance();
        contaRepositoryArrayList.add(new Conta("1", 10, "123", null));
        contaRepositoryArrayList.add(new Conta("2", 20, "123", null));
    }

    @Test
    public void deveRetornaContaQuandoContaExistirNoArrayEABuscaFor() {
        Conta retornoEsperado = new Conta("1", 10, "123", null);
        Conta retornoObtido = contaRepositoryArrayList.buscarComFor("1");
        assertEquals(retornoEsperado, retornoObtido);
    }

    @Test
    public void deveRetornaNullQuandoContaNaoExistirNoArrayEABuscaFor() {
        Conta retornoObtido = contaRepositoryArrayList.buscarComFor("123456");
        assertNull(retornoObtido);
    }

    @Test
    public void deveRetornaContaQuandoContaExistirNoArrayEABuscaForEach() {
        Conta retornoEsperado = new Conta("1", 10, "123", null);
        Conta retornoObtido = contaRepositoryArrayList.buscarComFor("1");
        assertEquals(retornoEsperado, retornoObtido);
    }

    @Test
    public void deveRetornaNullQuandoContaNaoExistirNoArrayEABuscaForEach() {
        Conta retornoObtido = contaRepositoryArrayList.buscarComFor("123456");
        assertNull(retornoObtido);
    }

    @Test
    public void deveRetornaContaQuandoContaExistirNoArray() {
        Conta retornoEsperado = new Conta("1", 10, "123", null);
        Conta retornoObtido = contaRepositoryArrayList.buscarComStream("1");
        assertEquals(retornoEsperado, retornoObtido);
    }

    @Test
    public void deveRetornaNullQuandoContaNaoExistirNoArray() {
        Conta retornoObtido = contaRepositoryArrayList.buscarComStream("123456");
        assertNull(retornoObtido);
    }

}
