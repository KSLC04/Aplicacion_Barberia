package aplicacion_barberia;

import javax.swing.JOptionPane;

public class main {
    
    public static void menuAdmin() {
        Barberia barberia = new Barberia();
        Administrador administrador = new Administrador(barberia);

        while (true) {
            String menu = "1. Crear Cliente\n"
                        + "2. Eliminar Cliente\n"
                        + "3. Crear Empleado\n"
                        + "4. Eliminar Empleado\n"
                        + "5. Ver listado de Clientes\n"
                        + "6. Ver listado de empleados\n"
                        + "7. Salir";

            String opcion = JOptionPane.showInputDialog(menu);
            
            switch (opcion) {
                case "1":
                    administrador.crearCliente();
                    break;
                case "2":
                    administrador.eliminarCliente();
                    break;
                case "3":
                    administrador.crearEmpleado();
                    break;
                case "4":
                    administrador.eliminarEmpleado();
                    break;
                case "5":
                    barberia.getClientes();
                    break;
                case "6":
                    barberia.getEmpleados();
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }
    
    public static void main(String[] args) {
        menuAdmin(); // Llama al método menuAdmin directamente
        
        
        //Prueba git
        
        
    }
}
