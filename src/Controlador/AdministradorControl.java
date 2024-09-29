/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Barberia;
import aplicacion_barberia.Persona;

public class AdministradorControl extends Persona {
    private Barberia barberia;

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
    
    // Metodo para obtener la lista de clientes
    public void verListadoClientes(){
        barberia.getClientes();
    }
    
    // Metodo para obtener la lista de Empleados
    public void verListadoEmpleados(){
        barberia.getEmpleados();
    }
    
}
