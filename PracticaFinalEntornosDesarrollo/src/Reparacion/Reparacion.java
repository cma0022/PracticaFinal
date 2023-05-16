package Reparacion;

import Cliente.Cliente;
import Vehiculo.Vehiculo;

public class Reparacion {

	// VARIABLES
	private Cliente cliente;
	private Vehiculo vehiculo;
	private String descripcion;
	private String fecha;
	private String tiempo;
	private double totalReparacion;
	
	// CONSTRUCTOR VACÍO
	public Reparacion() {
		super();
	}

	// CONSTRUCTOR CON PARÁMETROS
	public Reparacion(Cliente cliente, Vehiculo vehiculo, String descripcion, String fecha, String tiempo, double totalReparacion) {
		super();
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.tiempo = tiempo;
		this.totalReparacion = totalReparacion;
	}

	// GETTERS Y SETTERS
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public double getTotalReparacion() {
		return totalReparacion;
	}

	public void setTotalReparacion(double totalReparacion) {
		this.totalReparacion = totalReparacion;
	}

	// MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Reparacion [descripcion=" + descripcion + ", fecha=" + fecha + ", tiempo=" + tiempo
				+ ", totalReparacion=" + totalReparacion + "]";
	}	
	
}
