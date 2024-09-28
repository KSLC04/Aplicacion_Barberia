/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_barberia;

import javax.swing.*;

public class Administrador extends Persona {
    private Barberia barberia;

    public Administrador(Barberia barberia) {
        super();
        this.barberia = barberia; // Referencia a la barbería
    }

    // Método para crear un nuevo cliente
    public void crearCliente() {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre();
        nuevoCliente.setTelefono();
        barberia.agregarCliente(nuevoCliente); // Agrega el cliente a la lista de la barbería
        JOptionPane.showMessageDialog(null, "Cliente creado: " + nuevoCliente.getNombre());
    }

    // Método para eliminar un cliente
    public void eliminarCliente() {
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente a eliminar:");
        boolean eliminado = barberia.eliminarCliente(telefono);
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Cliente eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
        }
    }

    // Método para crear un nuevo empleado
    public void crearEmpleado() {
        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.setNombre();
        nuevoEmpleado.setTelefono();
        String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del empleado:");
        nuevoEmpleado.setEspecialidad(especialidad);
        
        barberia.agregarEmpleado(nuevoEmpleado); // Agrega el empleado a la lista de la barbería
        JOptionPane.showMessageDialog(null, "Empleado creado: " + nuevoEmpleado.getNombre());
    }

    // Método para eliminar un empleado
    public void eliminarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado a eliminar:");
        boolean eliminado = barberia.eliminarEmpleado(nombre);
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Empleado eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
        }
    }
    
}
