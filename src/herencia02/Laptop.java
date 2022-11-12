package herencia02;

public class Laptop extends Computador{

    protected int lote;

    public Laptop(String marca, String referencia, int precio, int lote) {
        super(marca, referencia, precio);
        this.lote = lote;
    }

    public String revisarLote(){
        return this.lote>200?"Produccion resiente":"Produccion pasada";
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Lote: "+this.lote+"\n"+"Segun su lote es: "+revisarLote();
    }
}

