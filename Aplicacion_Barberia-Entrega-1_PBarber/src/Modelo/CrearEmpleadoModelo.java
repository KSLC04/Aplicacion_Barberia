/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package Modelo;

import Controlador.CrearEmpleadoControl;
import Vista.AdministradorVista;
import Vista.CrearEmpleadoVista;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * La clase CrearEmpleadoModelo se encarga de gestionar la creación y consulta de empleados
 * en la barbería. Proporciona métodos para guardar la información de un nuevo empleado
 * en un archivo y para consultar empleados registrados.
 */

public class CrearEmpleadoModelo {
    public CrearEmpleadoControl crearEmpleadoControl;
    
    public CrearEmpleadoModelo(CrearEmpleadoControl crearEmpleadoControl) {
        this.crearEmpleadoControl = crearEmpleadoControl;
    }

    public void guardarEmpleado(ArrayList<String> datos) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Empleados.csv", true);
            fw.write(datos.get(2) + ";" + datos.get(0) + ";" + datos.get(1) + "\r\n");
            JOptionPane.showMessageDialog(null, "Se guardo con exito el empleado");
            fw.close();
            limpiar();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar en el archivo empleados.csv");
        }
    }
    
    /**
     * Consulta y muestra la lista de empleados registrados en el archivo CSV.
     * Muestra un mensaje si no hay empleados registrados.
     */

    public void consultarEmpleados() {
        StringBuilder resultado = new StringBuilder();
        boolean archivoVacio = true;

        try (BufferedReader br = new BufferedReader(new FileReader("Empleados.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                archivoVacio = false;
                String[] datosEmpleado = linea.split(";");
                resultado.append("Nombre: ").append(datosEmpleado[1]).append("\n")
                         .append("Teléfono: ").append(datosEmpleado[2]).append("\n")
                         .append("Especialidad: ").append(datosEmpleado[0]).append("\n\n");
            }
            // Muestra el resultado
            if (archivoVacio) {
                JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
            } else {
                JOptionPane.showMessageDialog(null, resultado.toString());
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo Empleados.csv");
        }
    }
    
     /**
     * Limpia los campos de entrada de datos del empleado en la vista.
     */
    
    private void limpiar() {
        crearEmpleadoControl.crearEmpleado.jtNombre.setText("");
        crearEmpleadoControl.crearEmpleado.jtTelefono.setText("");
        crearEmpleadoControl.crearEmpleado.jtEspecialidad.setText("");
    }
}



 

