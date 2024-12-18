package Ejercicio_5;

public class ListaSimpleEstudiantes {
    protected NodoEstudiantes P; 
    
    public ListaSimpleEstudiantes() {
        P = null;       
    }

    public NodoEstudiantes getP() {
        return P;
    }

    public void setP(NodoEstudiantes p) {
        P = p;
    }
}