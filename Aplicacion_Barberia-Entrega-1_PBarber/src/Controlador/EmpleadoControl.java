/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package Controlador;

/**
 * La clase EmpleadoControl extiende la clase Persona y permite 
 * manejar las operaciones que pueden realizar los empleados 
 * dentro de la barbería.
 */

import Modelo.Barberia;
import aplicacion_barberia.Persona;

public class EmpleadoControl extends Persona {
    private Barberia barberia;

    public EmpleadoControl(Barberia barberia) {
        super(); // Llama al constructor de la clase padre Persona
        this.barberia = barberia; // Referencia a la barbería
    }

    // Método para crear un nuevo cliente
    public void crearCliente() {
        barberia.crearCliente();
    }


    // Método corregido para devolver la instancia de Barberia
    public Barberia getBarberia() {
        return barberia;
    }
}