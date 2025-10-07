/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class Pajaro implements Volador {
    //error: Esta clase debe implemetar el metodo de Volador
    String nombre;

    public Pajaro(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarNombre() {
        System.out.println("Nombre del pajaro: " + nombre);
    }
    
}
