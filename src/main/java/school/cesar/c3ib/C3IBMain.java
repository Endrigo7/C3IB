package school.cesar.c3ib;

import school.cesar.c3ib.entities.Cliente;
import school.cesar.c3ib.entities.Conta;
import school.cesar.c3ib.entities.Poupanca;

public class C3IBMain {

    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca();
        poupanca.creditar(100);
        poupanca.renderJuros();
        System.out.println(poupanca.getSaldo());

        Conta conta = new Conta();
        conta.creditar(100);
        System.out.println(conta);
    }

}
