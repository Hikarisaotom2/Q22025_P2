
package clase_28042025;
public class Persona {
    //atributos  
    private String nombre;
    private int edad;
    private String nombrePadre;
    private String nombreMadre;
    

    public Persona(String nombre, String nombrePadre) {
        this.nombre = nombre;
        this.nombrePadre = nombrePadre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String nombrePadre, String nombreMadre) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
    }
    
    
    //Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    //metodo
    //sobrecarga: el hecho de tener 2 o mas metodos con el mismo nombre. 
        // -> Podemos sobrecargar metodos , diferenciandolos con los parametros. 
        // -> cantidad y en orden 
    
    /*
    
    nombre             """""apellidos """"""
    calcularArea .        N/A
    calcularArea         int
    calcularArea         string
    calcularArea         int, string 
    calcularArea         string, int
    
    */
    
    
    
    /*
    1) especiales 
        -> nombre, DNI, presentar documentacion especial, .....
    2) normales 
        -> nombre, DNI, Titulo secundario, informacion....
    */
    
    /*
    caso 1: 
    Matricular()
     if(){
        matricula especial();
    else 
    matriculaNormal();
    
    );
    
    caso 2: 
    matricula especial();
    matriculaNormal()
    
    caso 3: 
    Matricula(nombre, DNI, presentar documentacion especial);
    Matricula(nombre, DNI, Titulo secundario, informacion);
    */
    
    
    public void calcularArea(){
        
    }
    
    
    public double calcularArea(int edad,  double valor){
        return 9.0;
        
    }
      
    
     public void calcularArea(String valor, int edad){
        
    }
    
     
    public void calcularArea(int edad, String valor){
        
    }
    
    //constructor
    // siempre debe tener el nombre de la clase 
    //  omitir el uso de las palabras reservadas, static, retorno, void 
    
//    Persona(String nombre, int edad){
//        this.nombre = nombre;
//        this.edad = edad;
//        // guardar en na base de datos datos eseciales.....
//  
//    }
//    
//      Persona(String nombre, String nombreMadre){
//        this.nombre = nombre;
//        this.nombreMadre = nombreMadre;
//        ///guardar datos estadisticos de madres soltera 
//        
//    }
    
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
