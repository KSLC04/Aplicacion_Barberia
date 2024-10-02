/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package Modelo;

import Modelo.CrearEmpleadoModelo;
import Vista.AdministradorVista;
import Vista.CrearEmpleadoVista;
import aplicacion_barberia.Cliente;
import aplicacion_barberia.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 * La clase Barberia gestiona la información de los clientes y empleados de una barbería.
 * Proporciona métodos para agregar, eliminar y listar clientes y empleados.
 */

public class Barberia {
    public CrearEmpleadoModelo crearEmpleadoM;
    public AdministradorVista adminVista;
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados; 
    
    /**
     * Constructor de la clase Barberia. Inicializa las listas de clientes y empleados.
     */

    public Barberia() {
        this.adminVista = adminVista;
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
    }
   
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    /**
     * Crea un nuevo cliente solicitando información al usuario.
     * Muestra un mensaje de confirmación al crear el cliente.
     */
    
    public void crearCliente() {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre();
        nuevoCliente.setTelefono();
        agregarCliente(nuevoCliente); // Agrega el cliente a la lista de la barbería
        JOptionPane.showMessageDialog(null, "Cliente creado: " + nuevoCliente.getNombre());
    }
    
    
    public boolean eliminarCliente(String telefono) {
        for (Cliente cliente : clientes) {
            if (cliente.getTelefono().equals(telefono)) {
                clientes.remove(cliente);
                return true;
            }
        }
        return false;
    }
    
    public void eliminarCliente() {
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente a eliminar:");
        boolean eliminado = eliminarCliente(telefono);
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Cliente eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
        }
    }

    // Métodos para manejar empleados
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
      
    /**
     * Crea un nuevo empleado mostrando la ventana de creación de empleados.
     */
    
    public void crearEmpleado() {               
        CrearEmpleadoVista crearEmpleadoVista = new CrearEmpleadoVista(null);
        crearEmpleadoVista.setVisible(true);
    }

    public boolean eliminarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                empleados.remove(empleado);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Solicita al usuario el nombre de un empleado y lo elimina de la lista.
     */
    
    public void eliminarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado a eliminar:");
        boolean eliminado = eliminarEmpleado(nombre);
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Empleado eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
        }
    }
    
    /**
     * Muestra un listado de todos los clientes registrados en la barbería.
     */
    
      public void getClientes() {
        StringBuilder listadoClientes = new StringBuilder(); // Usamos StringBuilder para construir la cadena
        listadoClientes.append("Lista de Clientes:\n"); // Encabezado

        // Recorremos la lista de clientes
        for (Cliente cliente : clientes) {
            listadoClientes.append(cliente.toString()).append("\n"); // Agregamos cada cliente a la cadena
        }

        // Mostramos el resultado en un JOptionPane
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
        } else {
            JOptionPane.showMessageDialog(null, listadoClientes.toString());
        }
    }
  
    public void getEmpleados() { 
        CrearEmpleadoModelo modelo = new CrearEmpleadoModelo(null);
        modelo.consultarEmpleados();
    
    }   
}

