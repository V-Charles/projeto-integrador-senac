
package entities;

public class Contato {
    
    private String celular;
    private String telFixo;
    private String email;
    private Morador morador;
    
    public Contato(){
    }

    public Contato(String celular, String telFixo, String email, Morador morador) {
        this.celular = celular;
        this.telFixo = telFixo;
        this.email = email;
        this.morador = morador;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }
}
