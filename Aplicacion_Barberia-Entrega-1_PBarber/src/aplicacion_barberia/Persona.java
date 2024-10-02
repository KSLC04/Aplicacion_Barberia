/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package aplicacion_barberia;

import javax.swing.JOptionPane;

/**
 * La clase Persona representa a una persona en el sistema de administración de barbería.
 * Contiene información básica como el nombre y el teléfono de la persona.
 */

public class Persona {
    String nombre , telefono;
    
     /**
     * Constructor por defecto de la clase Persona.
     * Inicializa el nombre y el teléfono con valores por defecto.
     */
    public Persona() {
        nombre = "-";
        telefono = "-";
    }

    // Constructor con parámetros
    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public void setNombre(String nom){
    nombre = nom;
    }
    
    public void setNombre(){
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setTelefono(String tel){
    telefono = tel;
    }
    
    public void setTelefono(){
        telefono = JOptionPane.showInputDialog("Ingrese su telefono");
    }
    
    public String getTelefono(){
        return telefono;
    }
    
}