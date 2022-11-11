
package Service;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPelicula {
    public Pelicula agregarPelicula(){
        Scanner leer = new Scanner(System.in);
        Pelicula pelicula1 = new Pelicula();
        String opcion;
        ArrayList<Pelicula> lista = new ArrayList();
        do{
            System.out.println("Ingrese el titulo de la pelicula: ");
            pelicula1.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula: ");
            pelicula1.setDirector(leer.next());
            System.out.println("Ingrese, en horas, la duracion de la pelicula: ");
            pelicula1.setDuracion(leer.nextDouble());
            System.out.println("Desea agregar otra pelicula ? Seleccione 's'/'n' segun corresponda: ");
            lista.add(pelicula1);
            opcion = leer.next();
            if(opcion.equals('n')){
                break;
            }
        } while(opcion.equals('s'));
      
        return pelicula1;
    }
    
    
    
    
    
}
