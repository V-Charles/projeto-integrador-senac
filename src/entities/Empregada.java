
package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empregada extends Pessoa{
    
    private List<Residencia> listaDeEmpregadasArrayList = new ArrayList<>();
    
    public Empregada(){
        super();
    }

    public Empregada(String nome, String documento) {
        super(nome, documento);
    }
}
