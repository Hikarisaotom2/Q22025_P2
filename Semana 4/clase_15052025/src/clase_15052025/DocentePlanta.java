/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_15052025;

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
    
    
      @Override 
    public double  calcularSueldo(){
        
        return 2*2;
    }
    

    @Override
    public String toString() {
        return "DocentePlanta " + this.nombre;
    }


    
}
