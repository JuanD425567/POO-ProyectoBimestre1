
package Casa;

import java.util.Scanner;

public class Propietario {
    Scanner entrada = new Scanner(System.in);
    String nombre;
    String apellido;
    int id;
    double preciometrocuadrado;
    double numerodemetros;
    double costofinal;
   boolean bandera = true;
   String mensajepropietariocasa;
   
   public void datos(){
       
           System.out.println("Inngrese nombre del propietario");
           nombre = entrada.nextLine();
           System.out.println("Ingrese el apellido del propietario");
           apellido = entrada.nextLine();
           System.out.println("Ingrese la celuda del propietario");
           id = entrada.nextInt();
           System.out.println("Ingrese el precio por metro cuadrado");
           preciometrocuadrado = entrada.nextDouble();
           System.out.println("Ingrese numero de metros cuadrados");
           numerodemetros= entrada.nextDouble();
           
           costofinal = preciometrocuadrado*numerodemetros;
           
           mensajepropietariocasa = "Nombre del propietario: "+nombre+" "+apellido+"\n"
                   +"Cedula del propietario: "+id+"\n"
                   +"Precio por metro cuadrado: "+preciometrocuadrado+"\n"
                   +"Numero de metros cuadrados: "+numerodemetros+"\n"
                   +"Precio total: "+costofinal;
       }

    public String getMensajepropietariocasa() {
        return mensajepropietariocasa;
    }
    public void setMensajepropietariocasa(String mensajepropietariocasa) {
        this.mensajepropietariocasa = mensajepropietariocasa;
    }
   
   }
    

//nombres, apellidos, identificación; precio por metro cuadrado; número de metros cuadrados; costo final