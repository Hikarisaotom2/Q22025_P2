/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_02062025;

/**
 *
 * @author claudiacortes
 */
public class Docente extends Persona{

    public Docente(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Docente{" + this.getNombre()+'}';
    }
    
    
}
