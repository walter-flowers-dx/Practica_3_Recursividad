package Ejercicio_7;

public class ListaSimpleEstudiante {
    protected NodoEstudiante P; 
    
    public ListaSimpleEstudiante() {
        P = null;       
    }

    public NodoEstudiante getP() {
        return P;
    }

    public void setP(NodoEstudiante p) {
        P = p;
    }
}