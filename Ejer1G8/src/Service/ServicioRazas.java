
package Service;
import Entidad.Razas;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

public class ServicioRazas {
    public Razas altaRaza(){
        Scanner leer = new Scanner(System.in);
        Razas perro1 = new Razas();
        String opcion;
        String nombreRaza;
        ArrayList<String> razas = new ArrayList();
        do{
            System.out.println("Ingrese una raza de perro: ");
            nombreRaza=leer.next();
        System.out.println("Desea ingresar otra raza? Seleccione s/n segun corresponda: ");
        opcion=leer.next();
        razas.add(nombreRaza); 
        if (opcion.equals("n")){
            break;
        }
        }while(opcion.equals("s"));
        perro1.setRaza(razas);
        return perro1;
    }
    public void mostrar(Razas perro1){
        System.out.println(perro1.getRaza());
        
    }    
    public void eliminar(Razas perro1){
        Iterator it = perro1.getRaza().iterator();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una raza para eliminarla de la lista: ");
        String eliminar = leer.next();        
        while(it.hasNext()){
            if(it.next().equals(eliminar)){
                it.remove();
            }
        } 
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
    }
    
    }

