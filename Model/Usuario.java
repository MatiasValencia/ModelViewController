package Model;

public class Usuario {
    private String id;
    private String nombre;
    private String correo;
    private String password;

    public Usuario() {} // Constructor vacío
    public Usuario(String id, String nombre, String correo, String password) { // Constructor
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }
    // Getters
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String getPassword() {
        return password;
    }
    // Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // Método toString
    @Override
    public String toString() {
        return id + "," + nombre + "," + correo + "," + password;
    }
}
