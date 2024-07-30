//Luis Pedro Figueroa - 24087 26/07/2024

public class Teatro {
    private String Nombre;
    private int CapacidadTotal;
    private Localidad localidadDiamante;
    private Localidad localidadOro;
    private Localidad localidadPlata;

    public Teatro() {
        this.Nombre = "Teatro Lux";
        this.CapacidadTotal = 150;
        this.localidadDiamante = new Localidad("Localidad Diamante", 50, 1000);
        this.localidadOro = new Localidad("Localidad Oro", 50, 600);
        this.localidadPlata = new Localidad("Localidad Plata", 50, 300);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCapacidadTotal() {
        return CapacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        CapacidadTotal = capacidadTotal;
    }

    public Localidad getLocalidadDiamante() {
        return localidadDiamante;
    }

    public void setLocalidadDiamante(Localidad localidadDiamante) {
        this.localidadDiamante = localidadDiamante;
    }

    public Localidad getLocalidadOro() {
        return localidadOro;
    }

    public void setLocalidadOro(Localidad localidadOro) {
        this.localidadOro = localidadOro;
    }

    public Localidad getLocalidadPlata() {
        return localidadPlata;
    }

    public void setLocalidadPlata(Localidad localidadPlata) {
        this.localidadPlata = localidadPlata;
    }

    public void venderBoletos(Localidad localidad, int cantidadBoletos, double presupuestoComprador) {
        if (localidad.verificarDisponibilidad(cantidadBoletos)) {
            double costoTotal = localidad.getPrecio() * cantidadBoletos;
            if (costoTotal <= presupuestoComprador) {
                localidad.venderEntradas(cantidadBoletos);
                System.out.println("Venta realizada. Compraste " + cantidadBoletos + " boletos en la localidad " + localidad.getNombreLocalidad());
            } else {
                System.out.println("No hay suficiente dinero para comprar esa cantidad de boletos en la localidad " + localidad.getNombreLocalidad());
            }
        } else {
            System.out.println("No hay suficiente lugar en esa localidad.");
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("Disponibilidad de boletos:");
        System.out.println("Localidad Diamante: " + (localidadDiamante.getCapacidad() - localidadDiamante.getEntradasVendidas()) + " disponibles");
        System.out.println("Localidad Oro: " + (localidadOro.getCapacidad() - localidadOro.getEntradasVendidas()) + " disponibles");
        System.out.println("Localidad Plata: " + (localidadPlata.getCapacidad() - localidadPlata.getEntradasVendidas()) + " disponibles");
    }

    public void mostrarGanancias() {
        double totalGanancias = (localidadDiamante.getEntradasVendidas() * localidadDiamante.getPrecio()) +
                                (localidadOro.getEntradasVendidas() * localidadOro.getPrecio()) +
                                (localidadPlata.getEntradasVendidas() * localidadPlata.getPrecio());
        System.out.println("Total de ganancias: Q" + totalGanancias);
    }
}
