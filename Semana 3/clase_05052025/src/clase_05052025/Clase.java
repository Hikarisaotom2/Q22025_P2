/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_05052025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase {
 private String nombre;
 private String seccion;
 // Alumnos
 private ArrayList<Alumno> alumnos;

    public Clase(String nombre, String seccion) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.alumnos = new ArrayList<Alumno>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void matricularAlumno(Alumno nuevoAlumno){
        this.alumnos.add(nuevoAlumno);
        
    } 

    @Override
    public String toString() {
        String alumnos = "\n";
        for (int i = 0; i < this.alumnos.size(); i++) {
            alumnos+= this.alumnos.get(i).toString()+"\n";
           
        }
        
        return  seccion + nombre + alumnos ;
    }
    
    
}
