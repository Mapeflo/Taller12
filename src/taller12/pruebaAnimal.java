/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class pruebaAnimal extends Animal{

    public pruebaAnimal(String nombre) {
        super(nombre);
    }
     public static void main(String[] args) {
     
         Animal animal = new Animal("Gaviota");
         
         animal.nadar();
         animal.volar();
     }    
}
