
package javaguia8pdf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap; 
import java.util.Scanner;
import Entidad.Libro;
import Service.ServiceLibro;
public class JavaGuia8PDF {

    
    public static void main(String[] args) {
        //Listas:
        Scanner leer = new Scanner(System.in);
        ServiceLibro serv1 = new ServiceLibro();
        Libro libro1 = serv1.altaLibro();
        Libro libro2 = serv1.altaLibro();
        Libro libro3 = serv1.altaLibro();
        Libro libro4 = serv1.altaLibro();
        Libro libro5 = serv1.altaLibro();
        ArrayList<Libro> libros = new ArrayList();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        for (Libro ejemplar:libros){
            System.out.println(ejemplar);
        }
        //Puede ser así o como está abajo, que es lo que recomienda el IDE. S
        //libros.forEach((ejemplar) -> {
          //  System.out.println("El libro se titula: "+ejemplar);
        //});
        ///Esta bien, tendria que ver como hacer para que salga sin el parentesis y los iguales. 
        /*
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        int y = 35;
        int e = 22;
        int r = 33;
        int o = 11;
        numerosA.add(x); //agregamos el numero 20 a la lista en la posicion 0. 
        numerosA.add(y);
        numerosA.add(e);
        numerosA.add(r);
        numerosA.add(o);
        //Borrando elementos:
        // numerosA.remove(20); Aca me da un error que no se que es xd
        numerosA.remove(1); 
        //Conjuntos:
        HashSet <Integer> numerosB = new HashSet();
        Integer z = 30;
        Integer l = 32;
        Integer p = 12;
        Integer q = 44;
        Integer n = 54;
        numerosB.add(z);
        numerosB.add(l);
        numerosB.add(p);
        numerosB.add(q);
        numerosB.add(n);
        //Borrando 
        numerosB.remove(54);
        //Mapas 
        HashMap<Integer, String> alumnos = new HashMap();
        int DNI1 = 42203417;
        String nombreAlumno1="Ale";
        String nombreAlumno2="Rocky";
        String nombreAlumno3="Giro";
        String nombreAlumno4="Lucas";
        String nombreAlumno5="Tobias";
        int DNI2 = 12332132;
        int DNI3 = 43212332;
        int DNI4 = 42312434;
        int DNI5 = 32112341;
        alumnos.put(DNI1, nombreAlumno1); //agregamos llave y valor. 
        alumnos.put(DNI2, nombreAlumno2);
        alumnos.put(DNI3, nombreAlumno3);
        alumnos.put(DNI4, nombreAlumno4);
        alumnos.put(DNI5, nombreAlumno5);
        //Borrando
        alumnos.remove(DNI3);
         */

    }
    
}
