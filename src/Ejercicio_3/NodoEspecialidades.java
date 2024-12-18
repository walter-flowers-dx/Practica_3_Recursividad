package Ejercicio_3;

public class NodoEspecialidades {
	private String nomEspecialidad;
	private String nomDoc;
    private NodoEspecialidades sig;
    
	public String getNomEspecialidad() {
		return nomEspecialidad;
	}
	public void setNomEspecialidad(String nomEspecialidad) {
		this.nomEspecialidad = nomEspecialidad;
	}
	public String getNomDoc() {
		return nomDoc;
	}
	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}
	public NodoEspecialidades getSig() {
		return sig;
	}
	public void setSig(NodoEspecialidades sig) {
		this.sig = sig;
	} 
    
    
    
}