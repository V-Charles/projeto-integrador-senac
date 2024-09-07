
package entities;

import java.util.Date;

public class Proprietario extends Morador{
    
    public Proprietario(){
        super();
    }

    public Proprietario(Contato contato, String nome, String documento, Date dataNasc) {
        super(contato, nome, documento, dataNasc);
    }
}
