package ejerciciosEnClasep3.EjerciciosTema6y7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Cuenta Bancaria");
            System.out.println("2. Polimorfismo con Empleados");
            System.out.println("3. Ocultamiento de Atributos");
            System.out.println("4. Arrays y Referencias");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicioCuentaBancaria();
                    break;
                case 2:
                    ejercicioPolimorfismo();
                    break;
                case 3:
                    ejercicioOcultamiento();
                    break;
                case 4:
                    ejercicioArraysReferencias();
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 0);
    }


    public static void ejercicioArraysReferencias() {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = array1;

        array2[0] = 99;

        System.out.print("Contenido de array1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

    public static void ejercicioCuentaBancaria() {
    CuentaBancaria cuenta = new CuentaBancaria(1000, "001-A");
    cuenta.depositar(500);
    cuenta.retirar(200);
    System.out.println("Saldo final: " + cuenta.getSaldo());
}

public static void ejercicioPolimorfismo() {
    Empleado empleado;

    empleado = new EmpleadoFijo("Ana", 25000);
    empleado.calcularSalario();

    empleado = new EmpleadoPorHora("Luis", 160, 150);
    empleado.calcularSalario();
}

public static void ejercicioOcultamiento() {
    A obj = new B();
    System.out.println("valor x: " + obj.x);

    /*
     El atributo x no es polimorfico.
     por que se accede segun el tipo de la referencia de A
     y no B.
     */
}

}






