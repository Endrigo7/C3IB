package school.cesar.c3ib.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente extends Object {

    private String nome;
    private String sobrenome;
    private Integer idade;

    public Cliente() {
        super();
    }

}
