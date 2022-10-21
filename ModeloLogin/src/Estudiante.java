import java.util.Date;

public class Estudiante extends Usuario {
    String codigo;

    public Estudiante(){

    }

    public Estudiante(String nombre, String primerApellido, String segundoApellido, String CI, String fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contraseña, String codigo) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direccion, celular, telefono, email, usuario, contraseña);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                '}';
    }
}
