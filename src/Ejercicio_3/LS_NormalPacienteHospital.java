package Ejercicio_3;

public class LS_NormalPacienteHospital extends ListaSimplePacienteHospital {
    public LS_NormalPacienteHospital() {
        super();
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiPrincipio(int idPaciente, String nomPaciente, String fueAtendido, String especialidadPaciente) {
        NodoPacienteHospital nuevo = new NodoPacienteHospital();
        nuevo.setIdPaciente(idPaciente);
        nuevo.setNomPaciente(nomPaciente);
        nuevo.setFueAtendido(fueAtendido);
        nuevo.setEspecialidadPaciente(especialidadPaciente);
        nuevo.setSig(P);
        P = nuevo;
    }

    public void adiFinal(int idPaciente, String nomPaciente, String fueAtendido, String especialidadPaciente) {
    	NodoPacienteHospital nuevo = new NodoPacienteHospital();
        nuevo.setIdPaciente(idPaciente);
        nuevo.setNomPaciente(nomPaciente);
        nuevo.setFueAtendido(fueAtendido);
        nuevo.setEspecialidadPaciente(especialidadPaciente);
        
        if (esVacia()) {
            P = nuevo;
        } else {
            NodoPacienteHospital R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoPacienteHospital R = P;
        while (R != null) {
            System.out.print(R.getIdPaciente() + " - " + R.getNomPaciente() + " - " + R.getFueAtendido() + " - " + R.getEspecialidadPaciente() + "\n");
            R = R.getSig();
        }
        System.out.println();
    }

    public int nroNodos() {
        NodoPacienteHospital R = P;
        int count = 0;
        while (R != null) {
            count++;
            R = R.getSig();
        }
        return count;
    }

    public String eliPrincipio() {
        if (esVacia()) {
            return null;
        } else {
            String idioma = P.getNomPaciente();
            P = P.getSig();
            return idioma;
        }
    }

    public String eliFinal() {
        if (esVacia()) {
            return null;
        } else if (nroNodos() == 1) {
            String idioma = P.getNomPaciente();
            P = null;
            return idioma;
        } else {
            NodoPacienteHospital R = P;
            NodoPacienteHospital S = null;
            while (R.getSig() != null) {
                S = R;
                R = R.getSig();
            }
            String idioma = P.getNomPaciente();
            S.setSig(null);
            return idioma;
        }
    }

//    public void leer1(int n) {
//        for (int i = 1; i <= n; i++) {
//            adiPrincipio("Idioma_" + i, i * 1000); 
//        }
//    }
//
//    public void leer2(int n) {
//        for (int i = 1; i <= n; i++) {
//            adiFinal("Idioma_" + i, i * 1000); 
//        }
//    }
}