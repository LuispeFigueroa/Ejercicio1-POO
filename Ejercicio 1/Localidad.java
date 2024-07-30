public class Localidad {
    private String nombreLocalidad;
    private int capacidad;
    private double precio;
    private int entradasVendidas;

    public Localidad() {
        this.nombreLocalidad = "";
        this.capacidad = 0;
        this.precio = 0;
        this.entradasVendidas = 0;
    }

    public Localidad(String nombreLocalidad, int capacidad, double precio) {
        this.nombreLocalidad = nombreLocalidad;
        this.capacidad = capacidad;
        this.precio = precio;
        this.entradasVendidas = 0;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombre(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    public boolean verificarDisponibilidad(int cantidad) {
        return (this.capacidad - this.entradasVendidas) >= cantidad;
    }

    public void venderEntradas(int cantidad) {
        if (verificarDisponibilidad(cantidad)) {
            this.entradasVendidas += cantidad;
        }
    }
}