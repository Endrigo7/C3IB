package school.cesar.c3ib;

import school.cesar.c3ib.entities.Cliente;
import school.cesar.c3ib.entities.Conta;
import school.cesar.c3ib.entities.Poupanca;
import school.cesar.c3ib.repositories.ContaRepository;

public class C3IBMain {

    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca();
        poupanca.setNumero("1");
        poupanca.creditar(100);
        System.out.println(poupanca.getSaldo());

        poupanca.renderJuros();
        System.out.println(poupanca.getSaldo());

        Conta conta = new Conta();
        conta.setNumero("2");
        conta.creditar(100);
        System.out.println(conta);

        ContaRepository contaRepository = new ContaRepository();
        contaRepository.add(conta);
        contaRepository.add(poupanca);

        System.out.println(
                "Encontrou a conta: " + contaRepository.buscarComStream("2")
        );

        System.out.println(
                "Encontrou a poupanca: " + contaRepository.buscarComStream("1")
        );

    }

}
