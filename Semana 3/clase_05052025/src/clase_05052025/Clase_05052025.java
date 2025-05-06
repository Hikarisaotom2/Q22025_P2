/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_05052025;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_05052025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Objeto compuesto: 
        Es un objeto que tiene como minimo un atributo que es un objeto. 
         */

        ArrayList<Alumno> estudiantes = new ArrayList<Alumno>();
        ArrayList<Clase> clases = new ArrayList<Clase>();

        //Crear alumnos 
        Alumno andy = new Alumno("ANDY JAFET ZUNIGA CANALES", 12411125);
        Alumno leonardo = new Alumno("LEONARDO ANTONIO FLORES JUAREZ", 12441219);
        estudiantes.add(andy);
        estudiantes.add(leonardo);

        //crear clase
        Clase progra2 = new Clase("PROGRAMACIÓN II", "1382");
        clases.add(progra2);
        Scanner entrada = new Scanner(System.in);

        while (true) {
            /*
         -> CRUD DE ALUMNOS Y CLASES 
        
        ->Alumno 
        
          - crear alumnos 
         X - listar alumnos 
          X - modiifcar alumnos ( numero de cuenta es atributo e solo lectura) x
          
        -> Clases
          - crear clases 
          X - listar clases 
          - modificar clases (seccion y nombre)
           - Matricular alumnos (Listar los alumnos actualmente creados en el sistema y seleccionar uno para matricularlo.)
           X - Tomar asistencia ( 
        Se ira recorriendo la lista de alumnos y se debera preguntar su estado , si el alumno esta resente NO pasa nada, si el alumno no esta presente, se aumenta su cantidad de inasistencias. )
        
             */
            System.out.println("ALUMNOS");
            System.out.println("1) Crear Alumnos");
            System.out.println("2) Listar Alumnos");
            System.out.println("3) Modificar Alumnos");
            System.out.println("CLASES");
            System.out.println("4) Crear Clases");
            System.out.println("5)Listar Clases");
            System.out.println("6) Modificar Clases");
            System.out.println("7)Matricular Alumnos");
            System.out.println("8) Asistencia");
            System.out.println("9) Salir");
            System.out.println("Ingrese su opción:");
            int op = entrada.nextInt();

            switch (op) {
                case 2 -> {
                    listarAlumnos(estudiantes);
                }

                case 5 -> {
                    listarClases(clases);
                }
                
                case 7 -> {
                    
                    clases = matricularAlumnosEnClase(estudiantes, clases);
                
                }
                default -> {

                }
            }// fin del switch 
        }// fin del while 

    }// fin del main 

    public static void listarAlumnos(ArrayList<Alumno> alumnos) {
        System.out.println("\n\n LISTA DE TODOS LOS ALUMNOS: ");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(i + " - " + alumnos.get(i));

        }
        System.out.println("");
    }
    
      public static void listarClases(ArrayList<Clase> clases) {
          System.out.println("\n\n LISTA DE TODOS LAS CLASES: ");
        for (int i = 0; i < clases.size(); i++) {
            System.out.println(i + " - " + clases.get(i));

        }
          System.out.println("");
    }
      
      
      public static ArrayList<Clase>   matricularAlumnosEnClase (ArrayList<Alumno> alumnos, ArrayList<Clase> clases){
          listarAlumnos(alumnos);
          System.out.println("Que alumo desea matricular: ");
          Scanner entrada = new Scanner(System.in);
          int posAlumno = entrada.nextInt();
          
          listarClases(clases);
          System.out.println("En que clase desea matricular al alumno: ");
          int posClase = entrada.nextInt();
          
          // Forma 1 de agregar un objeto.
          Clase claseSeleccionada = clases.get(posClase);
          Alumno alumnoSeleccionado = alumnos.get(posAlumno);
          claseSeleccionada.matricularAlumno(alumnoSeleccionado);
          
          //Forma 2 de agregar un objeto 
          clases.get(posClase).matricularAlumno(alumnos.get(posAlumno));
          return clases;
      }

}// fin de la clase 
