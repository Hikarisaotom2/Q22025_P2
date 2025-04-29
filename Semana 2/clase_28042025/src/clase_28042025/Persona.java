
package clase_28042025;
public class Persona {
    //atributos  
    private String nombre;
    private int edad;
    
    
    
    //metodos
    
    
    //constructor
    // siempre debe tener el nombre de la clase 
    //  omitir el uso de las palabras reservadas, static, retorno, void 
    
    Persona(String nuevoNombre, int nuevaEdad){
        nombre = nuevoNombre;
        edad = nuevaEdad;
    }
    
    
    // mutadores
    /*
    1)Atributos:
        informacion para cada objeto 
    
    2) Metodos:
        acciones relacionadas al objeto 
        
        -> Constructor
            es un metodo que nos ayuda a darle valor inicial al objeto. (es lo que crea el objeto)
    
        -> Mutadores/ setters/getters
         Su unica finalidad es actualizar los atributos. 
        setter: ayudan a cambiar el valor de la variable.
        getter: ayudar a ver el valor actual de la variable. 
    
    
    // Contrasena del banco ( valor de solo escritura) 
    setter : SI 
    
    
    // numero de identidad / numero de cuenta. (Valor de solo lectura) 
    getter: SI
    */
   
}
