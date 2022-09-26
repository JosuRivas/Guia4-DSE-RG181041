package datos;

public class profesor {
	private String nombre;
	private String correo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "profesor [nombre=" + nombre + ", correo=" + correo + "]";
	}
	public profesor(String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.correo = correo;
	}
	
	public profesor() {
		super();
	}
	
	
	
}
