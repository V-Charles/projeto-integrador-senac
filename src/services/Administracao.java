
package services;

import entities.Morador;
import enums.AreaLazer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Administracao {
    
    private Map<String, Date> reservas;
    
    private List<Morador> listaMoradores;
    
    public Administracao(){
        this.listaMoradores = new ArrayList<>();
    }
    
    public void registraMorador(Morador morador){
        if(morador != null && !listaMoradores.contains(morador)){
            listaMoradores.add(morador);
            System.out.println("Morador cadastrado com sucesso!");
        }
        else{
            System.out.println("Erro: morador inválido ou já cadastrado.");
        }
    }
    
    public void listarMoradores(){
        for(Morador morador : listaMoradores){
            System.out.println(morador.getNome());
        }
    }
    
    public boolean fazReserva(AreaLazer area, Date data){
        String chave = area.name() + data.toString();
        if(reservas.containsKey(chave)){
            return false;
        }
        reservas.put(chave, data);
        return true;
    }
    
    public Map<String, Date> getReservas(){
        return reservas;
    }
}
