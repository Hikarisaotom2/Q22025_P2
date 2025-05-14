/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_08052025;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */

//CLASE HIJA: contine informacion especifica 
public class Mujer extends Paciente {
    //    Aqui guardamos la informacion exclusiva de las mujeres 
    String ultimoCicloMentrual;
    boolean embarazo;
 
    


    public Mujer(String ultimoCicloMentrual, boolean embarazo, String nombre, int edad, double peso, double altura) {
             /*
      Super: Palabra reservada exclusiva para cuando tenemos herencia. 
      
      */ 
        super(nombre, edad, peso, altura);     // llamar al contructor del padre 
        this.ultimoCicloMentrual = ultimoCicloMentrual;
        this.embarazo = embarazo;
    }
    
    public void revisionGinecologo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ultimo ciclo menstrual? ");
        this.ultimoCicloMentrual = entrada.nextLine();
        System.out.println("Estado de embarazo? ");
        int estado = entrada.nextInt();
        this.embarazo = estado>1;
        
    }

    @Override
    public String toString() {
        return "Mujer{" + this.nombre;
    }
    
    

}
