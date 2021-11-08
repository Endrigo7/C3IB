package school.cesar.c3ib.repositories;

import school.cesar.c3ib.entities.Conta;

import java.util.Arrays;

public class ContaRepositoryVector implements ContaRepository {
    private static final ContaRepositoryVector INSTANCIA = new ContaRepositoryVector();

    private Conta[] contas;
    private int quantidadeContasCadastradas;

    private ContaRepositoryVector() {
        contas = new Conta[2];
        quantidadeContasCadastradas = 0;
    }

    public static ContaRepositoryVector getInstance() {
        return INSTANCIA;
    }

    @Override
    public void add(Conta conta) {
        contas[quantidadeContasCadastradas] = conta;
        quantidadeContasCadastradas++;
    }

    @Override
    public Conta buscarComFor(String numero) {
        return null;
    }

    @Override
    public Conta buscarComForEach(String numero) {
        return null;
    }

    @Override
    public Conta buscarComStream(String numero) {
        return Arrays
                .stream(contas)
                .filter(c -> c.getNumero().equals(numero))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void remove(String numero) {

    }
}
