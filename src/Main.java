//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona titularCuenta = new Persona("Fran", "Garcia", 19);
        Cuenta cuentaTest = new Cuenta(titularCuenta);
        System.out.println(cuentaTest.mostrar());
        cuentaTest.ingresar(20.80);
        System.out.println(cuentaTest.getCantidad());
        cuentaTest.retirar(50);
        System.out.println(cuentaTest.getCantidad());

        Persona titularCuentaExpansion = new Persona("Alejandro", "Dominguez", "Santos", 26);
        CuentaExpansion cuentaExpansionTest = new CuentaExpansion(titularCuentaExpansion, 200,  1080);
        cuentaExpansionTest.transferencia("ES01 2504 6691 20 1054223099", 60.30);
        System.out.println(cuentaExpansionTest.getCantidad());

        Persona titularCuentaPersonal = new Persona("Laura", "Taronger", 36);
        CuentaPersonal cuentaPersonalTest = new CuentaPersonal(titularCuentaPersonal, 23);
        cuentaPersonalTest.transferencia("ES01 2504 6691 20 1054223099", 20);
        System.out.println(cuentaPersonalTest.getCantidad());

        Persona titularMayor = new Persona("Gabriela", "Jimenez", 21);
        CuentaJoven cuentaJovenMayorTest = new CuentaJoven(titularMayor, 500, 3);
        cuentaJovenMayorTest.retirar(100);
        System.out.println(cuentaJovenMayorTest.getCantidad());

        Persona titularMenor = new Persona("Lucas", "Moreno", "Gil", 17);
        CuentaJoven cuentaJovenMenorTest = new CuentaJoven(titularMenor, 2000, 3);
        cuentaJovenMenorTest.retirar(0.01);
        System.out.println(cuentaJovenMenorTest.getCantidad());
    }
}