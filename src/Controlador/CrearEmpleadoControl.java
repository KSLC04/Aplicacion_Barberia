
package Controlador;

import java.awt.event.ActionListener;
import Vista.CrearEmpleadoVista;
import Modelo.CrearEmpleadoModelo;
import Vista.AdministradorVista;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearEmpleadoControl implements ActionListener {
    public CrearEmpleadoVista crearEmpleado;
    public CrearEmpleadoModelo modelo;

    public CrearEmpleadoControl(CrearEmpleadoVista vista) {
        this.crearEmpleado = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(crearEmpleado.jbGuardar)) {
            ArrayList<String> datos = new ArrayList<>();
            datos.add(crearEmpleado.jtNombre.getText());
            datos.add(crearEmpleado.jtTelefono.getText());
            datos.add(crearEmpleado.jtEspecialidad.getText());
            
            modelo = new CrearEmpleadoModelo(this);
            try {
                modelo.guardarEmpleado(datos);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource().equals(crearEmpleado.jbVolver)) {
            crearEmpleado.dispose();
            crearEmpleado.adminVista.setVisible(true);
        }
    }
}
  


