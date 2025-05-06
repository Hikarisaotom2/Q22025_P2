/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_28042025;


/**
 *
 * @author claudiacortes
 */
public class Clase_28042025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        tipo de dato nombre ; 
        tipo de dato nombre  = valor inicial;
        */
        
        //VARIABLE POR REFERENCIA
        Persona p = new Persona("Claudia", 90) ;
        Persona copia = p;
     
        copia.setNombre("Juan");
        
        System.out.println(p.getNombre());
        System.out.println(copia.getNombre());
       
        
        //COPIA POR VALOR 
        int valor1 = 5;
        int valor2 = valor1;
        valor2+=5;
        
        System.out.println(valor1);
        System.out.println(valor2);
        //claudia
        //juan 
        
       
        /*
        
        Clase: 
        La base, el molde que deben cumplir los elementos. 
        
        Objeto: 
       entidad real.
        
        
        Planos y en las casas. 
        */
        
        
        
    }
    
}
