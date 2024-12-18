package Ejercicio_9;

public class NodoMascotas {
	private String nombreMascota;
	private int edadMascota;
	private String sexoMascota;
	private String tipoMascota;
	private int idProp;
    private NodoMascotas sig;
    
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public int getEdadMascota() {
		return edadMascota;
	}
	public void setEdadMascota(int edadMascota) {
		this.edadMascota = edadMascota;
	}
	public String getSexoMascota() {
		return sexoMascota;
	}
	public void setSexoMascota(String sexoMascota) {
		this.sexoMascota = sexoMascota;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public int getIdProp() {
		return idProp;
	}
	public void setIdProp(int idProp) {
		this.idProp = idProp;
	}
	public NodoMascotas getSig() {
		return sig;
	}
	public void setSig(NodoMascotas sig) {
		this.sig = sig;
	} 
    
    
    
}