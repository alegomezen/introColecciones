
package Entidad;
import java.util.ArrayList;

public class Razas {
    private ArrayList<String> raza;
    
    public Razas() {
    }

    public Razas(ArrayList<String> raza) {
        this.raza = raza;
    }

    public ArrayList<String> getRaza() {
        return raza;
    }

    public void setRaza(ArrayList<String> raza) {
        this.raza = raza;
    }
    
    

    @Override
    public String toString() {
        return "Razas{" + "raza=" + raza + '}';
    }
    
}
