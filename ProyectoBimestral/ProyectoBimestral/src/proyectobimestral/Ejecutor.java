package proyectobimestral;
import Casa.Propietario;
import java.util.Scanner;
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Propietario casa = new Propietario();
        ManejoDeArchivos archivos = new ManejoDeArchivos();
        int opsalida;
        int op;
        boolean bandera=true;
        
        //MENU
        while(bandera == true){
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println("Añadir casa           [1]");
            System.out.println("Añadir departamento   [2]");
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            op = entrada.nextInt();
            if (op == 1) {
                casa.datos();
            }
            if (op == 2) {
                
            }
            //Salida
            System.out.println("Quiere añadir algo mas? Si[1] No[2]");
            opsalida = entrada.nextInt();
            if (opsalida == 2) {
                bandera=false;
            }
        }
        archivos.crearArchivoPropietario(casa.getMensajepropietariocasa());
    }
    
}
