package Cliente;
import java.util.ArrayList;

public class GestionarCliente {
	/*Insertar Cliente
	◦ Buscar Cliente
	▪ Por DNI
	▪ Por nombre y apellidos
	◦ Modificar Cliente
	◦ Borrar Cliente */
	
	     ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	     
		/**
		 * Método para insertar cliente
		 * @param cliente
		 */
	    public void insertarCliente(Cliente cliente) {
	        clientes.add(cliente);
	        System.out.println("Se ha insertado correctamente");
	    }
	    
		/**
		 * Método para buscar Cliente por el dni
		 * @param dni
		 * @return
		 */
	    public Cliente buscarClientePorDni(String dni) {
	        for (Cliente cliente : clientes) {
	            if (cliente.getDni().equals(dni)) {
	                return cliente;
	            }
	        }
	        return null; // Si no se encuentra el cliente
	    }
	    
		/**
		 * Método para buscar cliente por nombre y apellidos
		 * @param nombre
		 * @param apellidos
		 * @return
		 */
	    public ArrayList<Cliente> buscarClientePorNombreApellidos(String nombre, String apellidos) {
	        ArrayList<Cliente> clientesEncontrados = new ArrayList<>();
	        for (Cliente cliente : clientes) {
	            if (cliente.getNombre().equalsIgnoreCase(nombre) && cliente.getApellidos().equalsIgnoreCase(apellidos)) {
	                clientesEncontrados.add(cliente);
	            }
	        }
	        return clientesEncontrados;
	    }
	    
		/**
		 * Método para modificar cliente 
		 * @param cliente
		 */
	    public void modificarCliente(Cliente cliente) {
	        int index = clientes.indexOf(cliente);
	        if (index != -1) {
	            clientes.set(index, cliente);
	        }
	    }
	    

		/**
		 * Método para modificar cliente 
		 * @param cliente
		 */
	    public void modificarCliente(int indice, String dni, String nombre, String apellidos, int edad) {
	    	Cliente clienteModificado = clientes.get(indice);
	    	clienteModificado.setDni(dni);
	    	clienteModificado.setNombre(nombre);
	    	clienteModificado.setApellidos(apellidos);
	    	clienteModificado.setEdad(edad);
	    	
	    	clientes.set(indice, clienteModificado);
	    	System.out.println("Cliente modificado.");
	    }
	    
	    
		/**
		 * Método para borrar Cliente
		 * @param cliente
		 */
	    public void borrarCliente(Cliente cliente) {
	        clientes.remove(cliente);
	    }
}