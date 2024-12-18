package Ejercicio_5;

public class NodoEstudiantes {
	private String pat;
	private String mat;
	private String nom;
	private int nota;
    private NodoEstudiantes sig;
    
	public String getPat() {
		return pat;
	}
	public void setPat(String pat) {
		this.pat = pat;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public NodoEstudiantes getSig() {
		return sig;
	}
	public void setSig(NodoEstudiantes sig) {
		this.sig = sig;
	} 
    
    
    
}