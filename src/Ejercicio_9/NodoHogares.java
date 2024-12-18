package Ejercicio_9;

import Ejercicio_7.NodoEstudiante;

public class NodoHogares {
	private int nroCasas;
	private String zona;
	private String propietario;
	private int idProp;
	private NodoHogares sig;
    
	public int getNroCasas() {
		return nroCasas;
	}
	public void setNroCasas(int nroCasas) {
		this.nroCasas = nroCasas;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public int getIdProp() {
		return idProp;
	}
	public void setIdProp(int idProp) {
		this.idProp = idProp;
	}
	public NodoHogares getSig() {
		return sig;
	}
	public void setSig(NodoHogares sig) {
		this.sig = sig;
	} 
    
    
    
}