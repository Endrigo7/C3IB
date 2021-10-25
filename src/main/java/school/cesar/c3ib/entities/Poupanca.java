package school.cesar.c3ib.entities;

import lombok.Data;

@Data
public class Poupanca extends Conta {

    public Poupanca(){
    }

    public void renderJuros(){
        double novoSaldo = getSaldo() * 1.005;
        setSaldo (novoSaldo);
    }
}
