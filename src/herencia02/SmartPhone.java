package herencia02;

public class SmartPhone extends Computador{

    protected String operador;

    public SmartPhone(String marca, String referencia, int precio, String operador) {
        super(marca, referencia, precio);
        this.operador = operador;
    }

    public String regaloOperador(){
        return this.operador=="tigo"?"Te obsequia 30GB":"No aplica obsequio";
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Operador de telefonia: "+this.operador+"\n"+"El operador "+regaloOperador();
    }
}
