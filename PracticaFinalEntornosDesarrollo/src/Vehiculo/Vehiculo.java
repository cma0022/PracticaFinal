package Vehiculo;
/**
 * 
 * @author Jose Ángel
 *
 */
public class Vehiculo {
	//Declaro las variables de tipo String y de tipo int
	private String Matricula;
	private String Marca;
	private String Modelo;
	private int año;
	private String color;
	
/**
 * Constructor Vacío
 */
	public Vehiculo() {
		super();
	}
	/**
	 * Constructor con parámetros
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param año
	 * @param color
	 */
	public Vehiculo(String matricula, String marca, String modelo, int año, String color) {
		super();
		Matricula = matricula;
		Marca = marca;
		Modelo = modelo;
		this.año = año;
		this.color = color;
	}
	
	 // Getters and Setters
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// método toString()
	@Override
	public String toString() {
		return "Vehiculo [Matricula=" + Matricula + ", Marca=" + Marca + ", Modelo=" + Modelo + ", año=" + año
				+ ", color=" + color + "]";
	}
	
}
