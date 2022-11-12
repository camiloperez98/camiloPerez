package herencia01;

public class Estudiante extends Persona {

   protected int estado;

    public Estudiante(){
    }

    public Estudiante(String nombre, String direccion, String numeroTelefono, String correoElectrico, int estado) {
        super(nombre, direccion, numeroTelefono, correoElectrico);
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if (estado>4){
            this.estado=4;
        }
        else this.estado=estado;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Estado: "+this.estado;
    }
}
