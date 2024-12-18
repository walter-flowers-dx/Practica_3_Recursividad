package Ejercicio_7;

public class LS_NormalEstudiante extends ListaSimpleEstudiante {
    public LS_NormalEstudiante() {
        super();
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiPrincipio(String paterno, String materno, String nombre, int p1, int p2, int p3, int na) {
        NodoEstudiante nuevo = new NodoEstudiante();
        nuevo.setPaterno(paterno);
        nuevo.setMaterno(materno);
        nuevo.setNombre(nombre);
        nuevo.setNotaParcial1(p1);
        nuevo.setNotaParcial2(p2);
        nuevo.setNotaParcial3(p3);
        nuevo.setNotaAyudantia(na);
        nuevo.setSig(P);
        P = nuevo;
    }

    public void adiFinal(String paterno, String materno, String nombre, int p1, int p2, int p3, int na) {
        NodoEstudiante nuevo = new NodoEstudiante();
        nuevo.setPaterno(paterno);
        nuevo.setMaterno(materno);
        nuevo.setNombre(nombre);
        nuevo.setNotaParcial1(p1);
        nuevo.setNotaParcial2(p2);
        nuevo.setNotaParcial3(p3);
        nuevo.setNotaAyudantia(na);
        nuevo.setSig(null); // El nuevo nodo no apunta a nada inicialmente

        if (esVacia()) {
            P = nuevo;
        } else {
            NodoEstudiante R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo); // El último nodo apunta al nuevo nodo
        }
    }


    public void mostrar() {
        NodoEstudiante R = P;
        while (R != null) {
            System.out.println("\nDatos Estudiante: ");
            System.out.println("Paterno: " + R.getPaterno() + "\nMaterno: " + R.getMaterno() + "\nNombre: " + R.getNombre() +
                    "\nParcial1: " + R.getNotaParcial1() + "\nParcial2: " + R.getNotaParcial2() +
                    "\nParcial3: " + R.getNotaParcial3() + "\nAyudantia: " + R.getNotaAyudantia());
            R = R.getSig();
        }
    }

    public int nroNodos() {
        NodoEstudiante R = P;
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
            String idioma = P.getPaterno();
            P = P.getSig();
            return idioma;
        }
    }

    public String eliFinal() {
        if (esVacia()) {
            return null;
        } else if (nroNodos() == 1) {
            String idioma = P.getPaterno();
            P = null;
            return idioma;
        } else {
            NodoEstudiante R = P;
            NodoEstudiante S = null;
            while (R.getSig() != null) {
                S = R;
                R = R.getSig();
            }
            String idioma = P.getPaterno();
            S.setSig(null);
            return idioma;
        }
    }
}