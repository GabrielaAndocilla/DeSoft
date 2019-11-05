/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author gabriela
 */
public class Ladron extends Personaje {

    @Override
    public void caminar() {
        System.out.println("Ladrón camina");
    }

    @Override
    public void saltar() {
        System.out.println("Ladrón saltar");

    }

    @Override
    public void atacar() {
        System.out.println("Ladrón ataca");
    }
    
}
