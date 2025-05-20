/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_19052025_interfaz;

/**
 *
 * @author claudiacortes
 */
public class DocentePlanta extends Docente{
    private double sueldoMensual;

    public DocentePlanta(double sueldoMensual, String nombre, int numCel, String correo) {
        super(nombre, numCel, correo);
        this.sueldoMensual = sueldoMensual;
    } 
}
