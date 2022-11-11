package Service;

import Entidad.Alumno;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ServiciosAlumno {

    ArrayList<Alumno> listAlumnos = new ArrayList();

    public Alumno altaAlumno() {
        Scanner leer = new Scanner(System.in);
        Alumno alumno1 = new Alumno();
        String opcion;
        String nombre;
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = leer.next();
        System.out.println("Ingrese las notas del alumno: ");
        alumno1.getNotas().add(leer.nextDouble());
        alumno1.getNotas().add(leer.nextDouble());
        alumno1.getNotas().add(leer.nextDouble());
        alumno1.setNombre(nombre);
        promedio(alumno1);
        return alumno1;
    }

    public ArrayList<Alumno> añadirAlumno() {
        int opcion;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Si desea agregar otro alumno presione '1', sino, presione '2': ");
            opcion = leer.nextInt();
            if (opcion == 1) {
                listAlumnos.add(altaAlumno());
            }
        } while (opcion != 2);
        return listAlumnos;
    }

    public void seleccionAlumno() {
        Scanner leer = new Scanner(System.in);
        String alumno;
        int opcion;
        boolean aux1 = true;
        do {
            System.out.println("Si desea buscar otro alumno presione '1', sino, presione '2': ");
            opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese el nombre del alumno: ");
                alumno = leer.next();
                for (int i = 0; i < listAlumnos.size(); i++) {
                    if (listAlumnos.get(i).getNombre().equals(alumno)) {
                        aux1 = false;
                        System.out.println(listAlumnos.get(i).toString());
                    }
                }
                if (aux1 != false) {
                    System.out.println("alumno no encontrado");
                }
            }
        } while (opcion != 2);
    }

    public void promedio(Alumno alumno1) {
        double promedio = 0;
        for (Double aux : alumno1.getNotas()) {
            promedio = (aux) + promedio;
        }
        promedio = promedio / 3;
        System.out.println("El promedio de las notas del alumno es: " + promedio + ".");
    }

}
