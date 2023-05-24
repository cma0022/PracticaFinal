package Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

import Cliente.Cliente;

/*
 * La clase GestionarVehiculo tiene una lista de vehículos y 
 * tiene métodos para insertar, buscar,
 * modificar y borrar vehículos de la lista.
 */
public class GestionarVehiculo {

	ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	
	// El método insertarVehiculo toma un objeto Vehiculo y lo agrega a la lista.
	public void insertarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
		System.out.println("Se ha insertado el vehículo correctamente");
	}
	/*
	 * El método buscarVehiculoPorMatricula toma una matrícula y busca un vehículo
	 * con esa matrícula en la lista. Devuelve el primer vehículo encontrado con esa
	 * matrícula, o null si no se encuentra ninguno.
	 */

	public Vehiculo buscarVehiculoPorMatricula(String matricula) {
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getMatricula().equals(matricula)) {
				System.out.println(vehiculo.toString());
				return vehiculo;
			}
		}
		return null;
	}

	/**
	 * El método buscarVehiculoPorMarcaModelo toma una marca y un modelo y busca
	 * vehículos con esa marca y modelo en la lista. Devuelve una lista de vehículos
	 * que coinciden con esos criterios de búsqueda.
	 * @param marca
	 * @param modelo
	 * @return
	 */
	public ArrayList<Vehiculo> buscarVehiculoPorMarcaModelo(String marca, String modelo) {
		ArrayList<Vehiculo> vehiculosEncontrados = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getMarca().equals(marca) && vehiculo.getModelo().equals(modelo)) {
				System.out.println(vehiculo.toString());
				vehiculosEncontrados.add(vehiculo);
			}
		}
		return vehiculosEncontrados;
	}

	/**
	 * El método buscarVehiculoPorMarcaModeloAño toma una marca, un modelo y un año
	 * y busca vehículos con esa marca, modelo y año en la lista. Devuelve una lista
	 * de vehículos que coinciden con esos criterios de búsqueda.
	 * 
	 * @param marca
	 * @param modelo
	 * @param año
	 * @return
	 */
	public ArrayList<Vehiculo> buscarVehiculoPorMarcaModeloAño(String marca, String modelo, int año) {
		ArrayList<Vehiculo> vehiculosEncontrados = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getMarca().equals(marca) && vehiculo.getModelo().equals(modelo) && vehiculo.getAño() == año) {
				System.out.println(vehiculo.toString());
				vehiculosEncontrados.add(vehiculo);
			}
		}
		return vehiculosEncontrados;
	}

	/**
	 * El método modificarVehiculo toma un objeto Vehiculo existente y los nuevos
	 * valores de sus atributos y los establece en el vehículo existente.
	 * 
	 * @param vehiculo
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param año
	 * @param color
	 */
	public void modificarVehiculo(int indice, Vehiculo v1) {
		Vehiculo vehiculoModificado = new Vehiculo();
		vehiculoModificado.setMatricula(v1.getMatricula());
		vehiculoModificado.setMarca(v1.getMarca());
		vehiculoModificado.setModelo(v1.getModelo());
		vehiculoModificado.setAño(v1.getAño());
		vehiculoModificado.setColor(v1.getColor());
		
		listaVehiculos.set(indice, v1);
		System.out.println("Vehículo modificado.");
	}
	
	// El método borrarVehiculo elimina un objeto Vehiculo de la lista.
	public void borrarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.remove(vehiculo);
		System.out.println("Vehíoculo borrado.");
	}
	
	public Vehiculo pedirVehiculoPorTeclado() {
    	Scanner scan1 = new Scanner(System.in);
    	
    	System.out.println("Introduce la matrícula del vehículo:");
    	String matricula1 = scan1.nextLine();
    	System.out.println("Introduce la marca del vehículo:");
    	String marca1 = scan1.nextLine();
    	System.out.println("Introduce el modelo del vehículo:");
    	String modelo1 = scan1.nextLine();
    	System.out.println("Introduce el año del vehículo:");
    	int anho1 = Integer.parseInt(scan1.nextLine());
    	System.out.println("Introduce el color del vehículo:");
    	String color1 = scan1.nextLine();
    	
    	Vehiculo v1 = new Vehiculo(matricula1, marca1, modelo1, anho1, color1);
    	return v1;
    }
}
