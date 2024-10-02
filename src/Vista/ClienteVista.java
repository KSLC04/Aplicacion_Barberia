package Vista;

import Controlador.ClienteControl;
import Modelo.Barberia;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ClienteVista extends JFrame {
    private ClienteControl controlador;

    public ClienteVista(ClienteControl controlador) {
        this.controlador = controlador;
        initUI();
    }

    private void initUI() {
        setTitle("Menú de Cliente");
        setSize(400, 315);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel jl = new JLabel("    BIENVENIDO");
        jl.setBounds(0, 10, 400, 20);
        jl.setOpaque(true);
        jl.setForeground(Color.white);
        jl.setBackground(Color.red);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(jl);

        // Crear botones para las opciones del menú
        
        JButton btnServiciosDispo = new JButton("Servicios disponibles (proximamente)");
        btnServiciosDispo.setBounds(75, 45, 250, 30);
        btnServiciosDispo.setBackground(Color.white);
        add(btnServiciosDispo);

        JButton btnDisponibilidadHorario = new JButton("Disponibilidad de horario (proximamente)");
        btnDisponibilidadHorario.setBounds(75, 90, 250, 30);
        btnDisponibilidadHorario.setBackground(Color.white);
        add(btnDisponibilidadHorario);
               
        JButton btnAgendarCita = new JButton("Agendar cita (proximamente)");
        btnAgendarCita.setBounds(75, 135, 250, 30);
        btnAgendarCita.setBackground(Color.white);
        add(btnAgendarCita);

        JButton btnInfo = new JButton("Más información... (proximamente)");
        btnInfo.setBounds(75, 180, 250, 30);  // Posiciona el botón en la parte inferior
        btnInfo.setBackground(Color.white);
        btnInfo.setForeground(Color.red);
        add(btnInfo);

        JButton btnVolverInicio = new JButton("Volver al Menú de Inicio");
        btnVolverInicio.setBounds(75, 225, 250, 30);  // Posiciona el botón en la parte inferior
        btnVolverInicio.setBackground(Color.white);
        btnVolverInicio.setForeground(Color.red);
        add(btnVolverInicio);

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
        ClienteControl clienteControl = new ClienteControl(barberia);
        new ClienteVista(clienteControl); // Inicia la ventana gráfica de empleado
    }
}