/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class Perro implements Volador {
    
    String raza;

    public Perro(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void volar(){
        System.out.println("El perro"+raza+"esta volando");
        System.out.println("¿Desde cuando los perros vuelan?");
    }  
}
//El metodo implementado no tiene sentido para la clase.