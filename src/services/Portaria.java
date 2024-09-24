
package services;

import entities.Empregada;
import entities.PrestadorServico;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Portaria {
    
    Date dataVisita = new Date();
    private List<Empregada> listaDeEmpregadas = new ArrayList<>();
    private List<PrestadorServico> listaDePrestadores = new ArrayList<>();
    
    public Portaria(){
    }
    
    public void registraEmpregada(Empregada empregada){
        listaDeEmpregadas.add(empregada);
        System.out.println("Empregada cadastrada com sucesso!");
    }
    
    public void listarEmpregadas(){
        for(Empregada empregada : listaDeEmpregadas){
            System.out.println(empregada.getNome());
        }
    }
    
    public void registraPrestador(PrestadorServico prestador){
        listaDePrestadores.add(prestador);
        System.out.println("Prestador cadastrado!");
    }
    
    public void listarPrestadores(){
        for(PrestadorServico prestador : listaDePrestadores){
            System.out.println(prestador.getNome());
        }
    }
}
