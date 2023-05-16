package Menu;

import java.util.Scanner;

import Cliente.GestionarCliente;
import Reparacion.GestionarReparaciones;
import Vehiculo.GestionarVehiculo;

public class Menu {

	Scanner scan = new Scanner(System.in);
	
	GestionarVehiculo gestionVehiculo = new GestionarVehiculo();
	GestionarCliente gestionCliente = new GestionarCliente();
	GestionarReparaciones gestionReparacion = new GestionarReparaciones();
	
	public void mostrarMenu() {
		int id = -1;
		System.out.println("******* PRÁCTICA FINAL ENTORNOS DE DESARROLLO *******\n1.- GESTIONAR CLIENTES\n2.- GESTIONAR VEHÍCULOS\n3.- GESTIONAR REPARACIONES\n4.- SALIR");
		
		do {
			try {
				System.out.println("\nELIGE LA ACCIÓN QUE DESEAS REALIZAR:");
				id = Integer.parseInt(scan.nextLine());
				
				switch (id) {
				case 1: {
					
					break;
				}
				case 2: {
					
					break;
				}
				case 3:{
					
					break;
				}
				case 4:{
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
		}while(id != 8);
		
		scan.close();
	}
}
