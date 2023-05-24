package Cliente;
import java.util.ArrayList;
import java.util.Scanner;

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
	    public void insertarCliente(Cliente c1) {
	        clientes.add(c1);
	        System.out.println("Se ha insertado correctamente.");
	    }
	    
		/**
		 * Método para buscar Cliente por el dni
		 * @param dni
		 * @return
		 */
	    public Cliente buscarClientePorDni(String dni) {
	        for (Cliente cliente : clientes) {
	            if (cliente.getDni().equals(dni)) {
	            	System.out.println(cliente.toString());
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
	            	System.out.println(cliente.toString());
	                clientesEncontrados.add(cliente);
	            }
	        }
	        return clientesEncontrados;
	    }
	    

		/**
		 * Método para modificar cliente 
		 * @param cliente
		 */
	    public void modificarCliente(int indice, Cliente c1) {
	    	Cliente clienteModificado = clientes.get(indice);
	    	clienteModificado.setDni(c1.getDni());
	    	clienteModificado.setNombre(c1.getNombre());
	    	clienteModificado.setApellidos(c1.getApellidos());
	    	clienteModificado.setEdad(c1.getEdad());
	    	
	    	clientes.set(indice, clienteModificado);
	    	System.out.println("Cliente modificado.");
	    }
	    
	    
		/**
		 * Método para borrar Cliente
		 * @param cliente
		 */
	    public void borrarCliente(Cliente cliente) {
	    	System.out.println("Cliente borrado.");
	        clientes.remove(cliente);
	    }
	    
	    
	    /**
	     * Método para obtener un cliente por teclado
	     * @return cliente
	     */
	    public Cliente pedirClientePorTeclado() {
	    	Scanner scan1 = new Scanner(System.in);
	    	
	    	System.out.println("Introduce el dni del nuevo cliente:");
	    	String dni1 = scan1.nextLine();
	    	System.out.println("Introduce el nombre del nuevo cliente:");
	    	String nombre1 = scan1.nextLine();
	    	System.out.println("Introduce los apellidos del nuevo cliente:");
	    	String apellidos1 = scan1.nextLine();
	    	System.out.println("Introduce la edad del nuevo cliente:");
	    	int edad1 = Integer.parseInt(scan1.nextLine());
	    	
	    	Cliente c1 = new Cliente(dni1, nombre1, apellidos1, edad1);
	    	return c1;
	    }
}