/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_08052025;

/**
 *
 * @author claudiacortes
 */
//CLASE PADRE: tipo de dato mas generico , tiene la informacion general que se comparte 

/*
Quien define la herencia son los HIJOS. 
LOS HIJOS SOLO PUEDEN TENER UN PADRE
*/
public class Paciente {
    
    /*
    public: visisble para todos. 
    
    private: visible unicamente para la clase
    
    
    protected: visisble para una clase y sus hijos 
    
    */
//    Aqui esta toda la informacion general y que se comparte entre todos los pacientes
    protected String nombre;
    protected int edad;
    protected double peso;
    protected double altura;

    public Paciente(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
