public class Venta {
    private String nombreComprador;
    private String mailComprador;
    private double presupuestoComprador;
    private int cantidadBoletos;
    private Teatro teatro;

    public Venta(String nombreComprador, String mailComprador, double presupuestoComprador, int cantidadBoletos, Teatro teatro) {
        this.nombreComprador = nombreComprador;
        this.mailComprador = mailComprador;
        this.presupuestoComprador = presupuestoComprador;
        this.cantidadBoletos = cantidadBoletos;
        this.teatro = teatro;
    }

    public void procesarVenta(String nombreLocalidad) {
        Localidad localidad = null;
        if (nombreLocalidad.equalsIgnoreCase("Localidad Diamante")) {
            localidad = teatro.getLocalidadDiamante();
        } else if (nombreLocalidad.equalsIgnoreCase("Localidad Oro")) {
            localidad = teatro.getLocalidadOro();
        } else if (nombreLocalidad.equalsIgnoreCase("Localidad Plata")) {
            localidad = teatro.getLocalidadPlata();
        }
        if (localidad != null) {
            teatro.venderBoletos(localidad, cantidadBoletos, presupuestoComprador);
        } else {
            System.out.println("Esa localidad no existe");
        }
    }
    public String getNombreComprador() {
        return nombreComprador;
    }
    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }
    public String getMailComprador() {
        return mailComprador;
    }
    public void setMailComprador(String mailComprador) {
        this.mailComprador = mailComprador;
    }
    public double getPresupuestoComprador() {
        return presupuestoComprador;
    }
    public void setPresupuestoComprador(double presupuestoComprador) {
        this.presupuestoComprador = presupuestoComprador;
    }
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }
    public Teatro getTeatro() {
        return teatro;
    }
    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }

}
