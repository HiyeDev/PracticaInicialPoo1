public class CuentaExpansion extends Cuenta{
    private double minimoIngresoMensual;

    public CuentaExpansion(Persona titular, double minimoIngresoMensual) {
        super(titular);
        this.minimoIngresoMensual = minimoIngresoMensual;
    }

    public CuentaExpansion(Persona titular, double cantidad, double minimoIngresoMensual) {
        super(titular, cantidad);
        this.minimoIngresoMensual = minimoIngresoMensual;
    }

    public void transferencia(String numeroCuenta, double cantidad) {
        if (cantidad > 0) {
            System.out.println("Se ingreso en " + numeroCuenta + " la cantidad " + cantidad);
            this.retirar(cantidad);
        }
    }


    //SETTERS
    public void setMinimoIngresoMensual(double minimoIngresoMensual) {
        this.minimoIngresoMensual = minimoIngresoMensual;
    }

    //GETTERS
    public double getMinimoIngresoMensual() {
        return minimoIngresoMensual;
    }
}
