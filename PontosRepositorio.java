package planocartesiano;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class PontosRepositorio {
    private ArrayList<PontoNomeado> lista;
    private final PontoOrigem origem;
    
    public PontosRepositorio(){
        this.lista = new ArrayList<>();
        this.origem = new PontoOrigem();
        this.lista.add(this.origem);
        
    }
    
    public PontoOrigem getOrigem(){return origem;}
    
    public List<PontoNomeado> listarPontos(){
        return new ArrayList<>(lista);
    }
    public void adicionar(PontoNomeado pn){
        lista.add(pn);
    }
    
    public PontoNomeado buscar(String nomeBusca){
        
        for(PontoNomeado pn : lista){
            if(pn.getNome().equalsIgnoreCase(nomeBusca)){
                return pn;
            }
        }
        return null;
    }
    
    public PontoNomeado deletar(String nomeDel){
        Iterator<PontoNomeado> it = lista.iterator(); 
        while(it.hasNext()){
            PontoNomeado pn = it.next();
            if(pn == origem){
                continue;
            }
            if(pn.getNome().equalsIgnoreCase(nomeDel)){
                it.remove();
                return pn;
            }
                     
        }

        return null;
    }
}
