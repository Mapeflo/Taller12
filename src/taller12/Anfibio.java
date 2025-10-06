/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class Anfibio implements Nadador {
    //error: la clase Anfibio debe implemetar el metodo de Nadador
    
    String nombre;

    public Anfibio(String nombre) {
        this.nombre = nombre;
    }
    public void respirar (){
        System.out.println("El"+nombre+"esta respirando");
    }  
}
