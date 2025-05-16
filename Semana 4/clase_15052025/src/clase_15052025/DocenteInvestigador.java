/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_14052025;

/**
 *
 * @author claudiacortes
 */
public class DocenteInvestigador extends Docente{
    private double sueldoMensual;
    private double bono;

    public DocenteInvestigador(double sueldoMensual, double bono, String nombre, int numCel, String correo) {
        super(nombre, numCel, correo);
        this.sueldoMensual = sueldoMensual;
        this.bono = bono;
    }
    
    
}
