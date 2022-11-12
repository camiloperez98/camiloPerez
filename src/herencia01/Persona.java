package herencia01;

public class Persona {

    protected String nombre;
    protected String direccion;
    protected String numeroTelefono;
    protected String correoElectrico;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String numeroTelefono, String correoElectrico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectrico = correoElectrico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectrico() {
        return correoElectrico;
    }

    public void setCorreoElectrico(String correoElectrico) {
        this.correoElectrico = correoElectrico;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Direccion: " + direccion + "\n" +
                "Numero de telefono:" + numeroTelefono + "\n" +
                "Correo electrico: " + correoElectrico + "\n";
    }
}

