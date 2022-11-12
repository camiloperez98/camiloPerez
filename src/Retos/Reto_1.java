package Retos;

public class Reto_1 {

    private String empresaTelefonica="HI";
    private double saldo=0;
    private String numeroTelefono;
    private boolean celularApagado=true;
    private boolean modoAvionActivado=true;
    private boolean datosActivados=true;
    private int saldoDatos=0;

    public Reto_1(){
    }

    public Reto_1(String empresaTelefonica, double saldo, String numeroTelefono, boolean celularApagado, boolean modoAvionActivado, boolean datosActivados, int saldoDatos) {
        this.empresaTelefonica = empresaTelefonica;
        this.saldo = saldo;
        this.numeroTelefono = numeroTelefono;
        this.celularApagado = celularApagado;
        this.modoAvionActivado = modoAvionActivado;
        this.datosActivados = datosActivados;
        this.saldoDatos = saldoDatos;
    }

    public String getEmpresaTelefonica() {
        return empresaTelefonica;
    }

    public void setEmpresaTelefonica(String empresaTelefonica) {
        this.empresaTelefonica = empresaTelefonica;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public boolean isCelularApagado() {
        return celularApagado;
    }

    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }

    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public boolean isDatosActivados() {
        return datosActivados;
    }

    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }

    public int getSaldoDatos() {
        return saldoDatos;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

    @Override
    public String toString() {
        return "Reto_1{" +
                "empresaTelefonica='" + empresaTelefonica + '\'' +
                ", saldo=" + saldo +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", celularApagado=" + celularApagado +
                ", modoAvionActivado=" + modoAvionActivado +
                ", datosActivados=" + datosActivados +
                ", saldoDatos=" + saldoDatos +
                '}';
    }

    public void comprarDatos(int c){
        double diferencia=0;
        double excedente=0;
        if (c<=10){
            this.saldo=saldo-(c*3000);
        }
        else if (c>30) {
            diferencia=10*3000;
            excedente=+c-10;
            this.saldo=saldo-(excedente*2500)+diferencia;
        }
        else {
            diferencia=20*3000;
            excedente=+c-20;
            this.saldo=saldo-(excedente*1500)+diferencia;
        }
    }

    public void consumirDatos(int s){

    }






    }

