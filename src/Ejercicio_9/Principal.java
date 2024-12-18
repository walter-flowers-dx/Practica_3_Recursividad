package Ejercicio_9;

public class Principal {

    public static void main(String[] args) {
        LS_NormalHogares lsnh = new LS_NormalHogares();
        lsnh.adiFinal(2, "Miraflores", "Juan", 1);
        lsnh.adiFinal(1, "Sopocachi", "Marco", 2);
        lsnh.adiFinal(3, "Irpavi", "Ana", 3);
        lsnh.adiFinal(2, "Zona Sur", "Pedro", 4);
        lsnh.adiFinal(3, "El Alto", "Alberto", 5);
        System.out.println("Lista de Hogares: ");
        lsnh.mostrar();

        LS_NormalMascotas lsnm = new LS_NormalMascotas();
        lsnm.adiFinal("Rosa", 2, "Hembra", "Gato", 1);
        lsnm.adiFinal("Rocky", 4, "Macho", "Perro", 2);
        lsnm.adiFinal("Luna", 1, "Hembra", "Loro", 3);
        lsnm.adiFinal("Bruno", 5, "Macho", "Gato", 4);
        lsnm.adiFinal("Jack", 4, "Macho", "Gato", 2);
        lsnm.adiFinal("Flipo", 6, "Macho", "Perro", 3);
        lsnm.adiFinal("Buba", 2, "Macho", "Loro", 3);
        lsnm.adiFinal("Balu", 1, "Macho", "Mono", 4);
        System.out.println("\nLista de Mascotas:");
        lsnm.mostrar();

        System.out.println("\na) Mostrar el número de casa y el propietario de los hogares que no tienen mascotas:");
        mostrarHogaresSinMascotas(lsnh.getP(), lsnm.getP());

        System.out.println("\nb) Del propietario X mostrar las mascotas que tiene:");
        String propietario = "Marco";
        mostrarMascotasDePropietario(lsnm.getP(), propietario, lsnh.getP());

        System.out.println("\nc) Verificar si en la zona X existe hogares con mascotas del tipo Y:");
        String zona = "Irpavi"; 
        String tipoMascota = "Perro"; 
        boolean resultado = verificarHogarConMascotas(lsnh.getP(), lsnm.getP(), zona, tipoMascota);
        System.out.println("En la zona " + zona + " hay hogares con mascotas tipo " + tipoMascota + ": " + resultado);
    }
    
    // a.
    public static void mostrarHogaresSinMascotas(NodoHogares hogar, NodoMascotas mascota) {
        if (hogar == null) {
            return;
        }
        if (!tieneMascotas(hogar.getIdProp(), mascota)) {
            System.out.println("Número de casa: " + hogar.getNroCasas() + ", Propietario: " + hogar.getPropietario());
        }
        mostrarHogaresSinMascotas(hogar.getSig(), mascota);
    }

    private static boolean tieneMascotas(int idProp, NodoMascotas mascota) {
        if (mascota == null) {
            return false;
        }
        if (mascota.getIdProp() == idProp) {
            return true;
        }
        return tieneMascotas(idProp, mascota.getSig());
    }
    
    // b.
    public static void mostrarMascotasDePropietario(NodoMascotas mascota, String propietario, NodoHogares hogar) {
        if (mascota == null) {
            return;
        }
        if (mascota.getIdProp() == obtenerIdPropietario(propietario, hogar)) {
            System.out.println("Mascota: " + mascota.getNombreMascota() + ", Tipo: " + mascota.getTipoMascota() + ", Edad: " + mascota.getEdadMascota());
        }
        mostrarMascotasDePropietario(mascota.getSig(), propietario, hogar);
    }

    private static int obtenerIdPropietario(String propietario, NodoHogares hogar) {
        if (hogar == null) {
            return -1;
        }
        if (hogar.getPropietario().equals(propietario)) {
            return hogar.getIdProp();
        }
        return obtenerIdPropietario(propietario, hogar.getSig());
    }
    
    // c.
    public static boolean verificarHogarConMascotas(NodoHogares hogar, NodoMascotas mascota, String zona, String tipoMascota) {
        if (hogar == null) {
            return false;
        }
        if (hogar.getZona().equals(zona) && tieneMascotaDeTipo(hogar.getIdProp(), mascota, tipoMascota)) {
            return true;
        }
        return verificarHogarConMascotas(hogar.getSig(), mascota, zona, tipoMascota);
    }

    private static boolean tieneMascotaDeTipo(int idProp, NodoMascotas mascota, String tipoMascota) {
        if (mascota == null) {
            return false;
        }
        if (mascota.getIdProp() == idProp && mascota.getTipoMascota().equals(tipoMascota)) {
            return true;
        }
        return tieneMascotaDeTipo(idProp, mascota.getSig(), tipoMascota);
    }
}
