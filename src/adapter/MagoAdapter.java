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
public class MagoAdapter extends Personaje{

    Mago mago = new Mago();
    @Override
    public void caminar() {
        mago.caminar();
    }

    @Override
    public void saltar() {
        System.out.println("Mago Salta");
        mago.desaparecer();
        mago.teletransportar();
        mago.aparecer();
    }

    @Override
    public void atacar() {
        System.out.println("Mago Ataca");
        mago.cargarMagia();
        mago.hechizo();
    }
    
}
