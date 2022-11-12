package herencia01;

public class Empleado extends Persona {

    protected String departamento;
    protected int salario;
    protected String fechaContratacion;

    public Empleado (){
    }

    public Empleado(String nombre, String direccion, String numeroTelefono, String correoElectrico, String departamento, int salario, String fechaContratacion) {
        super(nombre, direccion, numeroTelefono, correoElectrico);
        this.departamento = departamento;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento!="Contabilidad" || departamento!="Recursos humanos" || departamento!="Compras"){
            this.departamento="Recursos humanos";
        }
        else {
            this.departamento = departamento;
        }
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Departamento: "+this.departamento+"\n"+"Salario: "+this.salario+"\n"+"Fecha de contratacion: "+this.fechaContratacion;
    }
}
