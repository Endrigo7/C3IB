package school.cesar.c3ib.repositories;

import school.cesar.c3ib.entities.Conta;

public interface ContaRepository {
    void add(Conta conta);

    Conta buscarComFor(String numero);

    Conta buscarComForEach(String numero);

    Conta buscarComStream(String numero);

    void remove(String numero);
}
