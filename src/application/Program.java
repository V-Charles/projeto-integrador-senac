
package application;

import enums.AreaLazer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import services.Administracao;

public class Program {
    public static void main(String[] args) throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        Administracao adm = new Administracao();
        boolean menu = true;
        
        while(menu){
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Fazer Reserva");
            System.out.println("2 - Verificar reservas");
            System.out.println("3 - Sair");
            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.println("Digite a área de lazer que deseja reservar");
                    System.out.println("Áreas disponíveis: ");
                    System.out.println("Academia\nQuadra de Futebol\nQuadra de Vôlei\nPiscina\nSalão de Festas");
                    String areaEscolhida = sc.nextLine();
                    AreaLazer area = AreaLazer.fromDescricao(areaEscolhida);
                    
                    System.out.println("A reserva será para qual data? Ex.: dd/mm/aaaa");
                    Date data = sdf.parse(sc.next());
                    
                    boolean sucesso = adm.fazReserva(area, data);
                    if(sucesso){
                        System.out.println("Reserva feita com sucesso!");
                    }else{
                        System.out.println("Erro ao fazer reserva!");
                    }
                break;
                case 2: {
                    Map<String, Date> reservas = adm.getReservas();
                    for(Map.Entry<String, Date> entry : reservas.entrySet()){
                        String[] chave = entry.getKey().split(" ");
                        String areaReservada = chave[0];
                        System.out.println("Área reservada: " + areaReservada);
                        System.out.println("Reservado para o dia: " + sdf.format(entry.getValue()));
                    }
                break;
                }
                case 3: menu = false; break;
                
                default: System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
