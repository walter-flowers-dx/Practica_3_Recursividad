package Ejercicio_7;

public class Principal {

    public static void main(String[] args) {
        LS_NormalEstudiante lsne = new LS_NormalEstudiante();
        lsne.adiFinal("Quiroga", "Quispe", "Juan", 20, 25, 0, 10);
        lsne.adiFinal("Perez", "Gonzalez", "Maria", 15, 10, 5, 8);
        lsne.adiFinal("Rojas", "Martinez", "Carlos", 2, 15, 0, 0);
        lsne.adiFinal("Garcia", "Fernandez", "Lucia", 10, 15, 12, 5);
        lsne.adiFinal("Vargas", "Castro", "Luis", 22, 20, 25, 10);
        lsne.adiFinal("Torrez", "Salazar", "Ana", 18, 18, 15, 9);
        lsne.adiFinal("Rojas", "Mamani", "Pedro", 25, 22, 20, 8);
        lsne.adiFinal("Ramirez", "Lopez", "Sofia", 17, 10, 10, 6);
        lsne.adiFinal("Zambrano", "Mejia", "Raul", 30, 28, 25, 10);
        lsne.adiFinal("Rojas", "Velasquez", "Diana", 21, 21, 0, 0);
        System.out.println("Lista de estudiantes: ");
        lsne.mostrar();

        System.out.println("\na) Mostrar a los estudiantes con nota aprobatoria");
        mostrarAprobados(lsne.getP());

        System.out.println("\nb) Contar cuántos estudiantes con el apellido paterno X tienen nota reprobatoria:");
        int reprobados = contarReprobados(lsne.getP(), "Rojas");
        System.out.println("Total estudiantes reprobados: " + reprobados);

        System.out.println("\nc) Mostrar a los estudiantes con nota reprobatoria en la ayudantía:");
        mostrarReprobadosAyudantia(lsne.getP());
    }

    // a.
    public static void mostrarAprobados(NodoEstudiante nodo) {
        if (nodo != null) {
            int sumaNotas = nodo.getNotaParcial1() + nodo.getNotaParcial2() + nodo.getNotaParcial3() + nodo.getNotaAyudantia();
            if (sumaNotas >= 51) {
                System.out.println("Estudiante: " + nodo.getNombre() + " " + nodo.getPaterno() + " " + nodo.getMaterno());
                System.out.println("Suma de notas: " + sumaNotas);
            }
            mostrarAprobados(nodo.getSig());
        }
    }

    // b.
    public static int contarReprobados(NodoEstudiante nodo, String apellido) {
        if (nodo == null) {
            return 0;
        }
        int sumaNotas = nodo.getNotaParcial1() + nodo.getNotaParcial2() + nodo.getNotaParcial3() + nodo.getNotaAyudantia();
        int esReprobado = (sumaNotas < 51 && nodo.getPaterno().equals(apellido)) ? 1 : 0;
        return esReprobado + contarReprobados(nodo.getSig(), apellido);
    }

    // c.
    public static void mostrarReprobadosAyudantia(NodoEstudiante nodo) {
        if (nodo != null) {
            if (nodo.getNotaAyudantia() <= 5) { // codicion para aprobar auxiliatura
                System.out.println("Estudiante: " + nodo.getNombre() + " " + nodo.getPaterno() + " " + nodo.getMaterno());
                System.out.println("Nota de ayudantía: " + nodo.getNotaAyudantia());
            }
            mostrarReprobadosAyudantia(nodo.getSig());
        }
    }

}
