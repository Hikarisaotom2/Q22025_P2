/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_19052025_interfaz;

/**
 *
 * @author claudiacortes
 */
public class DocenteInvestigador extends Docente implements MetodosPolimorficos{
    private double sueldoMensual;
    private double bono;

    public DocenteInvestigador(double sueldoMensual, double bono, String nombre, int numCel, String correo) {
        super(nombre, numCel, correo);
        this.sueldoMensual = sueldoMensual;
        this.bono = bono;
    }  
    
    
    @Override 
    public double calcularSueldo(){
        return 1*1;
    }
    
}
