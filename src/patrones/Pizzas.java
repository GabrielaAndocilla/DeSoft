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
public class Pizzas extends AbstractComidaRapida {
    String nombre;
    int cantidad;
    
    public Pizzas(String nombre, int cantidad){
        setNombre(nombre);
        setCantidad(cantidad);
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\nPizzas" + "\nnombre=" + nombre + "\ncantidad=" + cantidad ;
    }
    
}
