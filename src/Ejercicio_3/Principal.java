package Ejercicio_3;
public class Principal {
    public static void main(String[] args) {
        // LISTA DE PACIENTES
        LS_NormalPacienteHospital lsnp1 = new LS_NormalPacienteHospital();
        lsnp1.adiFinal(1, "Juan", "no", "Fisioterapia");
        lsnp1.adiFinal(2, "Pedro", "no", "Cardiologia");
        lsnp1.adiFinal(3, "Ana", "si", "Dermatologia");
        lsnp1.adiFinal(4, "Danna", "si", "Endocrinologia");
        lsnp1.adiFinal(5, "Carlos", "no", "Fisioterapia");
        System.out.println("LISTA DE PACIENTES 1: ");
        lsnp1.mostrar();

        LS_NormalPacienteHospital lsnp2 = new LS_NormalPacienteHospital();
        lsnp2.adiFinal(6, "Pedro", "no", "Fisioterapia");
        lsnp2.adiFinal(7, "Alex", "si", "Inmunologia");
        lsnp2.adiFinal(8, "Ernesto", "no", "Dermatologia");
        lsnp2.adiFinal(9, "Juan", "no", "Cardiologia");
        System.out.println("\nLISTA DE PACIENTES 2:");
        lsnp2.mostrar();

        // LISTA DE ESPECIALIDADES
        LS_NormalEspecialidades lsne1 = new LS_NormalEspecialidades();
        lsne1.adiFinal("Fisioterapia", "Gustavo");
        lsne1.adiFinal("Cardiologia", "Daniel");
        lsne1.adiFinal("Dermatologia", "Diego");
        lsne1.adiFinal("Endocrinologia", "Jose");
        lsne1.adiFinal("Inmunologia", "Gael");
        System.out.println("\nLISTA DE ESPECIALIDADES: ");
        lsne1.mostrar();

        System.out.println("\na) Contar la cantidad de pacientes no atendidos del Doctor X");  // Ejemplo: Gustavo
        System.out.println("LISTA 1.- ");
        int noAtendidos = contarPacientesNoAtendidos(lsnp1.getP(), "Fisioterapia");
        System.out.println("Pacientes no atendidos: " + noAtendidos);
        System.out.println("LISTA 2.- ");
        int noAtendidos2 = contarPacientesNoAtendidos(lsnp2.getP(), "Fisioterapia");
        System.out.println("Pacientes no atendidos: " + noAtendidos2);

        System.out.println("\nb) Verificar si la especialidad X ya no tiene pacientes en espera:"); // Ejemplo: Cardiologia
        System.out.println("LISTA 1.- ");
        boolean sinPacientes = verificarSinPacientes(lsnp1.getP(), "Cardiologia");
        System.out.println("¿Sin pacientes en espera? " + sinPacientes);
        System.out.println("LISTA 2.- ");
        boolean sinPacientes2 = verificarSinPacientes(lsnp2.getP(), "Cardiologia");
        System.out.println("¿Sin pacientes en espera? " + sinPacientes2);

        System.out.println("\nc) Mostrar a los pacientes con mayor cantidad de especialidades en espera:");
        mostrarPacientesMayorEspecialidades(lsnp1.getP(), lsnp2.getP());
    }

    // a.
    public static int contarPacientesNoAtendidos(NodoPacienteHospital nodo, String especialidad) {
        if (nodo == null) {
            return 0;
        }
        if (nodo.getEspecialidadPaciente().equals(especialidad) && nodo.getFueAtendido().equals("no")) {
            return 1 + contarPacientesNoAtendidos(nodo.getSig(), especialidad);
        }
        return contarPacientesNoAtendidos(nodo.getSig(), especialidad);
    }

    // b.
    public static boolean verificarSinPacientes(NodoPacienteHospital nodo, String especialidad) {
        if (nodo == null) {
            return true;
        }
        if (nodo.getEspecialidadPaciente().equals(especialidad) && nodo.getFueAtendido().equals("no")) {
            return false;
        }
        return verificarSinPacientes(nodo.getSig(), especialidad);
    }

    // c.
    public static void mostrarPacientesMayorEspecialidades(NodoPacienteHospital lista1, NodoPacienteHospital lista2) {
        if (lista1 == null) {
            return;
        }
        int count = contarEspecialidades(lista2, lista1.getNomPaciente(), 0);
        System.out.println(lista1.getNomPaciente() + " tiene " + count + " especialidades en espera.");
        mostrarPacientesMayorEspecialidades(lista1.getSig(), lista2);
    }

    // auxiliar de c
    public static int contarEspecialidades(NodoPacienteHospital nodo, String nombrePaciente, int count) {
        if (nodo == null) {
            return count;
        }
        if (nodo.getNomPaciente().equals(nombrePaciente) && nodo.getFueAtendido().equals("no")) {
            count++;
        }
        return contarEspecialidades(nodo.getSig(), nombrePaciente, count);
    }
}
