/* 
Integrantes

Bryam Estiven Benachi Luligo
Everson Castro Ramos
Daniel Estiben Medina Tobar
Camilo Andrés Villegas Flor

Corporación Universitaria Unicomfacauca.
Ing. de sistemas-Diurno

 */
package clinicamemuero;

import java.util.Scanner;

public class ClinicaMeMuero {

    public static void main(String[] args) {

        clinicaPacientes salaEspera = new clinicaPacientes();

        Scanner teclado = new Scanner(System.in);

        Boolean menu = false;
        while (!menu) {

            System.out.println("\nBienvenido a Clinica me Muero, su ultimo suspiro nos alegra \n");
            System.out.print("______________________________________________________________________\n______________________________________________________________________");
            System.out.println("\nAgregar paciente || 1 ||  Atender siguiente paciente || 2 ||\nLista de pacientes || 3 || Salir || 0 || ");
            System.out.print("______________________________________________________________________\n______________________________________________________________________");
            System.out.println("\nIngrese una opción");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del Paciente: ");
                    String name = teclado.nextLine();
                    System.out.println("Motivo de consulta: ");
                    String reason = teclado.nextLine();
                    salaEspera.AgregarPaciente(new Paciente(name, reason));
                    break;
                case 2:
                    salaEspera.AtenderPaciente();
                    break;
                case 3:
                    salaEspera.MostrarPacientes();
                    break;
                case 0:
                    menu = true;
                    break;
                default:
                    
                    System.out.print("\n______________________________________________________________________\n______________________________________________________________________");
                    System.out.println("\nIngrese una opcion valida");
                    System.out.print("______________________________________________________________________\n______________________________________________________________________\n");

            }

        }
        teclado.close();
    }

}
