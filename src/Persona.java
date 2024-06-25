public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    public Persona (String nombre, String apellido1, String apellido2, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public Persona (String nombre, String apellido1, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = null;
        this.edad = edad;
    }

    @Override
    public String toString() {
        String s = "";
        s = nombre + " " + apellido1;
        if (getApellido2() != null) {
            s += " " + apellido2;
        }
        return s;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //GETTERS
    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
