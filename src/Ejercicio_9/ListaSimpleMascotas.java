package Ejercicio_9;

public class ListaSimpleMascotas {
    protected NodoMascotas P; 
    
    public ListaSimpleMascotas() {
        P = null;       
    }

    public NodoMascotas getP() {
        return P;
    }

    public void setP(NodoMascotas p) {
        P = p;
    }
}