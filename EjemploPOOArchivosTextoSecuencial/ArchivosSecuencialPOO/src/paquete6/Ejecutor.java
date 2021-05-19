package paquete6;

/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        String nombreArchivo = "hospital.txt";
        
        Hospital h1 = new Hospital("San Agustin", 70, 500.55);
        Hospital h2 = new Hospital("Hisidro Ayora", 90, 1500.99);
        Hospital h3 = new Hospital("Hospitalm UTPL", 50, 700.90);

        Hospital[] lista = {h1, h2, h3};

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {      
            archivo.establecerRegistro(lista[i]);       
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();
        
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
