
public class PaqueteProyectores {
	private int codPaqueteDeProyectores;
	private String destinatario;
	private String destino;
	private float costoEnvio;
	private boolean enTransito;

	public PaqueteProyectores(int codPaqueteDeProyectores, String destinatario, String destino, float costoEnvio){
		this.codPaqueteDeProyectores= codPaqueteDeProyectores;
		this.destinatario= destinatario;
		this.destino= destino;
		this.costoEnvio= costoEnvio;
	}

	public void setCodPaquete(int codPaqueteDeProyectores){
		this.codPaqueteDeProyectores = codPaqueteDeProyectores;
	}

	public int getCodPaquete(){
		return codPaqueteDeProyectores;
	}

	public void setEnTransito(boolean enTransito){
		this.enTransito= true;
	}

	public boolean getEnTransito(){
		return true;
	}

	public void setDestinatario(String destinatario){
		this.destinatario= destinatario;
	}


}
