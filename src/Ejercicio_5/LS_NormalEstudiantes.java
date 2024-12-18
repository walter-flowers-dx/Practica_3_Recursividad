package Ejercicio_5;

public class LS_NormalEstudiantes extends ListaSimpleEstudiantes {
    public LS_NormalEstudiantes() {
        super();
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiPrincipio(String pat, String mat, String nom, int nota) {
        NodoEstudiantes nuevo = new NodoEstudiantes();
        nuevo.setPat(pat);
        nuevo.setMat(mat);
        nuevo.setNom(nom);
        nuevo.setNota(nota);
        nuevo.setSig(P);
        P = nuevo;
    }

    public void adiFinal(String pat, String mat, String nom, int nota) {
        NodoEstudiantes nuevo = new NodoEstudiantes();
        nuevo.setPat(pat);
        nuevo.setMat(mat);
        nuevo.setNom(nom);
        nuevo.setNota(nota);

        if (esVacia()) {
            P = nuevo;
        } else {
            NodoEstudiantes R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoEstudiantes R = P;
        while (R != null) {
            System.out.print(R.getPat() + " - " + R.getMat() + " - " + R.getNom() + " - " + R.getNota() + "\n");
            R = R.getSig();
        }
        System.out.println();
    }

    public int nroNodos() {
        NodoEstudiantes R = P;
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
            String idioma = P.getNom();
            P = P.getSig();
            return idioma;
        }
    }

    public String eliFinal() {
        if (esVacia()) {
            return null;
        } else if (nroNodos() == 1) {
            String idioma = P.getNom();
            P = null;
            return idioma;
        } else {
            NodoEstudiantes R = P;
            NodoEstudiantes S = null;
            while (R.getSig() != null) {
                S = R;
                R = R.getSig();
            }
            String idioma = P.getNom();
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