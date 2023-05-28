package proyectobimestral;

import java.io.*;

public class ManejoDeArchivos {

    public void crearArchivoPropietario(String propietario) {
        File archivo;
        try {
            archivo = new File("C:\\Users\\Cococ\\OneDrive\\Escritorio\\ProyectoBimestral\\dat\\casa.txt");

            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e) {
            System.err.println("No se ha creado el archivo por " + e);
        }
        FileWriter escribir;
    }

}
