import java.util.Date;

public class Usuario extends Persona{
    String usuario;
    String contraseña;
    public Usuario(){

    }

    public Usuario(String nombre, String primerApellido, String segundoApellido, String CI, String fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contraseña) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direccion, celular, telefono, email);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
}
