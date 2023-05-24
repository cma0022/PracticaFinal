package Menu;

import java.util.Scanner;

import Vehiculo.GestionarVehiculo;
import Vehiculo.Vehiculo;


public class MenuVehiculos {

	public void mostrarMenuVehiculos() {
		
		GestionarVehiculo gestionVehiculo = new GestionarVehiculo();
		Scanner scan = new Scanner(System.in);
		int id = -1;
		System.out.println("******* GESTIONAR VEHÍCULOS *******\n1.- INSERTAR VEHÍCULO\n2.- BUSCAR VEHÍCULO POR MATRÍCULA\n3.- BUSCAR VEHÍCULO POR MARCA Y MODELO\n4.- BUSCAR VEHÍCULO POR MARCA, MODELO Y AÑO\n5.- MODIFICAR VEHÍCULO\n6.- BORRAR VEHÍCULO\n7.- VOLVER AL MENÚ PRINCIPAL\n8.- SALIR");
		do {
			try {
				System.out.println("\nELIGE LA ACCIÓN QUE DESEAS REALIZAR:");
				id = Integer.parseInt(scan.nextLine());
				
				switch (id) {
				case 1: {
					Vehiculo v1 = gestionVehiculo.pedirVehiculoPorTeclado();
					gestionVehiculo.insertarVehiculo(v1);
					break;
				}
				case 2: {
					System.out.println("Introduce la matrícula:");
					String matricula = scan.nextLine();
					gestionVehiculo.buscarVehiculoPorMatricula(matricula);
					break;
				}
				case 3:{
					System.out.println("Introduce la marca:");
					String marca = scan.nextLine();
					System.out.println("Introduce el modelo:");
					String modelo = scan.nextLine();
					gestionVehiculo.buscarVehiculoPorMarcaModelo(marca, modelo);
					break;
				}
				case 4:{
					Scanner scan2 = new Scanner(System.in);
					System.out.println("Introduce la marca:");
					String marca = scan2.nextLine();
					System.out.println("Introduce el modelo:");
					String modelo = scan2.nextLine();
					System.out.println("Introduce el año:");
					int anho = Integer.parseInt(scan2.nextLine());
					gestionVehiculo.buscarVehiculoPorMarcaModeloAño(marca, modelo, anho);
					break;
				}
				case 5:{
					Scanner scan3 = new Scanner(System.in);
					Vehiculo v1 = gestionVehiculo.pedirVehiculoPorTeclado();
					System.out.println("Introduce el índice del cliente que se quiere modificar:");
					int indice = Integer.parseInt(scan3.nextLine());
					gestionVehiculo.modificarVehiculo(indice, v1);
					break;
				}
				case 6:{
					Vehiculo v1 = gestionVehiculo.pedirVehiculoPorTeclado();
					gestionVehiculo.borrarVehiculo(v1);
					break;
				}
				case 7:{
					MenuPrincipal mp = new MenuPrincipal();
					mp.mostrarMenu();
					break;
				}
				case 8:{
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
	}
}
