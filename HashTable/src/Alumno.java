
public class Alumno {
	
	private String nombre;
	private String matricula;
	private String apellido;
	
	
	public Alumno(String nombre, String matricula, String apellido) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", matricula=" + matricula + ", apellido=" + apellido + "]";
	}
	@Override
	public int hashCode() {
		int matriculaEntera=Integer.parseInt(matricula.substring(1, matricula.length()));
		
		return matriculaEntera;
	}
	
	public boolean equals(Object o) {
		Alumno a= (Alumno)o;
		return a.getMatricula().equals(matricula);
	}
	
	

}
