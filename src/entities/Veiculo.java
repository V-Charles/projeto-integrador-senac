
package entities;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    
    private String modelo;
    private String placa;
    private String anoModelo;
    private String cor;
    
    private List<Residencia> listaVeiculosDosMoradores;
    
    public Veiculo(){
        this.listaVeiculosDosMoradores = new ArrayList<>();
    }

    public Veiculo(String modelo, String placa, String anoModelo, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
