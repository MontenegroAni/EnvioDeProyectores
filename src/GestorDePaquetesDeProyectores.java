import java.util.ArrayList;
import java.util.List;

public class GestorDePaquetesDeProyectores {
	private List<PaqueteProyectores> paquetes;
	private String nombreEmpresa;

	public GestorDePaquetesDeProyectores(String nombreEmpresa){
		this.paquetes= new ArrayList<>();
		this.nombreEmpresa= nombreEmpresa;
	}

	public String getNombreEmpresa(){
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa){
		this.nombreEmpresa= nombreEmpresa;
	}

	public void agregarPaquete(PaqueteProyectores paqueteNuevo){
		this.paquetes.add(paqueteNuevo);
	}

	public PaqueteProyectores buscarPaqueteDeProyectores(int codPaq){
		for(PaqueteProyectores p : paquetes){
			if (p.getCodPaquete()==codPaq){
				return p;
			}
		}
		return null;
	}

}
