import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teatro teatro = new Teatro(); // El teatro ya tiene valores predeterminados 

        // Creo las variables donde se queda la info del comprador
        Scanner scanner = new Scanner(System.in);

        // El comprador ingresa los datos
        System.out.println("Ingrese su nombre:");
        String nombreComprador = scanner.nextLine();

        System.out.println("Ingrese su email electrónico:");
        String mailComprador = scanner.nextLine();

        System.out.println("Ingrese su presupuesto:");
        double presupuestoComprador = scanner.nextDouble();

        System.out.println("¿Cuántos boletos quiere comprar?: ");
        int cantidadBoletos = scanner.nextInt();

        scanner.nextLine(); // Consumir la línea pendiente

        System.out.println("Seleccione la localidad (Localidad Diamante, Localidad Oro, Localidad Plata):");
        String nombreLocalidad = scanner.nextLine();

        // Ticket de venta
        Venta venta = new Venta(nombreComprador, mailComprador, presupuestoComprador, cantidadBoletos, teatro);

        // Ejecutar la venta
        venta.procesarVenta(nombreLocalidad);

        // Disponibilidad
        System.out.println("Disponibilidad de boletos:");
        teatro.mostrarDisponibilidad();

        // Ganancias
        System.out.println("Total de ganancias:");
        teatro.mostrarGanancias();

        scanner.close();
    }
}