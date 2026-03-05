/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planocartesiano;

/**
 *
 * @author Usuario
 */
public class PontoNomeado extends Ponto {
    private String nome;
    
    public PontoNomeado(){ //construtor padrão
        super();//super vazio
        this.nome = "Sem nome";
    }
    public PontoNomeado(String nome, double x, double y){
        super(x, y);
        this.nome = nome;
    }
   
    public String getNome(){return nome;}
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void exibirPontos(){
        System.out.println("\t\tNome: " + nome + " Coordenadas: (" + x + "," + y + ")");
        System.out.println("\n\t\t============================================================");
    }
    
}
