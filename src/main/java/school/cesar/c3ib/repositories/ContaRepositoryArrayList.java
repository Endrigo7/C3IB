package school.cesar.c3ib.repositories;

import school.cesar.c3ib.entities.Conta;

import java.util.ArrayList;

public class ContaRepositoryArrayList implements ContaRepository {
    private static final ContaRepositoryArrayList INSTANCIA = new ContaRepositoryArrayList();

    private ArrayList<Conta> contas;

    private ContaRepositoryArrayList() {
        contas = new ArrayList<>();
    }

    public static ContaRepositoryArrayList getInstance() {
        return INSTANCIA;
    }

    @Override
    public void add(Conta conta) {
        contas.add(conta);
    }

    @Override
    public Conta buscarComFor(String numero) {
        for (int i = 0; i < contas.size(); i++) {
            Conta conta = contas.get(i);

            if (numero.equals(conta.getNumero())) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public Conta buscarComForEach(String numero) {
        for (Conta conta : contas) {
            if (numero.equals(conta.getNumero())) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public Conta buscarComStream(String numero) {  //Java 8
        return contas
                .stream()
                .filter(conta -> numero.equals(conta.getNumero()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void remove(String numero) {
        Conta conta = buscarComStream(numero);

        if (conta != null) {
            contas.remove(conta);
        }
    }
}
