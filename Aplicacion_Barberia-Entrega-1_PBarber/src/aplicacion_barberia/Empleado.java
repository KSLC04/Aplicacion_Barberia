/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package aplicacion_barberia;

import Modelo.Barberia;
import javax.swing.JOptionPane;

/**
 * La clase Empleado representa a un empleado en el sistema de administración de barbería.
 * Hereda de la clase Persona, lo que permite que un Empleado tenga características comunes
 * a todas las personas, como nombre y teléfono, además de una especialidad específica.
 */

public class Empleado extends Persona {
    private String especialidad; // Atributo para la especialidad del empleado

     /**
     * Constructor por defecto de la clase Empleado.
     * Inicializa el nombre, teléfono y especialidad con valores por defecto.
     */
    
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

     /**
     * Establece la especialidad mediante un cuadro de diálogo.
     * Se solicita al usuario que ingrese la especialidad del empleado.
     */ 
    public void setEspecialidad() {
        this.especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del empleado");
    }

     /**
     * Crea un nuevo cliente.
     * Pide al usuario el nombre y teléfono del cliente y lo agrega a la barbería.
     */
    public void crearCliente(Barberia barberia) {
        Cliente nuevoCliente = new Cliente(); // Crea un nuevo cliente
        nuevoCliente.setNombre(); // Pide el nombre
        nuevoCliente.setTelefono(); // Pide el teléfono
        barberia.agregarCliente(nuevoCliente); // Agrega el cliente a la lista de la barbería
        JOptionPane.showMessageDialog(null, "Cliente creado: " + nuevoCliente.getNombre());
    }

     /**
     * Elimina un cliente.
     * Pide al usuario el nombre del cliente a eliminar y lo elimina de la barbería.
     */
    public void eliminarCliente(Barberia barberia) {
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente a eliminar:");
        boolean eliminado = barberia.eliminarCliente(nombreCliente); // Elimina el cliente usando el método de la barbería
        
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Cliente eliminado: " + nombreCliente);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
        }
    }

      /**
     * Devuelve una representación en forma de cadena del Empleado.
     */
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Teléfono: " + getTelefono() + ", Especialidad: " + especialidad;
    }

}