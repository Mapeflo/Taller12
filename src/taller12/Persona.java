/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class Persona implements Hablador, Trabajador {
    
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void hablar(){
        System.out.println(nombre+ "esta hablando.");
    }
    @Override
    public void trabajar(){
        System.out.println(nombre+ "esta trabajando");
    }
}
