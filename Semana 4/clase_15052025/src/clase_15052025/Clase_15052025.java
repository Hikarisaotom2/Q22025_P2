/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_15052025;

/**
 *
 * @author claudiacortes
 */
public class Clase_15052025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2) Polimorfismo por clases abstractas (Si depdende o funciona con herencia):
            1) Se parece al polimorfismo por escritura simple ( se crean las clases y se agrega la herencia con normalidad).
            2) Implementamos un metodo y una clase abstracta. 
            3) Son mas seguras para implementar polimorfismo, los hijos estan OBLIGADOS a implementar sobreescritura para el metodo abstracto del padre. 
        */

        /*
        
        EJERCICIO: 
        
        DOCENTES (PADRE): 
            PLANTA. (HIJA)
            Hora catedra. (HIJA)
            Investigadores. (HIJA)
        
          -> sistema contable /planillas (CRUD)
           1) listar a los docentes en el sistema 
           2) crear docentes 
           3) calcular el pago de cada docente 
           4) modificar la información de los docentes. 
           5) eliminar a un docente. 
        
         -> Docentes planta: 
            -> sueldo mensual fijo (Todos los meses esa persona gana lo mismo)
            -> deducciones: 
                 -> IHSS, RAP
        -> Docente hora catedra:  
              -> Pago por cantidad de clases. 
              ->  Deducciones: 
                    -> ISR(12.5%)
        -> Docentes investigadores: 
            -> Pago fijo mensual 
            -> Bonos
            -> deducciones: 
               -> IHSS
               -> RAP
               -> ISR: 
                    -> 18000 >= 15%
                    -> 360000 >= 20%
                    -> 50000 >= 30%
        
        */
    }
    
}
