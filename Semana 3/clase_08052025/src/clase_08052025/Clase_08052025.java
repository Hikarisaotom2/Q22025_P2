/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_08052025;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_08052025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<Paciente> filaPacientes = crearPacientes();
        imprimirPacientes(filaPacientes);
        remitirEspecialista(filaPacientes);
        
    }
    
    public static ArrayList<Paciente> crearPacientes(){
         
//        String ultimaRevisionUrologo, String nombre, int edad, double peso, double altura
        Hombre andy = new Hombre("N/A", "Andy", 19, 140, 175);
        //        String ultimoCicloMentrual, boolean embarazo, String nombre, int edad, double peso, double altura
        Mujer claudia =  new Mujer("Abril", false, "Claudia", 40, 160, 170);
        
        
        Paciente javier = new Hombre("N/A", "Javier", 19, 140, 175);
        Paciente tatiana = new Mujer("Abril", false, "Tatiana", 40, 160, 170);
        /*
        
        En herencia, los hijos se consideran de dos tipos de dato: su propio tipo y el tipo del padre
        NO se puede hacer lo mismo para el padre 
        */
        
        ArrayList<Paciente> filaPacientes = new ArrayList<Paciente>();
         filaPacientes.add(andy);
        filaPacientes.add(claudia);
        filaPacientes.add(tatiana);
        filaPacientes.add(javier);
        
        return filaPacientes;
    }
    
    
    public static void imprimirPacientes(ArrayList<Paciente> pacientes){
        for (int i = 0; i < pacientes.size(); i++) {
//            El objeto se conoce a si mismo, siempre saben como que tipo de objeto se instancio
            System.out.println(pacientes.get(i));
        }
    }
    
    public static void remitirEspecialista(ArrayList<Paciente> pacientes){
        for (int i = 0; i < pacientes.size(); i++) {
            /*
            instanceof: que nos ayuda a comprobar el tipo de dato de un objeto
            */
            System.out.println(i+") Revisando a "+ pacientes.get(i).getNombre());
               
            if(pacientes.get(i) instanceof Hombre){ // pacientes.get(i) se instancio como hombre? 
                System.out.println("El objeto es un hombre, se remite al urologo");
               // Casteo: Conversión explicita de datos 
               // Para castear objetos se utiliza la siguiente estructura:
               // (Clase a la que queremos convertir) Objeto que queremos convertir;
               // En herencia normalmente se cnvierte del tipo de dato padre al tipo de dato hijo. 
               //(HIJO) ObjetoDelTipoPadre
               Hombre pacienteMasculino = (Hombre) pacientes.get(i);
               pacienteMasculino.revisionUrologo();
               
            }else if(pacientes.get(i) instanceof Mujer){
                System.out.println("El objeto es una mujer, se remite al ginecologo");
                Mujer pacienteFemenino = (Mujer)pacientes.get(i);
                pacienteFemenino.revisionGinecologo();
                
            }else{
                System.out.println("Es un paciente generico");
            }
        }
    }
    
}


/*
   PUNTOS IMPORTANTES SOBRE HERENCIA: 
1) Como funciona la herencia. 
2) Diferencia entre padre e hijo en herencia 
3) Uso de protected
4) Uso de los constructores del padre y palabra reservada super 
5) Arreglos con Padres e hijos 
6) Uso del instanceof 
7) Casteo
8) Como configurar herencia en una clase 
*/
