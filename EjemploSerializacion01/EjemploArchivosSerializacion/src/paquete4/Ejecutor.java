package paquete4;

/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {

        String nombreArchivo = "hospitales.txt";

        Hospital h1 = new Hospital("Hospital UTPL", 30, 750.00);
        Hospital h2 = new Hospital("San Agustín", 5000.99);
        Hospital h3 = new Hospital("Isidro Ayora", 60, 990.50);

 
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial
        (nombreArchivo);
        
        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
    
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial
        (nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);

    }
    
    
}
