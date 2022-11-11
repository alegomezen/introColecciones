
package ejer1g8;
import Entidad.Razas;
import Service.ServicioRazas;

public class Ejer1G8 {

  
    public static void main(String[] args) {
        ServicioRazas serv1 = new ServicioRazas();
        Razas raza1 = serv1.altaRaza();
        serv1.mostrar(raza1);
        serv1.eliminar(raza1);
    }
    
}
