package Cliente;

import java.util.ArrayList;

public class GestionarCliente {

    private ArrayList<Cliente> clientes;

    public GestionarCliente() {
        clientes = new ArrayList<Cliente>();
    }

    public void insertarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("Cliente añadido correctamente.");
    }

    public void buscarClientePorDni(String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                System.out.println(cliente);
                return;
            }
        }
        System.out.println("No se encontró ningún cliente con ese DNI.");
    }

    public ArrayList<Cliente> buscarClientePorNombreYApellidos(String nombre, String apellidos) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre) && cliente.getApellidos().equals(apellidos)) {
                System.out.println(cliente);
                return;
            }
        }
        System.out.println("No se encontró ningún cliente con ese nombre y apellidos.");
    }

    public void modificarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del cliente que quieres modificar:");
        String dni = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                System.out.println("Introduce el nuevo nombre del cliente (actual: " + cliente.getNombre() + "):");
                String nombre = sc.nextLine();
                System.out.println("Introduce los nuevos apellidos del cliente (actual: " + cliente.getApellidos() + "):");
                String apellidos = sc.nextLine();
                System.out.println("Introduce la nueva edad del cliente (actual: " + cliente.getEdad() + "):");
                int edad = sc.nextInt();
                sc.nextLine(); // Consumimos el salto de línea
                cliente.setNombre(nombre);
                cliente.setApellidos(apellidos);
                cliente.setEdad(edad);
                System.out.println("Cliente modificado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún cliente con ese DNI.");
    }

    public void borrarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI del cliente que quieres borrar:");
        String dni = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                clientes.remove(cliente);
                System.out.println("Cliente borrado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró ningún cliente con ese DNI.");

}
