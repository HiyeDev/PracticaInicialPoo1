public class CuentaJoven extends Cuenta{
    private double bonificacion;

    public CuentaJoven(Persona titular, double bonificacion) {
        super(titular);
        this.bonificacion = bonificacion / 100;
    }

    public CuentaJoven(Persona titular, double cantidad, double bonificacion) {
        super(titular, cantidad);
        this.bonificacion = bonificacion / 100;
    }

    @Override
    public String mostrar() {
        return "Cuenta Joven" + "\n" + "Bonificación " + getBonificacion();
    }

    public boolean esTitularValido() {
        boolean b = false;
        if (this.getTitular().getEdad() >= 18 && this.getTitular().getEdad() <= 25) {
            b = true;
        } else {
            System.out.println("El titular es menor de edad y no podra sacar dinero");
        }
        return b;
    }

    @Override
    public void retirar(double retiro) {
        if (esTitularValido()) {
            super.retirar(retiro);
        }
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }
}
