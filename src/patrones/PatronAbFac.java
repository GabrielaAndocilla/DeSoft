/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.ArrayList;

/**
 *
 * @author gabriela
 */
public class PatronAbFac {
    ArrayList pedido;
    public static void main(String[] args) {
        // TODO code application logic here
        PatronAbFac a = new PatronAbFac();
        a.crearOrden();
    }
    public boolean crearOrden() {
        boolean orderCreated = false;
        Cliente c = new Cliente();
        pedido = new ArrayList();
        pedido.add(c.ordenar("Hamburguesa de Carne", 2, "hamburguesa"));
        pedido.add(c.ordenar("Pizza de Pepperoni", 3, "pizza"));
        pedido.add(c.ordenar("Alitas Picantes", 1, "alitas"));
        System.out.println(pedido);
        return orderCreated;
    }
}
