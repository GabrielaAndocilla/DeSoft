/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.Scanner;

/**
 *
 * @author gabriela
 */
public class Juego {
    
    private static Personaje personaje;
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int op;
        do{
            op = preguntar();
            switch(op){
                case 1:
                    personaje = new Guerrero();
                    jugar();
                    break;
                case 2:
                    personaje = new Ladron();
                    jugar();
                    break;
                case 3:
                    personaje = new MagoAdapter();
                    jugar();
                    break;
                case 4: 
                    personaje = new PistoleroAdapter();
                    jugar();
                    break;
                case 5:
                    System.out.println("Programa Cerrado");
                    break;
                default:
                    System.out.println("No hay");
            }
                    
                      
        }while(op!=5);
        
    }
    
    public static int preguntar(){
        
        System.out.println("\n **Mover personaje** \n 1.Guerrero\n 2.Ladon\n 3.Mago\n 4. Pistolero\n 5.Salir\n Seleccone");
        return Integer.parseInt(sc.nextLine());
    }
    
    public static void jugar(){
        personaje.caminar();
        personaje.atacar();
        personaje.saltar();
    }
}
