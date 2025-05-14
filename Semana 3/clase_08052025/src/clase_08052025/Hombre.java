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

/*
Para establecer los lazos de herencia entre el padre y el hijo se utliza la palabra reservada extends

extends NombreDelPadre
*/
public class Hombre extends Paciente{ // Hombre es hijo de paciente 
//    Aqui guardamos la informacion exclusiva de los hombre 
    String ultimaRevisionUrologo;

    public Hombre(String ultimaRevisionUrologo, String nombre, int edad, double peso, double altura) {
        super(nombre, edad, peso, altura);
        this.ultimaRevisionUrologo = ultimaRevisionUrologo;
    }
    
      public void revisionUrologo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ultimo revision?");
        this.ultimaRevisionUrologo = entrada.nextLine();

    } 

    @Override
    public String toString() {
        
        
        return "Hombre{"  + this.nombre;
    }
    
  
}
