package herencia01;

import java.util.Scanner;

public class MainPer_est {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Scanner sn=new Scanner(System.in);

        Estudiante estudiante=new Estudiante();

        System.out.println("Nombre del estudiante: ");
        estudiante.setNombre(sc.nextLine());
        System.out.println("Direccion: ");
        estudiante.setDireccion(sc.nextLine());
        System.out.println("Numero de telefono: ");
        estudiante.setNumeroTelefono(sc.nextLine());
        System.out.println("Correo electronico : ");
        estudiante.setCorreoElectrico(sc.nextLine());
        System.out.println("Estado: ");
        estudiante.setEstado(sn.nextInt());

        System.out.println("ESTUDIANTE "+"\n"+estudiante.toString());
        System.out.println("-------------------------------------");

        Empleado empleado=new Empleado();

        System.out.println("Nombre del empleado: ");
        empleado.setNombre(sc.nextLine());
        System.out.println("Direccion: ");
        empleado.setDireccion(sc.nextLine());
        System.out.println("Numero de telefono: ");
        empleado.setNumeroTelefono(sc.nextLine());
        System.out.println("Correo electronico: ");
        empleado.setCorreoElectrico(sc.nextLine());
        System.out.println("Departamento en el que labora: ");
        empleado.setDepartamento(sc.nextLine());
        System.out.println("Salario: ");
        empleado.setSalario(sn.nextInt());
        System.out.println("Fecha de contratacion: ");
        empleado.setFechaContratacion(sc.nextLine());

        System.out.println("EMPLEADO "+"\n"+empleado.toString());
    }
}
