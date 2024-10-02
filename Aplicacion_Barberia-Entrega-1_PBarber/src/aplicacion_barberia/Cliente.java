/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package aplicacion_barberia;

/**
 * La clase Cliente representa a un cliente en el sistema de administración de barbería.
 * Hereda de la clase Persona, lo que permite que un Cliente tenga características comunes
 * a todas las personas, como nombre y teléfono.
 */

public class Cliente extends Persona {


    /**
     * Constructor de la clase Cliente.
     * Inicializa un nuevo objeto Cliente llamando al constructor de la clase padre Persona.
     */
    public Cliente() {
        super(); // Llama al constructor de Persona
    }
    
    /**
     * Devuelve una representación en forma de cadena del Cliente.
     */ 
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Teléfono: " + getTelefono(); // Muestra el nombre y el teléfono del cliente
    }
}