/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_30042025;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_30042025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Biblioteca:
        CRUD 
        1) crear Libros
        2) listar libros
        3) regresar libros 
        4) alquilarLibros
        5) Eliminar libros 
        
        */
        
        ArrayList<Libro> biblioteca = new ArrayList<Libro>();
        
        
        Libro nuevoLibro = new Libro("Caperucita");
        Libro libro2 = new Libro("El vencedor esta solo");
        
        biblioteca.add(libro2);
        biblioteca.add(nuevoLibro);
        listarBiblioteca(biblioteca);
            
        
        //Reservar un libro:
        
        biblioteca = reservar(biblioteca);
        
        listarBiblioteca(biblioteca);
        
        
    }
    
    public static ArrayList<Libro> reservar(ArrayList<Libro> lista){
        listarBiblioteca(lista);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la posición de el libro que quiere reservar: ");
        int pos = entrada.nextInt(); // Validar este dato (0>= valor <= lista.size-1)
        entrada.nextLine();
        System.out.println("Ingrese quien esta a cargo de la reserva: ");
        String usuario = entrada.nextLine();
        
        Libro libroPrestar = lista.get(pos);
        libroPrestar.setEstado(false);
        libroPrestar.setUsuarioACargo(usuario);
        
        return lista;
    }
    
    
    public static void listarBiblioteca(ArrayList<Libro> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" ) "+lista.get(i));
        }
        
    }
    
}
