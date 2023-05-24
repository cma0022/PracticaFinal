package Menu;

import java.util.Scanner;

public class MenuPrincipal {

	Scanner scan = new Scanner(System.in);
	
	public void mostrarMenu() {
		int id = -1;
		System.out.println("******* PRÁCTICA FINAL ENTORNOS DE DESARROLLO *******\n1.- GESTIONAR CLIENTES\n2.- GESTIONAR VEHÍCULOS\n3.- GESTIONAR REPARACIONES\n4.- SALIR");
		
		do {
			try {
				System.out.println("\nELIGE LA ACCIÓN QUE DESEAS REALIZAR:");
				id = Integer.parseInt(scan.nextLine());
				
				switch (id) {
				case 1: {
					MenuClientes mc = new MenuClientes();
					mc.mostrarMenuCliente();
					break;
				}
				case 2: {
					MenuVehiculos mv = new MenuVehiculos();
					mv.mostrarMenuVehiculos();
					break;
				}
				case 3:{
					MenuReparaciones mr = new MenuReparaciones();
					mr.mostrarMenuReparaciones();
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
		}while(id != 4);
		
		scan.close();
	}
}
