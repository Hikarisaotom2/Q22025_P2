/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_07052025;

/**
 *
 * @author claudiacortes
 */
public class Clase_07052025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Dias hoy = Dias.MIERCOLES;
//        switch (hoy) {
//            case LUNES:
//                
//                break;
//            case MARTES:
//            case MIERCOLES:
//                    System.out.println("Hoy es miercoles");
//            default:
//               
//        }
        try {
            /*Agregamos el codigo que deseamos ejecutar.*/
            Dias convertir = Dias.valueOf("MIERCOLES");
            System.out.println(convertir);
            System.out.println(convertir.getFormaCorta());
            System.out.println(convertir.getFormaLarga());
            System.out.println(convertir.getPos());
            System.out.println(convertir.getSimbolo());
        } catch (Exception e) {
            /*aqui se ejecuta codigo en caso de que ocurra un exception*/
            System.out.println("Algo salio mal, lo sentimos");
        } finally {
            /*Opcional, se ejecuta despues del try o del catch */
            System.out.println("Esto se ejecuta al final de todo");
        }

    }// fin del main

}
