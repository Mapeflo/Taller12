/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class pruebaPez extends Pez {

    public pruebaPez(String nombre) {
        super(nombre);
    }
    
    public static void main(String[] args) {
        
        Pez pez = new Pez("payaso");
        
        pez.nadar();
        pez.respirar();
    }  
}
