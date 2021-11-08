package school.cesar.c3ib.entities;

import lombok.Data;

@Data
public class Poupanca extends Conta {

    public Poupanca(){
    }

    public Poupanca(String numero){
        super(numero);
    }

    public Poupanca(String numero, double saldo, String senha, Cliente cliente){
        super(numero, saldo, senha, cliente);
    }

    public void renderJuros(){
        double juros = getSaldo() * 0.005;
        creditar(juros);
    }

    @Override
    public String toString(){
        return "Poupanca(numero= " + getNumero()
                + ", saldo=" + getSaldo()
                + ", senha=" + getSenha()
                + ", cliente=" + getCliente() + ")";
    }
}
