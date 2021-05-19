package paquete6;

/**
 *
 * @author Jose Cordova
 */
public class Hospital {
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    /* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
    */
    
    public void establerNombre (String n){
        nombre = n;
    }
    public void establerNumeroCamas (int nc){
        numeroCamas = nc;
    }
    public void establerPresupuesto (double p){
        presupuesto = p ;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
    
}
