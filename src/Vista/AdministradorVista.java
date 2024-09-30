package Vista;

import Controlador.AdministradorControl;
import Modelo.Barberia;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministradorVista extends JFrame {
    private AdministradorControl controlador;

    public AdministradorVista(AdministradorControl controlador) {
        this.controlador = controlador;
        initUI();
        createImage(); // Método para cargar la imagen
    }

    private void initUI() {
        setTitle("Administrador - Menú");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel jl = new JLabel("BIENVENIDO ADMINISTRADOR      ");
        jl.setBounds(0, 10, 600, 20);
        jl.setOpaque(true);
        jl.setForeground(Color.white);
        jl.setBackground(Color.red);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(jl);

        // Crear botones para las opciones del menú
        JButton btnCrearCliente = new JButton("Crear Cliente");
        btnCrearCliente.setBounds(350, 40, 200, 30);
        btnCrearCliente.setBackground(Color.white);
        add(btnCrearCliente);

        JButton btnEliminarCliente = new JButton("Eliminar Cliente");
        btnEliminarCliente.setBounds(350, 80, 200, 30);
        btnEliminarCliente.setBackground(Color.white);
        add(btnEliminarCliente);

        JButton btnCrearEmpleado = new JButton("Crear Empleado");
        btnCrearEmpleado.setBounds(350, 130, 200, 30);
        btnCrearEmpleado.setBackground(Color.white);
        add(btnCrearEmpleado);

        JButton btnEliminarEmpleado = new JButton("Eliminar Empleado");
        btnEliminarEmpleado.setBounds(350, 170, 200, 30);
        btnEliminarEmpleado.setBackground(Color.white);
        add(btnEliminarEmpleado);

        JButton btnVerClientes = new JButton("Ver Clientes");
        btnVerClientes.setBounds(350, 220, 200, 30);
        btnVerClientes.setBackground(Color.white);
        btnVerClientes.setForeground(Color.red);
        add(btnVerClientes);

        JButton btnVerEmpleados = new JButton("Ver Empleados");
        btnVerEmpleados.setBounds(350, 260, 200, 30);
        btnVerEmpleados.setBackground(Color.white);
        btnVerEmpleados.setForeground(Color.red);
        add(btnVerEmpleados);

        // Crear botón "Volver al Menú de Inicio"
        JButton btnVolverInicio = new JButton("Volver al Menú de Inicio");
        btnVolverInicio.setBounds(350, 300, 200, 30);  // Posiciona el botón a la izquierda
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

        btnEliminarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.eliminarCliente();
            }
        });

        btnCrearEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.crearEmpleado();
            }
        });

        btnEliminarEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.eliminarEmpleado();
            }
        });

        btnVerClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.verListadoClientes();
            }
        });

        btnVerEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.verListadoEmpleados();
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

    // Método para crear y añadir la imagen al frame
    private void createImage() {
        // Cargar la imagen desde la carpeta de recursos
        ImageIcon imgOriginal = new ImageIcon(getClass().getResource("/imagenes/clika.png"));
        // Escalar la imagen a un tamaño adecuado
        ImageIcon imgEscalada = new ImageIcon(
            imgOriginal.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH)
        );

        JLabel jlImagen = new JLabel(imgEscalada); // Crear JLabel con la imagen
        jlImagen.setBounds(0, 30, 300, 350); // Ubicar la imagen a la derecha
        add(jlImagen); // Añadir la imagen al JFrame
    }

    // Método para volver al menú de inicio
    private void volverMenuInicio() {
        dispose(); // Cerrar la ventana actual
        new MenuInicioVista(); // Abrir la ventana de inicio
    }

    public static void main(String[] args) {
        Barberia barberia = new Barberia();
        AdministradorControl adminControl = new AdministradorControl(barberia);
        new AdministradorVista(adminControl); // Inicia la ventana gráfica de administrador
    }
}
