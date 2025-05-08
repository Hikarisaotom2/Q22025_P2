/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clase_07052025;

/**
 *
 * @author claudiacortes
 */

/*
    Los enums y las clases se parecen, pero NO son lo mismo. 
    al crear el archivo esto se vuelve un tipo de dato valido. 
*/
public enum Dias {
    LUNES("L",1,"Lun","Lunes"), // LUNES = new Dias("L",1,"Lun","Lunes")
    MARTES("M",2,"Mar","Martes"),
    MIERCOLES("MM",3,"Mier","Miercoles"),
    JUEVES("J",4,"Jue","Jueves"),
    VIERNES("V",5,"Vie","Viernes"),
    SABADO("S",6,"Sab","Sabado"),
    DOMINGO("D",7,"Dom","Domingo");
    
    private String simbolo;
    private int pos;
    private String formaCorta;
    private String formaLarga;

    private Dias(String simbolo, int pos, String formaCorta, String formaLarga) {
        this.simbolo = simbolo;
        this.pos = pos;
        this.formaCorta = formaCorta;
        this.formaLarga = formaLarga;
    } 

    public String getSimbolo() {
        return simbolo;
    }

    public int getPos() {
        return pos;
    }

    public String getFormaCorta() {
        return formaCorta;
    }

    public String getFormaLarga() {
        return formaLarga;
    }
    
    
}
