
package Service;
import Entidad.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLibro {
    public Libro altaLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro1 = new Libro();
        //ArrayList<String> razas = new Arraylist();
        System.out.println("Ingrese el título del libro: ");
        libro1.setTitulo(leer.next());
        return libro1; 
    }
}
