/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_05052025;

/**
 *
 * @author claudiacortes
 */
public class Alumno {
    private String nombre;
    private int cuenta;
    private int inasistencias;

    public Alumno(String nombre, int cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.inasistencias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias() {
        this.inasistencias+=1;
    }

    @Override
    public String toString() {
        return   cuenta + " - " +nombre+" (Inasistencias " +inasistencias+" )" ;
    }
    
    
    
    
    
    
}
