package Vehiculo;

import java.util.ArrayList;

/*
 * La clase GestionarVehiculo tiene una lista de vehículos y 
 * tiene métodos para insertar, buscar,
 * modificar y borrar vehículos de la lista.
 */
public class GestionarVehiculo {

	private ArrayList<Vehiculo> listaVehiculos;
	
// El método insertarVehiculo toma un objeto Vehiculo y lo agrega a la lista.
	public GestionarVehiculo() {
		listaVehiculos = new ArrayList<Vehiculo>();
	}
/*
 * El método buscarVehiculoPorMatricula toma una matrícula y busca un vehículo 
 * con esa matrícula en la lista. Devuelve el primer vehículo encontrado
 * con esa matrícula, o null si no se encuentra ninguno.
 */
	
	
	public void insertarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
	}

	public Vehiculo buscarVehiculoPorMatricula(String matricula) {
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getMatricula().equals(matricula)) {
				return vehiculo;
			}
		}
		return null;
	}
	

	public ArrayList<Vehiculo> buscarVehiculoPorMarcaModelo(String marca, String modelo) {
		ArrayList<Vehiculo> vehiculosEncontrados = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getMarca().equals(marca) && vehiculo.getModelo().equals(modelo)) {
				vehiculosEncontrados.add(vehiculo);
			}
		}
		return vehiculosEncontrados;
	}

	public ArrayList<Vehiculo> buscarVehiculoPorMarcaModeloAño(String marca, String modelo, int año) {
		ArrayList<Vehiculo> vehiculosEncontrados = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getMarca().equals(marca) && vehiculo.getModelo().equals(modelo) && vehiculo.getAño() == año) {
				vehiculosEncontrados.add(vehiculo);
			}
		}
		return vehiculosEncontrados;
	}

	public void modificarVehiculo(Vehiculo vehiculo, String matricula, String marca, String modelo, int año,
			String color) {
		vehiculo.setMatricula(matricula);
		vehiculo.setMarca(marca);
		vehiculo.setModelo(modelo);
		vehiculo.setAño(año);
		vehiculo.setColor(color);
	}

	public void borrarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.remove(vehiculo);
	}
}
