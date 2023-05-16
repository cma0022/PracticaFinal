package Main;

import Cliente.Cliente;
import Cliente.GestionarCliente;
import Reparacion.GestionarReparaciones;
import Reparacion.Reparacion;
import Vehiculo.GestionarVehiculo;
import Vehiculo.Vehiculo;

public class TestPractica {

	public static void main(String[] args) {
		
		GestionarVehiculo gestionVehiculo = new GestionarVehiculo();
		GestionarCliente gestionCliente = new GestionarCliente();
		GestionarReparaciones gestionReparacion = new GestionarReparaciones();
		
		Cliente c1 = new Cliente("21463857U", "Pepe", "García Jurado", 32);
		Vehiculo v1 = new Vehiculo("4324JHF", "Seat", "Ibiza", 2012, "Blanco");
		Reparacion r1 = new Reparacion(c1, v1, "Se ha hecho peazos el coche.", "22/04/2023", "2 semanas", 1500);
		
		gestionVehiculo.insertarVehiculo(v1);
		

	}

}
