/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_19052025_interfaz;

/**
 *
 * @author claudiacortes
 */
public class Clase_19052025_interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*
        POLIMORFISMO: Se produce cuando varias clases deben implementar los mismos metodos pro cada uno debe hacerlo de una manera distinta
        se puede implementar cuando tenemos herencia y cuando no tenemos herencia
        */
        
        /*
        PRINCIPIOS DE LA POO: 
         1) abstracción:  
         2) encapsulación 
         3) herencia 
         4) polimorfismo
       
        3) Polimorfismo por Interfaces (NO depende de la herencia): 
         -> Interfaces en java son na manera de implementar el principio de la abstracción. 
         -> INDEPENDIENTE DE4 LA HERENCIA.
         -> Si bien este metodo es independiente de la herencia, si se pueden mezclar o trabajar ambos al mismo tiempo
         
         Interfaz: es un archivo que se PARECE a las clases , TODOS SUS METODOS SON ABSTRACTOS y no tiene atributos. 
         
         -> Crear las clases con nornamlidad. 
         -> crear el metodo polimorfico en la interfaz . 
         -> Implementar la interfaz en las clases .
         -> esto obliga a la clase a sobreescribir el metodo polimorfico
         -> es un proceso manual, la interfaz solamente se implementara en las clases que configuremos. 
         
        */
        
        
        /*
         Polimorfismo sobrescritura simple: 
         * -Ventajas: 
            facil implementar 
            cada hijo implementa el polimorfimos si gusta (es opcional)
            no se cambia mucho ni el padre ni el hijo. 
            - desventaja: 
            Es inseguro, da lugar a errores debido a que existe la posibilidad de que un hijo no implemente el polimorfismo cuando sea necesario. 
        
         Clases abstractas: 
            ventajas: 
             es seguro por que obliga a todos los hijos a implementar el metodo polimorfico. 
            se parece al polimorfismo por sobreescritura simple .
            desventaja: 
            trabaja con clases y metodos abstractos, perdemos la habilidad de instanciar la clase padre. 

         * Interfaces 
        ventajas: 
         es independiente de la herencia 
         obliga a las clases que la implementan a sobreescribir el metodo polimorfico. 
         si es necesario, se puede mezclar con la herencia. 
        desventaja: 
        la implementacion es un proceso manual por lo que podemos olvidar asociar la intefaz con una clase. 
        
         
         
         
         */
    }
    
}
