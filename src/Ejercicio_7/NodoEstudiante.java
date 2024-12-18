package Ejercicio_7;

public class NodoEstudiante {
	private String paterno;
	private String materno;
	private String nombre;
	private int notaParcial1;
	private int notaParcial2;
	private int notaParcial3;
	private int NotaAyudantia;
    private NodoEstudiante sig;
    
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNotaParcial1() {
		return notaParcial1;
	}
	public void setNotaParcial1(int notaParcial1) {
		this.notaParcial1 = notaParcial1;
	}
	public int getNotaParcial2() {
		return notaParcial2;
	}
	public void setNotaParcial2(int notaParcial2) {
		this.notaParcial2 = notaParcial2;
	}
	public int getNotaParcial3() {
		return notaParcial3;
	}
	public void setNotaParcial3(int notaParcial3) {
		this.notaParcial3 = notaParcial3;
	}
	public int getNotaAyudantia() {
		return NotaAyudantia;
	}
	public void setNotaAyudantia(int notaAyudantia) {
		NotaAyudantia = notaAyudantia;
	}
	public NodoEstudiante getSig() {
		return sig;
	}
	public void setSig(NodoEstudiante sig) {
		this.sig = sig;
	} 
    
    
    
}