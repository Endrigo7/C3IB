package school.cesar.c3ib.entities;

import lombok.Data;

@Data
public class Poupanca {

    private String numero;
    public double saldo;
    private String senha;
    private Cliente cliente;

    public Poupanca(){
    }

    public void debitar(double valor){
        saldo = saldo - valor;
    }
}
