/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_barberia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Barberia {
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;

    public Barberia() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
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

    // Métodos para manejar empleados
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
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
        StringBuilder listadoEmpleados = new StringBuilder(); // Usamos StringBuilder para construir la cadena
        listadoEmpleados.append("Lista de Empleados:\n"); // Encabezado

        // Recorremos la lista de clientes
        for (Empleado empleado : empleados) {
            listadoEmpleados.append(empleado.toString()).append("\n"); // Agregamos cada cliente a la cadena
        }

        // Mostramos el resultado en un JOptionPane
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
        } else {
            JOptionPane.showMessageDialog(null, listadoEmpleados.toString());
        }
    }
}
