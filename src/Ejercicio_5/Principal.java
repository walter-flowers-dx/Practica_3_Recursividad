package Ejercicio_5;

public class Principal {

    public static void main(String[] args) {
        LS_NormalEstudiantes lsne = new LS_NormalEstudiantes();
        lsne.adiFinal("Garcia", "Mamani", "Juan", 75);
        lsne.adiFinal("Lopez", "Perez", "Maria", 45);
        lsne.adiFinal("Quispe", "Choque", "Luis", 0);
        lsne.adiFinal("Mendoza", "Vargas", "Ana", 88);
        lsne.adiFinal("Flores", "Huanca", "Carlos", 70);
        lsne.adiFinal("Gutierrez", "Soto", "Elena", 50);
        lsne.adiFinal("Torrez", "Cruz", "Miguel", 51);
        lsne.adiFinal("Rojas", "Fernandez", "Sofia", 77);
        lsne.adiFinal("Garcia", "Loayza", "Jorge", 100);
        lsne.adiFinal("Zeballos", "Torres", "Valeria", 10);

        System.out.println("Lista de Estudiantes: ");
        lsne.mostrar();

        System.out.println("\na) Mostrar a los estudiantes con la mejor nota de la lista:");
        int maxNota = encontrarMaxNota(lsne.getP());
        mostrarEstudiantesConNota(lsne.getP(), maxNota);

        System.out.println("\nb) Mostrar el nombre y nota de los estudiantes con apellido paterno X"); 
        mostrarEstudiantesConApellido(lsne.getP(), "Garcia"); // Ejemplo: Garcia

        System.out.println("\nc) Calcular la nota promedio de la lista de estudiantes:");
        int sumaNotas = calcularSumaNotas(lsne.getP());
        int nroEstudiantes = contarEstudiantes(lsne.getP());
        double promedio = nroEstudiantes == 0 ? 0 : (double) sumaNotas / nroEstudiantes;
        System.out.println("Promedio de notas: " + promedio);
    }

    // a.
    public static int encontrarMaxNota(NodoEstudiantes nodo) {
        if (nodo == null) 
        	return Integer.MIN_VALUE;
        int maxResto = encontrarMaxNota(nodo.getSig());
        return Math.max(nodo.getNota(), maxResto);
    }
    
    public static void mostrarEstudiantesConNota(NodoEstudiantes nodo, int nota) {
        if (nodo == null) return;
        if (nodo.getNota() == nota) {
            System.out.println(nodo.getPat() + " " + nodo.getMat() + " " + nodo.getNom() + "\nNota: " + nodo.getNota());
        }
        mostrarEstudiantesConNota(nodo.getSig(), nota);
    }

    // b.
    public static void mostrarEstudiantesConApellido(NodoEstudiantes nodo, String apellido) {
        if (nodo == null) return;
        if (nodo.getPat().equals(apellido)) {
            System.out.println(nodo.getNom() + " - Nota: " + nodo.getNota());
        }
        mostrarEstudiantesConApellido(nodo.getSig(), apellido);
    }

    // c.
    public static int calcularSumaNotas(NodoEstudiantes nodo) {
        if (nodo == null) return 0;
        return nodo.getNota() + calcularSumaNotas(nodo.getSig());
    }

    public static int contarEstudiantes(NodoEstudiantes nodo) {
        if (nodo == null) return 0;
        return 1 + contarEstudiantes(nodo.getSig());
    }
}
