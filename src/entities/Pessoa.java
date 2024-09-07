
package entities;

import java.util.Date;

public class Pessoa {
    
    private String nome;
    private String documento;
    private Date dataNasc;
    
    public Pessoa(){
    }

    public Pessoa(String nome, String documento, Date dataNasc) {
        this.nome = nome;
        this.documento = documento;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
}
