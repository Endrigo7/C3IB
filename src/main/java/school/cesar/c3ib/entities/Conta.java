package school.cesar.c3ib.entities;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Conta {

    private String numero;
    private double saldo;
    private String senha;
    private Cliente cliente;

    public Conta() {
        super();
    }

    public Conta(String numero) {
        this.numero = numero;
    }

    public void debitar(double valor) {
        saldo = saldo - valor;
    }

    public void creditar(double valor) {
        saldo += valor;
    }
}
