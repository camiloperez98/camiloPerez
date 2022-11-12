package herencia02;

public class MainCompLapSmart {
    public static void main(String[] args) {

        Laptop laptop=new Laptop("assus","H4e",1200000,140);

        SmartPhone smartPhone=new SmartPhone("iphone","8plus",1080000,"tigo");

        System.out.println("LAPTOP"+"\n"+laptop.toString());
        System.out.println("");
        System.out.println("SMARTPHONE"+"\n"+smartPhone.toString());
    }
}
