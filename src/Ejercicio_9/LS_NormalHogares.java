package Ejercicio_9;

public class LS_NormalHogares extends ListaSimpleHogares {
    public LS_NormalHogares() {
        super();
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiPrincipio(int nroCasas, String zona, String propietario, int idProp) {
        NodoHogares nuevo = new NodoHogares();
        nuevo.setNroCasas(nroCasas);
        nuevo.setZona(zona);
        nuevo.setPropietario(propietario);
        nuevo.setIdProp(idProp);
        nuevo.setSig(P);
        P = nuevo;
    }

    public void adiFinal(int nroCasas, String zona, String propietario, int idProp) {
    	NodoHogares nuevo = new NodoHogares();
        nuevo.setNroCasas(nroCasas);
        nuevo.setZona(zona);
        nuevo.setPropietario(propietario);
        nuevo.setIdProp(idProp);
        nuevo.setSig(null); // El nuevo nodo no apunta a nada inicialmente

        if (esVacia()) {
            P = nuevo;
        } else {
            NodoHogares R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo); // El último nodo apunta al nuevo nodo
        }
    }


    public void mostrar() {
        NodoHogares R = P;
        while (R != null) {
            System.out.println("\nDatos De Hogares: ");
            System.out.println("Nro Casas: " + R.getNroCasas() + "\nZona: " + R.getZona() + "\nPropietario: " + R.getPropietario() +
                    "\nID Prop.: " + R.getIdProp());
            R = R.getSig();
        }
    }

    public int nroNodos() {
        NodoHogares R = P;
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
            String idioma = P.getPropietario();
            P = P.getSig();
            return idioma;
        }
    }

    public String eliFinal() {
        if (esVacia()) {
            return null;
        } else if (nroNodos() == 1) {
            String idioma = P.getPropietario();
            P = null;
            return idioma;
        } else {
            NodoHogares R = P;
            NodoHogares S = null;
            while (R.getSig() != null) {
                S = R;
                R = R.getSig();
            }
            String idioma = P.getPropietario();
            S.setSig(null);
            return idioma;
        }
    }
}