package clinicamemuero;

import java.util.LinkedList;

public class clinicaPacientes {

    private LinkedList<Paciente> listaEspera;

    //contructor 
    public clinicaPacientes() {
        this.listaEspera = new LinkedList<>();
    }

    public void AgregarPaciente(Paciente paciente) {
        listaEspera.addLast(paciente);
        System.out.println("\nPaciente registrado " + paciente.getName() + "Motivo consulta " + paciente.getReason());

    }

    public void AtenderPaciente() {
        if (!listaEspera.isEmpty()) {
            Paciente pacienteAtendido = listaEspera.removeFirst();
            System.out.println("\nAtendiendo a: " + pacienteAtendido.getName() + "\nMotivo consulta: " + pacienteAtendido.getReason());
        } else {
            System.out.println("\nNo hay pacientes en la lista de espera");
        }
    }

    public void MostrarPacientes() {

        System.out.println("\nLista de pacientes que probablemente van a morir"); //Que viva la negligencia medica
        if (listaEspera.isEmpty()) {
            System.out.println("\nNo hay que chambear, no hay nadie");
        } else {

            for (Paciente paciente : listaEspera) {
                System.out.println("Paciente: " + paciente.getName() +"\nMotivo consulta: "+paciente.getReason());

            }
        }
    }

}
