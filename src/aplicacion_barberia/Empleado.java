/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_barberia;

import javax.swing.JOptionPane;

public class Empleado extends Persona {
    private String especialidad; // Atributo para la especialidad del empleado

    public Empleado() {
        nombre = "-";
        telefono = "-";
        especialidad = "-";
    }
    // Constructor
    public Empleado(String nombre, String telefono, String especialidad) {
        super(); // Llama al constructor de la clase Persona
        this.especialidad = "-"; // Inicializa la especialidad con un valor por defecto
    }

    // Métodos set y get para especialidad
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    // Método para establecer la especialidad mediante un cuadro de diálogo
    public void setEspecialidad() {
        this.especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del empleado");
    }

    // Método para crear un nuevo cliente
    public void crearCliente(Barberia barberia) {
        Cliente nuevoCliente = new Cliente(); // Crea un nuevo cliente
        nuevoCliente.setNombre(); // Pide el nombre
        nuevoCliente.setTelefono(); // Pide el teléfono
        barberia.agregarCliente(nuevoCliente); // Agrega el cliente a la lista de la barbería
        JOptionPane.showMessageDialog(null, "Cliente creado: " + nuevoCliente.getNombre());
    }

    // Método para eliminar un cliente
    public void eliminarCliente(Barberia barberia) {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente a eliminar:");
        boolean eliminado = barberia.eliminarCliente(nombreCliente); // Elimina el cliente usando el método de la barbería
        
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Cliente eliminado: " + nombreCliente);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
        }
    }

    // Sobrescribiendo el método toString para mostrar la información completa del empleado
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Teléfono: " + getTelefono() + ", Especialidad: " + especialidad;
    }

}
