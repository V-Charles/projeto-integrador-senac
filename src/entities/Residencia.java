
package entities;

import java.util.ArrayList;
import java.util.List;

public class Residencia {
    
    private String numero;
    
    private List<Morador> listaMoradores;
    private List<Visita> listaVisitas;
    
    public Residencia(){
        this.listaMoradores = new ArrayList<>();
        this.listaVisitas= new ArrayList<>();
    }

    public Residencia(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
