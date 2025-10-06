/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class Pez implements Nadador, Respirador {
    
    String nombre;

    public Pez(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void nadar(){
        System.out.println("El pez" +nombre+ "esta nadando.");  
    }
    @Override
    public void respirar(){
        System.out.println("El pez" +nombre+ "esta respirando.");
    }
}
