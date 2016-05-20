//Definición del paquete
package Singleton_Pkg;

/**
 * UNIVERSIDAD MARIANO GALVEZ
 * Catedrático: César Hernández
 * Curso:       Diseño de Sistemas
 * Tema:        Patrón de creación (Singleton)
 * Descripción: El patrón de creación Singleton se basa en crear una única
 *              instancia de un objeto se utiliza para restringir la creacion
 *              de objetos pertenecientes a una clase o el valor de un tipo a
 *              un único objeto.
 * Alumno:      Marvin Alexander Grijalva Pérez
 * Carné:       0907 12 2589
 */

//Definición de la clase
public class Patron_Singleton {
    
    //Creación de variables
    private static Patron_Singleton obj_single;
    private String mensaje;

    //Métodos getter and setter
    public String getMensaje() {
        return mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    //Método para mostrar contendio de mensaje
    public void muestraMensaje(){
        System.out.println(this.mensaje);
    }
    
    //Verficiación de instancia única
    public static Patron_Singleton getInstance(){
        
        //Solo crea un objeto cuando este no existe, de lo contrario no lo crea
        if(obj_single == null){
            //Nueva instancia de objeto Patron_Singleton
            obj_single = new Patron_Singleton(); 
        }
        
        return obj_single;
    }
    
    
    public static void main(String args[]){
        
        //Creación de objeto
        Patron_Singleton ps1 = Patron_Singleton.getInstance();
        Patron_Singleton ps2 = Patron_Singleton.getInstance();
        Patron_Singleton ps3 = Patron_Singleton.getInstance();
        
        
        //Llamado de objeto único (Aunque al parecer existen varias instancias, se trabaja sobre el mismo objeto)
        ps1.mensaje = "Ps1 crea un texto";
        
        ps2.mensaje = ps1.mensaje + ", Ps2 Le concatena un texto";
        
        ps3.mensaje = ps3.mensaje + ", ps3 muestra el mensaje y todo sobre el mismo objeto...";
        
        ps3.muestraMensaje();
        
    }
}
