package herencia02;

public class Computador {

    protected String marca;
    protected String referencia;
    protected double precio;

    public Computador(String marca, String referencia, int precio) {
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
    }

    public String gama() {
        return this.marca=="iphone" || marca=="assus" || marca=="hp"?"Alta gama":"gama media";
    }

     public double valorDescuento(){
        double descuento= this.precio*0.15;
        return this.precio>1000000?this.precio-descuento:this.precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + '\n' +
                "Referencia: " + referencia + '\n' +
                "Precio: " + precio +"\n"+ "Con el decuento su precio es: "+valorDescuento();
    }
}