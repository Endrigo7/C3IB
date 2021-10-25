package school.cesar.c3ib.repositories;

import school.cesar.c3ib.entities.Conta;
import school.cesar.c3ib.entities.Poupanca;

import java.util.ArrayList;

/*
 * CRUD
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public class ContaRepository {

    private ArrayList<Conta> contas;

    public ContaRepository(){
        contas = new ArrayList<>();
    }

    public void add(Conta conta){
        contas.add(conta);
    }

    public Conta buscarComFor(String numero){
        for (int i = 0; i < contas.size(); i++){
            Conta conta = contas.get(i);

            if(numero.equals(conta.getNumero()) ){
                return conta;
            }
        }
        return null;
    }

    public Conta buscarComForEach(String numero){
        for (Conta conta: contas) {
            if(numero.equals(conta.getNumero()) ){
                return conta;
            }
        }
        return null;
    }

    public Conta buscarComStream(String numero){  //Java 8
        return contas
                .stream()
                .filter(conta -> numero.equals(conta.getNumero()))
                .findFirst()
                .orElse(null);
    }

    public void remove(String numero){
        Conta conta = buscarComStream(numero);

        if(conta != null) {
            contas.remove(conta);
        }
    }
}
