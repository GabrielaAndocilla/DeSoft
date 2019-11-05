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
public class PistoleroAdapter extends Personaje{

    Pistolero pistolero = new Pistolero();
    @Override
    public void caminar() {
        pistolero.caminar();
    }

    @Override
    public void saltar() {
        pistolero.saltar();
    }

    @Override
    public void atacar() {
        System.out.println("Pistolero ataca");
        pistolero.sacarArma();
        pistolero.disparar();
        pistolero.guardarArma();
    }
    
}
