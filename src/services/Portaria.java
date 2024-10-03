package services;

import entities.Empregada;
import entities.PrestadorServico;
import entities.Visita;
import java.util.ArrayList;
import java.util.List;

public class Portaria {
    
    private List<Empregada> listaDeEmpregadas = new ArrayList<>();
    private List<PrestadorServico> listaDePrestadores = new ArrayList<>();
    private List<Visita> listaDeVisitas = new ArrayList<>();
    
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
    
    public void registraVisita(Visita visita){
        listaDeVisitas.add(visita);
        System.out.println("Visita cadastrada com sucesso!");
    }
    
    public void listarVisitas(){
        for(Visita visita : listaDeVisitas){
            System.out.println(visita.getNome());
        }
    }
}
