package Cliente;

import java.util.ArrayList;

public class GestionarCliente {
	/*Insertar Cliente
	◦ Buscar Cliente
	▪ Por DNI
	▪ Por nombre y apellidos
	◦ Modificar Cliente
	◦ Borrar Cliente */
	
	public ArrayList<Cliente> insertarCliente(Cliente c){
		ArrayList<Cliente> insertar = new ArrayList<Cliente>();
		insertar.add(c);
		return insertar;
	}
	
	/*public Cliente buscarClienteDni(ArrayList a, String dni) {
		if(a.contains(dni)){
			Cliente c = a.get(a.indexOf(dni));
			return c;
		} else {
			System.out.println("El cliente no se ha encontrado");
		}
	}*/

}
