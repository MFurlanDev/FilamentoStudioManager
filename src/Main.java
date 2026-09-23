import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionElegida;

        do {
            System.out.println("=============================");
            System.out.println("   FILAMENTOSTUDIO MANAGER");
            System.out.println("          v0.0.1");
            System.out.println("=============================");
            System.out.println("1. Gestionar clientes");
            System.out.println("2. Ver pedidos");
            System.out.println("3. Calcular presupuesto");
            System.out.println("4. Registrar material");
            System.out.println("5. Ver inventario");
            System.out.println("6. Registrar gasto");
            System.out.println("7. Ver resumen económico");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");
            System.out.print("Selecciona una opción (introduce sólo el número): ");

            opcionElegida = Integer.parseInt(scanner.nextLine());

            switch (opcionElegida) {
                case 1:
                    gestionarClientes();
                    break;
            }

        } while (opcionElegida != 0);
    }

    public static void gestionarClientes() {
        Scanner scanner = new Scanner(System.in);

        int opcionCliente;
        do {
            System.out.println("\nFILAMENTOSTUDIO MANAGER");
            System.out.println("-------------------------");
            System.out.println("1. Dar cliente de alta");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcionCliente = Integer.parseInt(scanner.nextLine());

            switch (opcionCliente) {
                case 1:
                    darAltaCliente();
                    break;
                case 2:
                    listarCliente();
                    break;
                case 3:
                    buscarCliente();
                    break;
                case 0:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcionCliente != 0);
    }

    public static void darAltaCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDAR DE ALTA A UN CLIENTE");
        System.out.println("-------------------------");

        System.out.println("Código de cliente");
        int codigoCliente = Integer.parseInt(scanner.nextLine());

        //Comprobar que el codigo no esta repetido
        if (encontrarCliente(codigoCliente) != null) {
            System.out.println("Ya existe un cliente con este código.");
            return;
        }

        System.out.println("Nombre: ");
        String nombreCliente = scanner.nextLine();

        System.out.println("Correo electrónico: ");
        String correoCliente = scanner.nextLine();

        System.out.println("Teléfono: ");
        String telefonoCliente = scanner.nextLine();

        System.out.println("Dirección");
        String direccionCliente = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(
                codigoCliente,
                nombreCliente,
                correoCliente,
                telefonoCliente,
                direccionCliente
        );

        clientes.add(nuevoCliente);

        System.out.println("Cliente registrado correctamente.");
    }

    public static void listarCliente() {
        System.out.println("\nLISTADO DE CLIENTES");
        System.out.println("-------------------------");

        if (clientes.isEmpty()) {
            System.out.println("Todavía no hay clientes registrados.");
            return;
        }

        for (Cliente cliente : clientes) {
            cliente.mostrarCliente();
        }
    }

    public static void buscarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el código del cliente: ");
        int codigoBuscado = Integer.parseInt(scanner.nextLine());

        Cliente clienteEncontrado = encontrarCliente(codigoBuscado);

        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            clienteEncontrado.mostrarCliente();
        } else {
            System.out.println("No existe ningún cliente con ese código.");
        }
    }

    public static Cliente encontrarCliente(int codigoBuscado) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigoCliente() == codigoBuscado) {
                return cliente;
            }
        }

        return null;
    }
}

/*
    Ejemplo cliente

    Cliente cliente1 = new Cliente(
        1,
        "Erkuden",
        "erkuden@email.com",
        "612345678",
        "Pamplona"
    );
    
*/
