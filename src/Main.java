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

            }
        } while (opcionCliente != 0);
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
