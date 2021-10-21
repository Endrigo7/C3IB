package school.cesar.c3ib.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conta {

    private String numero;
    public double saldo;
    private String senha;
    private Cliente cliente;

    public void debitar(double valor){
        saldo = saldo - valor;
    }
}
