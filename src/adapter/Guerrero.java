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
public class Guerrero extends Personaje {

    
    @Override
    public void caminar() {
        System.out.println("Guerrero camina");
    }

    @Override
    public void saltar() {
        System.out.println("Guerrero salta");
    }

    @Override
    public void atacar() {
        System.out.println("Guerrero lanza un puño");
    }
    
}
