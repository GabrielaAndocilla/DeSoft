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
public class FabricaPizzas extends AbstractFabricaCom {

    @Override
    public AbstractComidaRapida ordenar(String nombre, int cantidad) {
        return new Pizzas(nombre, cantidad);
    }
    
}
