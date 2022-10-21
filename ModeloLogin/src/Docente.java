import java.util.Date;

public class Docente extends Usuario {
    int sueldo;
    public Docente(){

    }

    public Docente(String nombre, String primerApellido, String segundoApellido, String CI, String fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contraseña, int sueldo) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direccion, celular, telefono, email, usuario, contraseña);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "sueldo=" + sueldo +
                '}';
    }
}
