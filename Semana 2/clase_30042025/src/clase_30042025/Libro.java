/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_30042025;

/**
 *
 * @author claudiacortes
 */
public class Libro {
    
    private String nombre;
    private boolean estado;
    private String usuarioACargo;

    public Libro(String nombre) {
        this.nombre = nombre;
        this.estado = true;
        this.usuarioACargo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getUsuarioACargo() {
        return usuarioACargo;
    }

    public void setUsuarioACargo(String usuarioACargo) {
        this.usuarioACargo = usuarioACargo;
    }
    
    // Imprimir o visualizar el objeto. 
    @Override
    public String toString() {
        return  nombre + "(" + estado + ") -" + usuarioACargo ;
        
    }
    
    
    
    
}
