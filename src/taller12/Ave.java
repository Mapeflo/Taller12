/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class Ave implements Volador, Cantante {
    
    String tipoAve;

    public Ave(String tipoAve) {
        this.tipoAve = tipoAve;
    }
    @Override
    public void volar(){
        System.out.println("El ave"+ tipoAve + "esta volando.");
    }
    @Override
    public void cantar (){
        System.out.println("El ave"+ tipoAve+ "esta cantando.");
    }
}
