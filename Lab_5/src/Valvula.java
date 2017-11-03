
public class Valvula {

	private boolean estado;
	
	public Valvula (){
		estado = true;
	}
	
	public void cerrar() {
		estado = false;
	}
	
	public void abrir() {
		estado = true;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
