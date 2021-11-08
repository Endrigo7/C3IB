package school.cesar.c3ib.validations;

import school.cesar.c3ib.entities.Cliente;

public class ClienteValidation {

    public static void validar(Cliente cliente) {
        validaCamposObrigatorios(cliente);
        validaIdadeMinima(cliente);
    }

    private static void validaCamposObrigatorios(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().trim().equals("")) {
            throw new RuntimeException("Nome deve ser preenchido");
        }

        if (cliente.getSobrenome() == null || cliente.getSobrenome().trim().equals("")) {
            throw new RuntimeException("Sobrenome deve ser preenchido");
        }
    }

    private static void validaIdadeMinima(Cliente cliente) {
        if (cliente.getIdade() < 18) {
            throw new RuntimeException("Cliente não pode ter menos de 18 anos");
        }
    }

}
