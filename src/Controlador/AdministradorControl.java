package Controlador;

import Modelo.Barberia;
import Modelo.CrearEmpleadoModelo;
import Vista.AdministradorVista;
import Vista.CrearEmpleadoVista;
import aplicacion_barberia.Persona;

public class AdministradorControl extends Persona {
    public Barberia barberia;
    public CrearEmpleadoModelo crearEmpleadoM;
    public AdministradorVista adminVista;

    public AdministradorControl(AdministradorVista obj) {
    super();
    this.barberia = new Barberia(); // Inicializamos Barberia
    this.adminVista = obj; // Asegúrate de asignar adminVista
    }
    
    public void ocultarAdminVista() {
    adminVista.setVisible(false); // Oculta la ventana de administrador
    }
    
    public AdministradorControl(Barberia barberia) {
        super();
        this.barberia = barberia; // Referencia a la barbería
    }

    // Método para crear un nuevo cliente
    public void crearCliente() {
        barberia.crearCliente();
    }

    // Método para eliminar un cliente
    public void eliminarCliente() {
        barberia.eliminarCliente();
    }

    // Método para crear un nuevo empleado
    public void crearEmpleado() {
        barberia.crearEmpleado();
    }

    // Método para eliminar un empleado
    public void eliminarEmpleado() {
        barberia.eliminarEmpleado();
    }
    
    // Método para obtener la lista de clientes
    public void verListadoClientes() {
        barberia.getClientes();
    }
    
    // Método para obtener la lista de empleados
    public void verListadoEmpleados() {
        barberia.getEmpleados();
    }

    // Método corregido para devolver la instancia de Barberia
    public Barberia getBarberia() {
        return barberia;
    }
}
