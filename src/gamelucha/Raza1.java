/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamelucha;

/**
 *
 * @author SENA
 */
public class Raza1 implements Magias,Skills{

    public Raza1() { //constructor
    }
    
    
    
    

    @Override
    public void curar() {
        System.out.println("curar");
    }

    @Override
    public void roboVida() {
        System.out.println("RovoVida");    
    }

    @Override
    public void ataqueHielo() {
        System.out.println("ataqueHielo");
    }

    @Override
    public void ataqueFuego() {
        System.out.println("ataqueFuego");
    }

    @Override
    public void escapar() {
            System.out.println("escapar");
    }

    @Override
    public void atacar() {
            System.out.println("atacar");
    }

    @Override
    public void dobleAtaque() {
            System.out.println("dobleAtaque");
    }
    
}
