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
        
        Alumno gemeloAndy = new Alumno(andy.getNombre(), andy.getCuenta());
 
       
        
        System.out.println("ANDY: " + andy.hashCode());
        System.out.println("LEONARDO "+leonardo.hashCode());
        System.out.println("GEMELO ANDY "+gemeloAndy.hashCode());
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
         LISTO - listar alumnos 
          LISTO - modiifcar alumnos ( numero de cuenta es atributo e solo lectura) x
          
        -> Clases
          - crear clases 
          LISTO - listar clases 
          - modificar clases (seccion y nombre)
          LISTO - Matricular alumnos (Listar los alumnos actualmente creados en el sistema y seleccionar uno para matricularlo.)
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

                    System.out.println("_______________");
                }
                case 3 ->{
                    estudiantes = modificarAlumno(estudiantes);
                }

                case 5 -> {
                    listarClases(clases);
                }

                case 7 -> {

                    clases = matricularAlumnosEnClase(estudiantes, clases);

                }
                case 8->{
                    clases = tomarAsistencia(clases);
                }
                default -> {

                }
            }// fin del switch 
        }// fin del while 

    }// fin del main 

    public static ArrayList<Alumno> modificarAlumno(ArrayList<Alumno> alumnos) {
        int posAlumno = seleccionarAlumno(alumnos);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nuevo nombre del esudiante: ");
        String nuevoNombre = entrada.nextLine();
        Alumno alumnoSeleccionado = alumnos.get(posAlumno);
        alumnoSeleccionado.setNombre(nuevoNombre);
        System.out.println("ALUMNO ACTUALIZADO CON EXITO");
        return alumnos;
        
    }

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

    public static int seleccionarAlumno(ArrayList<Alumno> alumnos) {
        listarAlumnos(alumnos);
        System.out.println("Que alumo desea matricular: ");
        Scanner entrada = new Scanner(System.in);
        int posAlumno = entrada.nextInt();
        return posAlumno;
    }
    
    public static int seleccionarClase(ArrayList<Clase> clases){
         Scanner entrada = new Scanner(System.in);
        listarClases(clases);
        System.out.println("Seleccione una clase: ");
        int posClase = entrada.nextInt();
        return posClase;
    }
    
    public static ArrayList<Clase> matricularAlumnosEnClase(ArrayList<Alumno> alumnos, ArrayList<Clase> clases) {

        int posAlumno = seleccionarAlumno(alumnos);
        int posClase = seleccionarClase(clases);
  

        // Forma 1 de agregar un objeto.
        Clase claseSeleccionada = clases.get(posClase);
        Alumno alumnoSeleccionado = alumnos.get(posAlumno);
        claseSeleccionada.matricularAlumno(alumnoSeleccionado);

        //Forma 2 de agregar un objeto 
//          clases.get(posClase).matricularAlumno(alumnos.get(posAlumno));
        return clases;
    }
    
    public static ArrayList<Clase> tomarAsistencia(ArrayList<Clase> clases){
        int posClase = seleccionarClase(clases);
        System.out.println("Tomando asistencia para la clase");
        Clase claseSeleccionada = clases.get(posClase);
        ArrayList<Alumno> alumnosMatriculados = claseSeleccionada.getAlumnos();
//        clases.get(posClase).getAlumnos();
            System.out.println("1. PRESENTE 2. AUSENTE");
            Scanner entrada= new Scanner(System.in);
        for (int i = 0; i < alumnosMatriculados.size(); i++) {
            System.out.println(alumnosMatriculados.get(i) + "Presente?");
            int presente = entrada.nextInt();
            if(presente !=1){
                alumnosMatriculados.get(i).setInasistencias();
            }
            
        }
        return clases;
    }

}// fin de la clase 
