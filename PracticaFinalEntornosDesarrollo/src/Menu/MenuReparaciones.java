package Menu;

import java.util.Scanner;

import Cliente.Cliente;
import Cliente.GestionarCliente;
import Reparacion.GestionarReparaciones;
import Vehiculo.GestionarVehiculo;
import Vehiculo.Vehiculo;

public class MenuReparaciones {

	public void mostrarMenuReparaciones() {
		GestionarReparaciones gestionReparacion = new GestionarReparaciones();
		GestionarVehiculo gestionVehiculo = new GestionarVehiculo();
		GestionarCliente gestionCliente = new GestionarCliente();
		
		Scanner scan = new Scanner(System.in);
		int id = -1;
		System.out.println("******* GESTIONAR REPARACIONES *******\n1.- INSERTAR REPARACIÓN\n2.- MODIFICAR REPARACIÓN\n3.- BUSCAR REPARACIÓN POR CLIENTE\n4.- BUSCAR REPARACIÓN POR VEHÍCULO\n5.- BUSCAR REPARACIÓN POR FECHA\n6.- VOLVER AL MENÚ PRINCIPAL\n7.- SALIR");
		
		do {
			try {
				System.out.println("\nELIGE LA ACCIÓN QUE DESEAS REALIZAR:");
				id = Integer.parseInt(scan.nextLine());
				
				switch (id) {
				case 1: {
					Cliente c1 = gestionCliente.pedirClientePorTeclado();
					Vehiculo v1 = gestionVehiculo.pedirVehiculoPorTeclado();
					System.out.println("Introduce la descripción de la reparación:");
					String descripcion = scan.nextLine();
					System.out.println("Introduce la fecha de la reparación:");
					String fecha = scan.nextLine();
					System.out.println("Introduce el tiempo de la reparación:");
					String tiempo = scan.nextLine();
					System.out.println("Introduce el total de la reparación:");
					double totalReparacion = Double.parseDouble(scan.nextLine());
					gestionReparacion.insertarReparacion(c1, v1, descripcion, fecha, tiempo, totalReparacion);;
					break;
				}
				case 2: {
					System.out.println("Introduce el índice de la reparación a modificar:");
					int indice = Integer.parseInt(scan.nextLine());
					Cliente c1 = gestionCliente.pedirClientePorTeclado();
					Vehiculo v1 = gestionVehiculo.pedirVehiculoPorTeclado();
					System.out.println("Introduce la descripción de la reparación:");
					String descripcion = scan.nextLine();
					System.out.println("Introduce la fecha de la reparación:");
					String fecha = scan.nextLine();
					System.out.println("Introduce el tiempo de la reparación:");
					String tiempo = scan.nextLine();
					System.out.println("Introduce el total de la reparación:");
					double totalReparacion = Double.parseDouble(scan.nextLine());
					gestionReparacion.modificarReparacion(indice, c1, v1, descripcion, fecha, tiempo, totalReparacion);
					break;
				}
				case 3:{
					Cliente c1 = gestionCliente.pedirClientePorTeclado();
					gestionReparacion.buscarReparacionPorCliente(c1);
					break;
				}
				case 4:{
					Vehiculo v1 = gestionVehiculo.pedirVehiculoPorTeclado();
					gestionReparacion.buscarReparacionPorVehiculo(v1);
					break;
				}
				case 5:{
					System.out.println("Introduce la fecha de la reparación:");
					String fecha = scan.nextLine();
					gestionReparacion.buscarReparacionPorFecha(fecha);
					break;
				}
				case 6:{
					MenuPrincipal mp = new MenuPrincipal();
					mp.mostrarMenu();
					break;
				}
				case 7:{
					System.out.println("LA APLICACIÓN VA A CERRARSE.");
					scan.close();
					System.exit(-1);
					break;
				}
				default:
					System.out.println("EL NÚMERO QUE HA PRESIONADO NO FORMA PARTE DEL MENÚ, POR FAVOR INTRODUCE OTRA VEZ EL NÚMERO:");;
				}
			}catch (Exception e) {
				System.out.println("ERROR. " + e);
			}
		}while(id != 7);
	}
	
}
