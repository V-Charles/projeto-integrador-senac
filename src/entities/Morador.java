
package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Morador extends Pessoa{
    
    private Contato contato;
    
    private List<Residencia> listaResidencias;
    private List<Veiculo> listaVeiculosDosMoradores;
    
    public Morador(){
        super();
        this.listaResidencias = new ArrayList<>();
        this.listaVeiculosDosMoradores = new ArrayList<>();
    }

    public Morador(Contato contato, String nome, String documento, Date dataNasc) {
        super(nome, documento, dataNasc);
        this.contato = contato;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
