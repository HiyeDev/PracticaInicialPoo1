public class CuentaPersonal extends Cuenta{


    public CuentaPersonal(Persona titular) {
        super(titular);
    }

    public CuentaPersonal(Persona titular, double cantidad) {
        super(titular, cantidad);
    }

    public void transferencia(String numeroCuenta, double cantidad) {
        if (cantidad > 0) {
            System.out.println("Se ingreso en " + numeroCuenta + " la cantidad " + cantidad);
            this.retirar(cantidad + 3);
        }
    }
}
