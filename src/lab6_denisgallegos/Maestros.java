/*Clase para el objeto MAESTROS.
 */
package lab6_denisgallegos;

import java.util.ArrayList;


public class Maestros extends Personas{
    
    private double salario;
    private ArrayList clases = new ArrayList();

    public Maestros() {
    }

    public Maestros(double salario) {
        this.salario = salario;
    }
    
    //MUTADORES: 
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }
    
    //MA: 
    public String toStringMaestros(){
        return toStringPersonas()+", Salario: "+salario;
    }
    
}//Fin de la clase.
