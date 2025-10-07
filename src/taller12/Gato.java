/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class Gato implements Hablador {
    
    String raza;

    public Gato(String raza) {
        this.raza = raza;
    }
    @Override
    public void hablar() {
        System.out.println("El gato" +raza+"esta hablando con el vecino");
        System.out.println("¿Desde cuando los gatos hablan?");
    }
}
//El metodo implementado no tiene sentido para la clase.