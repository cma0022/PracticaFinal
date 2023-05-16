package Reparacion;

import java.util.ArrayList;

import Cliente.Cliente;
import Vehiculo.Vehiculo;

/**
 * 16/05/2023
 * @author Carlos Martínez Antolínez
 * Esta preciosa creación es obra del gran y famoso programadas carlos_magy
 */
public class GestionarReparaciones {

	ArrayList<Reparacion> reparaciones = new ArrayList<Reparacion>();
	
	/**
	 * EL MÉTODO SIRVE PARA INSERTAR UNA NUEVA REPARACIÓN EN EL ARRAYLIST
	 * @param c1 OBJETO CLIENTE QUE MANDA A REPARAR
	 * @param v1 OBJETO VEHICULO A REPARAR
	 * @param descripcion STRING DESCRIPCION DE LA REPARACIÓN
	 * @param fecha STRING FECHA EN LA QUE SE ENTREGA EL COCHE
	 * @param tiempo STRING TIEMPO QUE VA A DURAR LA REPARACIÓN
	 * @param totalReparacion DOUBLE PRECIO QUE VA A COSTAR LA REPARACIÓN
	 * @return ARRAYLIST DE TIPO REPARACION QUE GUARDA LA REPARACION QUE HEMOS INSERTADO
	 */
	public void insertarReparacion(Cliente c1, Vehiculo v1, String descripcion, String fecha, String tiempo, double totalReparacion){
		Reparacion r1 = new Reparacion(c1, v1, descripcion, fecha, tiempo, totalReparacion);
		this.reparaciones.add(r1);
		System.out.println("Se ha insertado una nueva reparación.");
	}
	
	/**
	 * EL MÉTODO SIRVE PARA MODIFICAR UNA REPARACIÓN QUE ME PASAN
	 * @param r1
	 * @param c1
	 * @param v1
	 * @param descripcion
	 * @param fecha
	 * @param tiempo
	 * @param totalReparacion
	 * @return
	 */
	public void modificarReparacion(int indice, Cliente c1, Vehiculo v1, String descripcion, String fecha, String tiempo, double totalReparacion) {
		Reparacion reparacion = reparaciones.get(indice);
		reparacion.setCliente(c1);
		reparacion.setVehiculo(v1);
		reparacion.setDescripcion(descripcion);
		reparacion.setFecha(fecha);
		reparacion.setTiempo(tiempo);
		reparacion.setTotalReparacion(totalReparacion);
		
		reparaciones.add(indice, reparacion);
		System.out.println("Reparación modificada.");
	}
	
	/**
	 * EL MÉTODO SIRVE PARA BUSCAR UNA REPARACIÓN POR CLIENTE
	 * @param c1 OBJETO CLIENTE 
	 * @return DEVUELVE UN ARRAYLIST DE TIPO REPARACION CON LAS REPARACIONES QUE CONTENGA EL CLIENTE QUE LE HEMOS PASADO
	 */
	public ArrayList<Reparacion> buscarReparacionPorCliente(Cliente c1) {
		ArrayList<Reparacion> reparacionConCliente = new ArrayList<Reparacion>();
		try{
			for (Reparacion reparacion : this.reparaciones) {
				if(reparacion.getCliente().getDni().equals(c1.getDni())) {
					reparacionConCliente.add(reparacion);
				}
			}
		}catch(Exception e) {
			System.out.println("No existe ninguna Reparacion que posea ese cliente.");
		}
		return reparacionConCliente;
	}
	
	
	/**
	 * EL MÉTODO SIRVE PARA BUSCAR UNA REPARACIÓN POR VEHÍCULO
	 * @param v1 OBJETO VEHICULO
	 * @return DEVUELVE UN ARRAYLIST DE TIPO REPARACION CON LAS REPARACIONES QUE CONTENGA EL VEHICULO QUE LE HEMOS PASADO
	 */
	public ArrayList<Reparacion> buscarReparacionPorVehiculo(Vehiculo v1) {
		ArrayList<Reparacion> reparacionConVehiculo = new ArrayList<Reparacion>();
		try{
			for (Reparacion reparacion : this.reparaciones) {
				if(reparacion.getVehiculo().getMatricula().equals(v1.getMatricula())) {
					reparacionConVehiculo.add(reparacion);
				}
			}
		}catch(Exception e) {
			System.out.println("No existe ninguna Reparacion que posea ese vehículo.");
		}
		return reparacionConVehiculo;
	}
	
	
	/**
	 * EL MÉTODO SIRVE PARA BUSCAR UNA REPARACIÓN POR FECHA
	 * @param fecha STRING
	 * @return DEVUELVE UN ARRAYLIST DE TIPO REPARACION CON LAS REPARACIONES CON LA FECHA QUE LE HAYAMOS PASADO
	 */
	public ArrayList<Reparacion> buscarReparacionPorFecha(String fecha) {
		ArrayList<Reparacion> reparacionConFecha = new ArrayList<Reparacion>();
		try{
			for (Reparacion reparacion : this.reparaciones) {
				if(reparacion.getFecha().equals(fecha)) {
					reparacionConFecha.add(reparacion);
				}
			}
		}catch(Exception e) {
			System.out.println("No existe ninguna Reparacion que posea esa fecha.");
		}
		return reparacionConFecha;
	}
	
	
}
