/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_14052025;

/**
 *
 * @author claudiacortes
 */
public class Clase_14052025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        POLIMORFISMO: Se produce cuando varias clases deben implementar los mismos metodos pro cada uno debe hacerlo de una manera distinta
        se puede implementar cuando tenemos herencia y cuando no tenemos herencia
        */
        
        /*
        1) Polomorfismo por sobrescritura (Si depdende o funciona con herencia):
             1) Realizar la herencia con normalidad 
             2) Identificar y crear  en el PADRE  el metodo en comun pero que es polimorfico 
             3) Respetar y recordar la definicion del metodo polimorfico en el padre  y "sobreescribirlo" en el hijo 
        
        2) Polimorfismo por clases abstractas (Si depdende o funciona con herencia):
        3) Polimorfismo por Interfaces (NO depende de la herencia): 
        */
        
        
        /*
        EJEMPLOS:
            
        Padre: Animal: 
            nombre
            peso
            tamano
            cantidad patitas
            color pelaje.....
        
        Hijos:  Perro .              Gato .                Pollito.
                Raza:enum           Raza: enum         .......

        Figuras 
         dimensiones 
         diametro 
         area 
         volumen 
        cuadrado .     triangulo .        circulo 

        */
        
        
        /*
        
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
