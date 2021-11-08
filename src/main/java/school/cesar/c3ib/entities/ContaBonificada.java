package school.cesar.c3ib.entities;

public class ContaBonificada extends  Conta{

    public ContaBonificada(){
        super();
    }

    public ContaBonificada(String numero){
        super(numero);
    }

    public ContaBonificada(String numero, double saldo, String senha, Cliente cliente){
        super(numero, saldo, senha, cliente);
    }

    @Override
    public String toString(){
        return "ContaBonificada(numero= " + getNumero()
                + ", saldo=" + getSaldo()
                + ", senha=" + getSenha()
                + ", cliente=" + getCliente() + ")";
    }

}
