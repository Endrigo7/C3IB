package school.cesar.c3ib;

import school.cesar.c3ib.entities.Cliente;
import school.cesar.c3ib.entities.Conta;
import school.cesar.c3ib.services.ContaService;

public class C3IBMain {

    private static ContaService contaService;

    public static void main(String[] args) {
        contaService = new ContaService();

        contaService.add(new Conta("10", 100, "123",
                new Cliente("Jair", "Jose", 19)));

        contaService.add(new Conta("11", 200, "123",
                new Cliente("Bruno", "Jose", 22)));

        contaService.add(new Conta("12", 300, "123",
                new Cliente("Paulo", "Jose", 31)));


        System.out.println(contaService.buscar("10"));
        System.out.println(contaService.buscar("11"));
        System.out.println(contaService.buscar("12"));
    }

}
