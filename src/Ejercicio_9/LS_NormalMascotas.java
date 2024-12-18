package Ejercicio_9;

public class LS_NormalMascotas extends ListaSimpleMascotas {
    public LS_NormalMascotas() {
        super();
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiPrincipio(String nombreMascota, int edadMascota, String sexoMascota, String tipoMascota, int idProp) {
        NodoMascotas nuevo = new NodoMascotas();
        nuevo.setNombreMascota(nombreMascota);
        nuevo.setEdadMascota(edadMascota);
        nuevo.setSexoMascota(sexoMascota);
        nuevo.setTipoMascota(tipoMascota);
        nuevo.setIdProp(idProp);
        nuevo.setSig(P);
        P = nuevo;
    }

    public void adiFinal(String nombreMascota, int edadMascota, String sexoMascota, String tipoMascota, int idProp) {
    	NodoMascotas nuevo = new NodoMascotas();
        nuevo.setNombreMascota(nombreMascota);
        nuevo.setEdadMascota(edadMascota);
        nuevo.setSexoMascota(sexoMascota);
        nuevo.setTipoMascota(tipoMascota);
        nuevo.setIdProp(idProp);
        nuevo.setSig(null); // El nuevo nodo no apunta a nada inicialmente

        if (esVacia()) {
            P = nuevo;
        } else {
            NodoMascotas R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo); // El último nodo apunta al nuevo nodo
        }
    }


    public void mostrar() {
        NodoMascotas R = P;
        while (R != null) {
            System.out.println("\nDatos De Mascota: ");
            System.out.println("Mascota: " + R.getNombreMascota() + "\nEdad: " + R.getEdadMascota() + "\nSexo: " + R.getSexoMascota() +
                    "\nTipo: " + R.getTipoMascota() );
            R = R.getSig();
        }
    }

    public int nroNodos() {
        NodoMascotas R = P;
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
            String idioma = P.getNombreMascota();
            P = P.getSig();
            return idioma;
        }
    }

    public String eliFinal() {
        if (esVacia()) {
            return null;
        } else if (nroNodos() == 1) {
            String idioma = P.getNombreMascota();
            P = null;
            return idioma;
        } else {
            NodoMascotas R = P;
            NodoMascotas S = null;
            while (R.getSig() != null) {
                S = R;
                R = R.getSig();
            }
            String idioma = P.getNombreMascota();
            S.setSig(null);
            return idioma;
        }
    }
}