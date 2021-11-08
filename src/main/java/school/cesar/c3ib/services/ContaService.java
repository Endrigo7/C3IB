package school.cesar.c3ib.services;

import school.cesar.c3ib.entities.Conta;
import school.cesar.c3ib.repositories.ContaRepository;
import school.cesar.c3ib.repositories.ContaRepositoryArrayList;
import school.cesar.c3ib.validations.ClienteValidation;

public class ContaService {

    private ContaRepository contaRepository;

    public ContaService() {
        contaRepository = ContaRepositoryArrayList.getInstance();
    }

    public void add(Conta conta) {
        ClienteValidation.validar(conta.getCliente());
        contaRepository.add(conta);
    }

    public Conta buscar(String numero) {
        return contaRepository.buscarComStream(numero);
    }

    public void remove(String numero) {
        contaRepository.remove(numero);
    }
}
