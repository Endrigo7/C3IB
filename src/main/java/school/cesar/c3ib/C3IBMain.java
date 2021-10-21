package school.cesar.c3ib;

import school.cesar.c3ib.entities.Cliente;
import school.cesar.c3ib.entities.Conta;

public class C3IBMain {

    public static void main(String[] args) {
        String nome = "Josefina";
        String sobrenome = null;
        Integer idade = null;

        Cliente a = new Cliente();

        int x = 5;
        mudarValorX(x);
        System.out.println(x);

        Cliente y = new Cliente();
        System.out.println(y);

        mudarCliente(y);
        System.out.println(y);
        System.out.println(y.hashCode());
    }

    public static void mudarValorX(int x){
        x = 20;
    }

    public static void mudarCliente(Cliente x){ //0x10
        x.setNome("Maria");
        System.out.println(x.hashCode());
    }

}
