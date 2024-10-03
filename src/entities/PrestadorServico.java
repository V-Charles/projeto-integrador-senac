package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrestadorServico extends Pessoa{
    
    Date dataDoServico = new Date();
    
    private List<Residencia> listaDePrestadores = new ArrayList<>();
    
    public PrestadorServico(){
        super();
    }

    public PrestadorServico(String nome, String documento) {
        super(nome, documento);
    }

    public Date getDataDoServico() {
        return dataDoServico;
    }

    public void setDataDoServico(Date dataDoServico) {
        this.dataDoServico = dataDoServico;
    }
}
