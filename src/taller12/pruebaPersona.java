/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class pruebaPersona extends Persona {

    public pruebaPersona(String nombre) {
        super(nombre);
    }
    
    public static void main(String[] args) {
        
        Persona persona = new Persona("Luis");
        
        persona.hablar();
        persona.trabajar();
    }   
}
