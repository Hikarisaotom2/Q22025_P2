/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_23042025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_23042025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
          escribir una func recursiva, que imprima los numeros del 1 al x.... 
        */    
        int x = 5;
        
        imprimirNumeros(1,x);
        
        /*
        -> recursion 
        -> arraylist 
        -> strings
        
        
        -> Dos listas de palabras, comparara cual lista tiene palabras mas largas 
        
        lista 1 = hola, adios, aquihhhhhhhhhhhhhh 
        lista 2 = hola, hola, hola 
        
        
      2   -> palabra 1 = hola 
        palabra 2 = adios 
        
        
        3 -> contains ( conjuntos)
        
        lista 1 = "Hola","adios, "mundo"
        lista 2= "mundo", "hola"
            return true
        */
        
        
        
      /*
        1) Arrays -> tamano fijo 
        2) Arraylist  -> Tamano variable 0.
        */
      ArrayList<String> lista1 = new ArrayList<String>(); // size: 0
      ArrayList<String> lista2 = new ArrayList<String>(); // size: 0
//       [0......(tamano-1)]
      lista1.add("Hola");
      lista1.add("adios");
      lista1.add("mundo");
      
      lista2.add("MAMA");
      lista2.add("adios");
  
      boolean existe = containsTexto(lista1,lista2, 0);
        if (existe) {
            System.out.println("LA LISTA ESTA CONTENIDA");
        }else{
            System.out.println("LA LISTA NO ESTA CONTENIDA");
        }
//      EJEMPLO CON ITERACON.
//        for (int i = 0; i < lista2.size(); i++) {
//            String palabra = lista2.get(i);
//            boolean existe = false;
//            for (int j = 0; j < lista1.size(); j++) {
//                String  palabra2 = lista1.get(j);
//                if(palabra.equalsIgnoreCase(palabra2)){
//                    existe = true;
//                    break; // opcional 
//                }
//            } //fin del segundo for 
//            // 
//            if(existe){
//                System.out.println("La plaabra si existe");
//            }else{
//                System.out.println("La palabra no existe");
//                break;
//            }// fin del if
//            
//        }// fin del primer for
      
    }
    
    
    public static boolean containsTexto(ArrayList<String> lista1,ArrayList<String> lista2, int i ){
        /*
        casos base 
        1) cuando llegamos al final de la lista 
        2) cuando no se encuentra una palabra 
        
        */
        if(i>=lista2.size()){ // caso base 
              return true; 
        }else {
            /*
            1) crear otro metodo recursivo para esto.... 
            */
            String palabra = lista2.get(i);
            boolean existe = false;
            for (int j = 0; j < lista1.size(); j++) {
                String palabra2  = lista1.get(j);
                if(palabra2.equalsIgnoreCase(palabra)){
                    existe = true;
                    break;
                }
            }
 
            if(existe){
                //seguimos revisando las otras palabras.... 
                return containsTexto(lista1,lista2, i+1);
            }else{
                return false;
            }
    
        }
    }
    public static void imprimirNumeros
        ( int i, int x) {
        if (i > x) {
            // nada 
        }else{ // caso recursivo 
            System.out.println(i);
            imprimirNumeros(i+1,x);
        }
    }
    
        
        /*
        1) se llena de abajo hacia arriba 
        2) Para sacar las cosas, es el proceso contrario
        arriba hacia abajo 
        3) SIEMPRE que hagamos un llamado a un metodo vamos a guardarlo en el callstack 
        4) Solo nos enfocamos en una cosa a la vez (lo que ste en el tope del callstack) 
        5) Cuando hagamos un retorno o terminemos un metodo, lo sacamos del callstack 
        
        
        */
    
}
