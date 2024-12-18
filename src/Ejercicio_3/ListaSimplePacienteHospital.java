package Ejercicio_3;

public class ListaSimplePacienteHospital {
    protected NodoPacienteHospital P; 
    
    public ListaSimplePacienteHospital() {
        P = null;       
    }

    public NodoPacienteHospital getP() {
        return P;
    }

    public void setP(NodoPacienteHospital p) {
        P = p;
    }
}