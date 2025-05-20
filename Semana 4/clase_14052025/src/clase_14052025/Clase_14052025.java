/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_14052025;

import java.util.ArrayList;

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
             4) Los Hijos pueden OPCIONALMENTE sobreescribir el metodo 
             5) Por regla general, si la clase esta sobreescribiendo un metodo polimorfico, Java va a llamar ese codigo, de lo contrario va a llamar el metodo del padre
        
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
        
        
        ArrayList<Docente> docentes = new ArrayList<Docente>();
        docentes.add(new DocenteHora(5000,4, "Juan", 1234, "juan@gmail.com"));
        docentes.add(new DocentePlanta(50000, "Pedro", 1234, "juan@gmail.com"));
        docentes.add(new DocenteInvestigador(50000,4000, "Mario", 1234, "juan@gmail.com"));
        
//        imprimirDocentes(docentes);
        calcularSalarios(docentes);
        
    }
    
    
    public static void imprimirDocentes(ArrayList<Docente> docentes){
        for (int i = 0; i < docentes.size(); i++) {
            System.out.println(i+" )" + docentes.get(i));
        }  
    }
    
    
    public static void calcularSalarios(ArrayList<Docente> docentes){
        for (int i = 0; i < docentes.size(); i++) {
            
            Docente d = docentes.get(i);
            /*
               -> Al momento de ejecutarse el codigo, cada objeto recuerda  que tipo de clase es  y llama al metodo correcto.
            */
            System.out.println(i+" )" + d+ " Sueldo actual" + d.calcularSueldo());
        }
    }
    
    
    
}
