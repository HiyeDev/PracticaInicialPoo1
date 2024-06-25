public class Cuenta {
    private Persona titular;
    private double cantidad;

    //CONSTRUCTORES
    public Cuenta (Persona titular) {
        this.titular = titular;
        this.cantidad = 0.00;
    }

    public Cuenta (Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // MUESTRA LOS DATOS DE LA CUENTA, DEVOLVIENDO UN STRING FORMATEADO CON UN SALTO DE LINEA PARA SU MEJOR VISUALIZACIÓN.
    public String mostrar() {
        return "TITULAR DE LA CUENTA: " + titular.toString() + "\n" + "CANTIDAD: " + cantidad;
    }

    // UTILIZA EL SETTER PRIVADO PARA HACER EL INGRESO, CALCULANDO LA CANTIDAD TOTAL
    // LUEGO ASIGNANDO ESA NUEVA CANTIDAD CON EL SETTER
    public void ingresar(double ingreso) {
        if (ingreso > 0.00) {
            double nuevaCantidad = getCantidad() + ingreso;
            setCantidad(nuevaCantidad);
        }
    }

    public void retirar(double retiro) {
        double nuevaCantidad = getCantidad() - retiro;
        setCantidad(nuevaCantidad);
    }


    //SETTERS
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    private void setTitular(Persona titular) {
        this.titular = titular;
    }

    //GETTERS
    public Persona getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }
}
