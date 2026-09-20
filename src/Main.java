import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("   FILAMENTOSTUDIO MANAGER");
        System.out.println("          v0.0.1");
        System.out.println("=============================");
        System.out.println("1. Registrar pedido");
        System.out.println("2. Ver pedidos");
        System.out.println("3. Calcular presupuesto");
        System.out.println("4. Registrar material");
        System.out.println("5. Ver inventario");
        System.out.println("6. Registrar gasto");
        System.out.println("7. Ver resumen económico");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");


        System.out.print("Selecciona una opción (introduce sólo el número): ");
        Scanner scanner = new Scanner(System.in);
        int opcionElegida = scanner.nextInt();
    }
}
