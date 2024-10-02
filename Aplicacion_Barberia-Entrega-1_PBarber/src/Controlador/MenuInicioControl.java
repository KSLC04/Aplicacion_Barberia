/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package Controlador;

import Vista.MenuInicioVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 * La clase MenuInicioControl se encarga de manejar los eventos
 * relacionados con el menú principal de la aplicación, como
 * la apertura y cierre de la ventana, así como las acciones
 * de los botones.
 */

public class MenuInicioControl implements WindowListener, ActionListener{ // Se encarga de los eventos sobre la ventana, cuando cerramos... maximixamos  

    public MenuInicioVista mp; // Instancia de la vista del menú de inicio
    
    public MenuInicioControl (MenuInicioVista obj){ 
        mp = obj;   // Asigna la instancia de la vista
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        evento_salir();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    /**
     * Maneja el evento de salir de la aplicación. Muestra un
     * diálogo de confirmación al usuario.
     */
    
    private void evento_salir() {
        int respuesta = JOptionPane.showConfirmDialog(mp, "Desea realmente salir de la aplicacion?", //mensaje que muestra la ventana emergente
                "Confirmacion", //mensaje titulo de la ventana emergente (se ve en la barra superior)
                JOptionPane.YES_NO_OPTION); //da a elegir si salir o no
        
        if (respuesta ==JOptionPane.YES_NO_OPTION) //Si le das yes se sale
            System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}