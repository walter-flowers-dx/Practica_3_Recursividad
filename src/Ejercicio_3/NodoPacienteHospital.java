package Ejercicio_3;

public class NodoPacienteHospital {
	private int idPaciente;
	private String nomPaciente;
	private String fueAtendido;
	private String especialidadPaciente;
    private NodoPacienteHospital sig;
    
	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNomPaciente() {
		return nomPaciente;
	}

	public void setNomPaciente(String nomPaciente) {
		this.nomPaciente = nomPaciente;
	}

	public String getFueAtendido() {
		return fueAtendido;
	}

	public void setFueAtendido(String fueAtendido) {
		this.fueAtendido = fueAtendido;
	}

	public String getEspecialidadPaciente() {
		return especialidadPaciente;
	}

	public void setEspecialidadPaciente(String especialidadPaciente) {
		this.especialidadPaciente = especialidadPaciente;
	}

	public NodoPacienteHospital getSig() {
		return sig;
	}

	public void setSig(NodoPacienteHospital sig) {
		this.sig = sig;
	} 
    
    
    
}