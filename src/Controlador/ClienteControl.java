package Controlador;

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