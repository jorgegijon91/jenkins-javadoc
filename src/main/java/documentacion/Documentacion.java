package documentacion;

// TODO: Auto-generated Javadoc
/**
 * Clase Documentacion.
 * @Author: Jorge Freno
 * @version 1.0
 */
public class Documentacion {
	
	/** The nombre. */
	String nombre;
	
	/** The apellidos. */
	String apellidos;
	
	/** The edad. */
	int edad;
	
	/** The dni. */
	String dni;
	
	/**
	 * Instantiates a new documentacion.
	 *
	 * @param nombre the nombre
	 * @param apellidos the apellidos
	 * @param edad the edad
	 * @param dni the dni
	 */
	public Documentacion(String nombre, String apellidos, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return nombre persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the apellidos.
	 *
	 * @return el apellido
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos nuevo apellido
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Sets the edad.
	 *
	 * @param edad nueva edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dni nuevo dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
