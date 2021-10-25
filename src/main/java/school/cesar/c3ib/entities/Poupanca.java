package school.cesar.c3ib.entities;

import lombok.Data;

@Data
public class Poupanca extends Conta {

    public Poupanca(){
        super();
    }

    public Poupanca(String numero){
        super(numero);
    }

    public Poupanca(String numero, double saldo, String senha, Cliente cliente){
        super(numero, saldo, senha, cliente);
    }

    public void renderJuros(){
        double novoSaldo = getSaldo() * 1.005;
        setSaldo (novoSaldo);
    }

    @Override
    public String toString(){
        return "Poupanca(numero= " + getNumero()
                + ", saldo=" + getSaldo()
                + ", senha=" + getSenha()
                + ", cliente=" + getCliente() + ")";
    }
}
