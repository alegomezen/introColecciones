
package ejer3g8;
import Entidad.Alumno;
import Service.ServiciosAlumno;

public class Ejer3G8 {

    
    public static void main(String[] args) {
        ServiciosAlumno serv1 = new ServiciosAlumno();
        Alumno alumno1 = new Alumno();
        serv1.añadirAlumno();
        serv1.seleccionAlumno();
        
    }
    
}
