package Ejercicio_3;

public class LS_NormalEspecialidades extends ListaSimpleEspecialidades {
    public LS_NormalEspecialidades() {
        super();
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiPrincipio(String nomEspecialidad, String nomDoc) {
        NodoEspecialidades nuevo = new NodoEspecialidades();
        nuevo.setNomEspecialidad(nomEspecialidad);
        nuevo.setNomDoc(nomDoc);
        nuevo.setSig(P);
        P = nuevo;
    }

    public void adiFinal(String nomEspecialidad, String nomDoc) {
        NodoEspecialidades nuevo = new NodoEspecialidades();
        nuevo.setNomEspecialidad(nomEspecialidad);
        nuevo.setNomDoc(nomDoc);

        if (esVacia()) {
            P = nuevo;
        } else {
            NodoEspecialidades R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoEspecialidades R = P;
        while (R != null) {
            System.out.print(R.getNomEspecialidad() + " - " + R.getNomDoc() + "\n");
            R = R.getSig();
        }
        System.out.println();
    }

    public int nroNodos() {
        NodoEspecialidades R = P;
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
            String idioma = P.getNomEspecialidad();
            P = P.getSig();
            return idioma;
        }
    }

    public String eliFinal() {
        if (esVacia()) {
            return null;
        } else if (nroNodos() == 1) {
            String idioma = P.getNomEspecialidad();
            P = null;
            return idioma;
        } else {
            NodoEspecialidades R = P;
            NodoEspecialidades S = null;
            while (R.getSig() != null) {
                S = R;
                R = R.getSig();
            }
            String idioma = P.getNomEspecialidad();
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