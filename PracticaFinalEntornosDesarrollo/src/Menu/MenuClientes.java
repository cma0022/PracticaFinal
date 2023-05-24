package Menu;

import java.util.Scanner;

import Cliente.Cliente;
import Cliente.GestionarCliente;

public class MenuClientes {

	public void mostrarMenuCliente() {
		GestionarCliente gestionCliente = new GestionarCliente();
		Scanner scan = new Scanner(System.in);
		int id = -1;
		System.out.println("******* GESTIONAR CLIENTES *******\n1.- INSERTAR CLIENTE\n2.- BUSCAR CLIENTE POR DNI\n3.- BUSCAR CLIENTE POR NOMBRE Y APELLIDOS\n4.- MODIFICAR CLIENTE\n5.- BORRAR CLIENTE\n6.- VOLVER AL MENÚ PRINCIPAL\n7.- SALIR");
		
		do {
			try {
				System.out.println("\nELIGE LA ACCIÓN QUE DESEAS REALIZAR:");
				id = Integer.parseInt(scan.nextLine());
				
				switch (id) {
				case 1: {
					Cliente c1 = gestionCliente.pedirClientePorTeclado();
					gestionCliente.insertarCliente(c1);
					break;
				}
				case 2: {
					System.out.println("Introduce el dni:");
					String dni = scan.nextLine();
					gestionCliente.buscarClientePorDni(dni);
					break;
				}
				case 3:{
					System.out.println("Introduce el nombre:");
					String nombre = scan.nextLine();
					System.out.println("Introduce los apellidos:");
					String apellidos = scan.nextLine();
					gestionCliente.buscarClientePorNombreApellidos(nombre, apellidos);
					break;
				}
				case 4:{
					Scanner scan2 = new Scanner(System.in);
					Cliente c1 = gestionCliente.pedirClientePorTeclado();
					System.out.println("Introduce el índice del cliente que se quiere modificar:");
					int indice = Integer.parseInt(scan2.nextLine());
					gestionCliente.modificarCliente(indice, c1);
					break;
				}
				case 5:{
					Cliente c1 = gestionCliente.pedirClientePorTeclado();
					gestionCliente.borrarCliente(c1);
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
