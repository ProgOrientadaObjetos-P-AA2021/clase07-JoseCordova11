package paquete4;

import java.io.Serializable;

/**
 *
 * @author Jose Cordova
 */
public class Hospital implements Serializable {
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    private Hospital [] lista;
    
    public Hospital(String n, int nroc, double p){
        nombre = n;
        numeroCamas = nroc;
        presupuesto = p;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    public void setNumeroCamas(int n){
        numeroCamas = n;
    }
    public void setPresupuesto(double n){
        presupuesto = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getNumeroCamas(){
        return numeroCamas;
    }
    public double getPresupuesto(){
        return presupuesto;
    }
    
}
