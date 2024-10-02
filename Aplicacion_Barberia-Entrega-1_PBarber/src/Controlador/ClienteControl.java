/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package Controlador;

/**
 * Clase que representa el controlador para la lógica del cliente.
 * Se encarga de manejar las operaciones relacionadas con los clientes en la barbería.
 */

import Modelo.Barberia;
import aplicacion_barberia.Persona;

public class ClienteControl extends Persona {
    private Barberia barberia;

    public ClienteControl(Barberia barberia) {
        super();
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