/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package Controlador;

/**
 * Clase que representa el controlador para la creación de empleados.
 * Implementa la interfaz ActionListener para manejar eventos de acción.
 */

import java.awt.event.ActionListener;
import Vista.CrearEmpleadoVista;
import Modelo.CrearEmpleadoModelo;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

public class CrearEmpleadoControl implements ActionListener {
    public CrearEmpleadoVista crearEmpleado;
    public CrearEmpleadoModelo modelo;

    public CrearEmpleadoControl(CrearEmpleadoVista vista) {
        this.crearEmpleado = vista; // Asigna la vista de creación de empleados
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Verifica si el botón de guardar fue presionado
        if (e.getSource().equals(crearEmpleado.jbGuardar)) {
            ArrayList<String> datos = new ArrayList<>();
            datos.add(crearEmpleado.jtNombre.getText());
            datos.add(crearEmpleado.jtTelefono.getText());
            datos.add(crearEmpleado.jtEspecialidad.getText());
            
            modelo = new CrearEmpleadoModelo(this); // Crea una instancia del modelo de creación de empleados
            try {
                modelo.guardarEmpleado(datos);
            } catch (IOException ex) {
                ex.printStackTrace(); // Imprime el stack trace en caso de una excepción
            }
        }
        
        // Verifica si el botón de volver fue presionado
        if (e.getSource().equals(crearEmpleado.jbVolver)) {
            crearEmpleado.dispose();
            crearEmpleado.adminVista.setVisible(true);
        }
    }
}
  


