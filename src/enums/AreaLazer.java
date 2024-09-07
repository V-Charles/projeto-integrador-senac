
package enums;

public enum AreaLazer {
    
    ACADEMIA("Academia"),
    QUADRA_VOLEI("Quadra de vôlei"),
    QUADRA_FUTEBOL("Quara de futebol"),
    PISCINA("Piscina"),
    SALAO_FESTA("Salão de festas");
    
    private String descricao;
    
    AreaLazer(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public static AreaLazer fromDescricao(String descricao){
        for(AreaLazer tipo : AreaLazer.values()){
            if(tipo.getDescricao().equalsIgnoreCase(descricao)){
                return tipo;
            }
        }
        throw new IllegalArgumentException("Descrição inválida: " + descricao);
    }
}
