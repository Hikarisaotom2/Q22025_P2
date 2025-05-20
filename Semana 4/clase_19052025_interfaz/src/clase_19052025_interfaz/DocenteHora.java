/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_19052025_interfaz;

/**
 *
 * @author claudiacortes
 */
public class DocenteHora extends Docente implements MetodosPolimorficos{
    private double pagoPorClase;
    private int cantidadClases;

    public DocenteHora(double pagoPorClase, int cantidadClases, String nombre, int numCel, String correo) {
        super(nombre, numCel, correo);
        this.pagoPorClase = pagoPorClase;
        this.cantidadClases = cantidadClases;
    }
    
    @Override 
    public double calcularSueldo (){
        return 1.5*2;
    }

    @Override
    public String toString() {
          return "DocenteHora " + this.nombre;
    } 
}
