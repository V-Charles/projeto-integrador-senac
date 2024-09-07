
package services;

import entities.Morador;
import java.util.ArrayList;
import java.util.List;

public class Administracao {
    
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
}
