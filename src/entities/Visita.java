
package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Visita extends Pessoa{
    
    private List<Residencia> listaResidenciasVisitadas = new ArrayList<>();
    
    public Visita(){
        super();
    }
    
    public Visita(String nome, String documento, Date dataNasc) {
        super(nome, documento, dataNasc);
    }
}
