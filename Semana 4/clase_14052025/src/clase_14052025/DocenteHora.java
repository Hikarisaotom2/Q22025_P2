/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_14052025;

/**
 *
 * @author claudiacortes
 */
public class DocenteHora extends Docente{
    private double pagoPorClase;
    private int cantidadClases;

    public DocenteHora(double pagoPorClase, int cantidadClases, String nombre, int numCel, String correo) {
        super(nombre, numCel, correo);
        this.pagoPorClase = pagoPorClase;
        this.cantidadClases = cantidadClases;
    }
    
//    Sobreescribimos
    @Override
     public double calcularSueldo(){
         System.out.println("");
        return 5.0;
    }
    
}
