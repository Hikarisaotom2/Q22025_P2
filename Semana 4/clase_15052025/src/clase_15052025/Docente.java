/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_15052025;

/**
 *
 * @author claudiacortes
 */
/*
Clases abstractas
    * se crean con normalidad 
    * NO SE PUEDEN INSTANCIAR. 
*/
abstract public class Docente {
    protected String nombre;
    protected int numCel;
    protected String correo;
    // clases asignadas, etc....

    public Docente(String nombre, int numCel, String correo) {
        this.nombre = nombre;
        this.numCel = numCel;
        this.correo = correo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCel() {
        return numCel;
    }

    public void setNumCel(int numCel) {
        this.numCel = numCel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //Este es el metodo polimorfico que todos los hijos comparten
    /*
    Un metodo abstracto, es aquel que NO TINE CUERPO, y utiliza la plaabra reservada abstract
    Los metodos abstractos solamente se pueden crear dentro de las clases abstractas
    
    */
    abstract public double  calcularSueldo();

    @Override
    public String toString() {
        return "Docente{" + "nombre=" + nombre + ", numCel=" + numCel + ", correo=" + correo + '}';
    }
    
    
}
