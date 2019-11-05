/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author gabriela
 */
public class Cliente {
 
    public AbstractComidaRapida ordenar(String nombre, int cantidad, String tipo){
        AbstractFabricaCom a = null;
        if(tipo.equalsIgnoreCase("hamburguesa")){
            a= new FabricaHamburguesas();
            
        }else if(tipo.equalsIgnoreCase("pizza")){
            a= new FabricaPizzas();
            
        }else if(tipo.equalsIgnoreCase("alitas")){
            a= new FabricaAlitas();
        }
        
        if(a!=null){
            return a.ordenar(nombre, cantidad);
        }else{
            return null;
        }
    }
}
