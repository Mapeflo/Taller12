/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

/**
 *
 * @author marya
 */
public class pruebaAve extends Ave {

    public pruebaAve(String tipoAve) {
        super(tipoAve);
    }
    public static void main(String[] args) {
        
        Ave ave = new Ave("Canario");
    
        ave.cantar();
        ave.volar();
    } 
}
