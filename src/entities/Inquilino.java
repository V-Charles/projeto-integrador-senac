package entities;

import java.util.Date;

public class Inquilino extends Morador{
    
    private Date inicioDoContrato;
    private Date fimDoContrato;
    
    public Inquilino(){
        super();
    }

    public Inquilino(Date inicioDoContrato, Date fimDoContrato, Contato contato, String nome, String documento, Date dataNasc) {
        super(contato, nome, documento, dataNasc);
        this.inicioDoContrato = inicioDoContrato;
        this.fimDoContrato = fimDoContrato;
    }

    public Date getInicioDoContrato() {
        return inicioDoContrato;
    }

    public void setInicioDoContrato(Date inicioDoContrato) {
        this.inicioDoContrato = inicioDoContrato;
    }

    public Date getFimDoContrato() {
        return fimDoContrato;
    }

    public void setFimDoContrato(Date fimDoContrato) {
        this.fimDoContrato = fimDoContrato;
    }
}
