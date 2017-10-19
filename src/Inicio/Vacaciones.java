package Inicio;
import java.util.Scanner;

public class Vacaciones {
    public static void main (String args[]) {

        // ********DEPARTAMENTOS********
        // Atencion al cliente - Clave 1
        // Logistica - Clave 2
        // Gerencia - Clave 3

        //Clave 1
        // 1 A = 6 Dias  vacaciones
        // 2 a 6 A = 14 DiasVacaciones
        // 7 A = 20 Dias Vacaciones

        //Clave 2
        // 1 A = 7 Dias  vacaciones
        // 2 a 6 A = 15 DiasVacaciones
        // 7 A = 22 Dias Vacaciones

        //Clave 3
        // 1 A = 10 Dias  vacaciones
        // 2 a 6 A = 20 DiasVacaciones
        // 7 A = 30 Dias Vacaciones


        // variables
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;

        // mensaje de bienvenida
        System.out.println("*****************************************************");
        System.out.println("Bienvenido al sistema vacacional de coca cola Company");
        System.out.println("*****************************************************");

        //saltos de linea
        System.out.println("");
        System.out.println("");

        // obtener nombre
        System.out.println("-----------------------------------------------------");
        System.out.print("cual es el nombre del trabajador?; ");
            nombre = in.nextLine();
            System.out.println("");

        // obtener antiguedad
        System.out.println("-----------------------------------------------------");
        System.out.print("cuanto tiene de servicio el trabajador?; ");
            antiguedad = in.nextInt();
            System.out.println("");

        //clave trabajador
        System.out.println("-----------------------------------------------------");
        System.out.print("Cual es la clave del trabajador?; ");
            clave = in.nextInt();
            System.out.println("");

        if (clave == 1){
            if(antiguedad == 1){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 6 dias de vacaciones");
            }else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 14 dias de vacaciones");
            }else if (antiguedad >= 7){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
            }

        }else if (clave == 2){
            if(antiguedad == 1){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 7 dias de vacaciones");
            }else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 15 dias de vacaciones");
            }else if (antiguedad >= 7){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 22 dias de vacaciones");
            }

        }else if (clave == 3){
            if(antiguedad == 1){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 10 dias de vacaciones");
            }else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones");
            }else if (antiguedad >= 7){
                System.out.println(" El trabajador " + nombre + " tiene derecho a 30 dias de vacaciones");
            }
        }
    }
}
