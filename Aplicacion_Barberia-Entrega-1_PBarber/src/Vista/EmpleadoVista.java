/**
 * Programadores:.
 * Nicole Roldan (2355039)
 * Kevin Lopez (2355192)
 */

package Vista;

import Controlador.EmpleadoControl;
import Modelo.Barberia;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * La clase EmpleadoVista representa la interfaz gráfica del menú para empleados en
 * la aplicación de administración de barbería. Permite a los empleados realizar
 * diversas acciones relacionadas con la gestión de clientes y servicios.
 */

public class EmpleadoVista extends JFrame {
    private EmpleadoControl controlador;

    public EmpleadoVista(EmpleadoControl controlador) {
        this.controlador = controlador;
        initUI();
    }

    /**
     * Método para inicializar la interfaz gráfica del menú de empleado.
     */
    
    private void initUI() {
        setTitle("Menú de Empleado");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel jl = new JLabel("    BIENVENIDO EMPLEADO");
        jl.setBounds(0, 10, 400, 20);
        jl.setOpaque(true);
        jl.setForeground(Color.white);
        jl.setBackground(Color.red);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(jl);

        // Botones para las opciones del menú
        JButton btnCrearCliente = new JButton("Crear Cliente");
        btnCrearCliente.setBounds(80, 45, 250, 30);
        btnCrearCliente.setBackground(Color.white);
        add(btnCrearCliente);
        
        JButton btnServiciosDispo = new JButton("Servicios disponibles (proximamente)");
        btnServiciosDispo.setBounds(80, 90, 250, 30);
        btnServiciosDispo.setBackground(Color.white);
        add(btnServiciosDispo);
        
        JButton btnRegistrarServicio = new JButton("Registrar servicio (proximamente)");
        btnRegistrarServicio.setBounds(80, 135, 250, 30);
        btnRegistrarServicio.setBackground(Color.white);
        add(btnRegistrarServicio);
        
        JButton btnHistorialServicios = new JButton("Historial de servicios (proximamente)");
        btnHistorialServicios.setBounds(80, 180, 250, 30);
        btnHistorialServicios.setBackground(Color.white);
        add(btnHistorialServicios);

        // Crear botón "Volver al Menú de Inicio"
        JButton btnVolverInicio = new JButton("Volver al Menú de Inicio");
        btnVolverInicio.setBounds(80, 225, 250, 30);  // Posiciona el botón en la parte inferior
        btnVolverInicio.setBackground(Color.white);
        btnVolverInicio.setForeground(Color.red);
        add(btnVolverInicio);

        // Añadir ActionListeners para cada botón
        btnCrearCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.crearCliente();
            }
        });

        // Añadir ActionListener al botón "Volver al Menú de Inicio"
        btnVolverInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverMenuInicio();
            }
        });

        setVisible(true);
    }

    // Método para volver al menú de inicio
    private void volverMenuInicio() {
        dispose(); // Cerrar la ventana actual
        new MenuInicioVista(); // Abrir la ventana de inicio
    }

    public static void main(String[] args) {
        Barberia barberia = new Barberia();
        EmpleadoControl empleadoControl = new EmpleadoControl(barberia);
        new EmpleadoVista(empleadoControl); // Inicia la ventana gráfica de empleado
    }
}
