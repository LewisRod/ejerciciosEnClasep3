package ejerciciosEnClasep3.EjerciciosTema6y7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n MENU PRINCIPAL ");
            System.out.println("1. Cuenta Bancaria");
            System.out.println("2. Polimorfismo con Empleados");
            System.out.println("3. Ocultamiento de Atributos");
            System.out.println("4. Arrays y Referencias");
            System.out.println("5. Figuras geometricas");
            System.out.println("6. Gestion de productos");
            System.out.println("7. Inventario con arrays");
            System.out.println("8. Copia de arrays");
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
                case 5:
                    ejercicioFigurasGeometricas();
                    break;
                case 6:
                    gestionProductos();
                    break;
                case 7:
                    inventario();
                    break;
                case 8:
                    copiaArray();
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

        int[] array1 = { 1, 2, 3, 4, 5 };
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
         * El atributo x no es polimorfico.
         * por que se accede segun el tipo
         * de la referencia de A y no B.
         */
    }

    public static void ejercicioFigurasGeometricas() {
        Figura[] figura = new Figura[3];

        figura[0] = new Cuadrado(2);
        figura[1] = new Circulo(5, 3.14);
        figura[2] = new Rectangulo(2, 3);

        for (int i = 0; i < figura.length; i++) {
            figura[i].mostrarArea();
        }
    }

    public static void gestionProductos() {
        Producto producto = new Producto("Lavadora", 15000, 2);
        producto.vender(1);
    }

    public static void inventario() {
        Producto[] producto = new Producto[3];
        double valorTotal = 0;

        producto[0] = new Producto("Televicion", 11500, 0);
        producto[1] = new Producto("Comedor", 24000, 10);
        producto[2] = new Producto("Microondas", 3000, 12);

        for (int i = 0; i < producto.length; i++) {
            valorTotal += producto[i].getPrecio() * producto[i].getStock();
        }
        for (int i = 0; i < producto.length; i++) {
            if (producto[i].getStock() > 0) {
                System.out.println(producto[i]);
            }
        }
        System.out.println("\nEl valor total inventario: " + valorTotal);
    }

    public static void copiaArray() {
        int[] array = { 3, 1, 4, 5 };

        int[] array2 = array.clone();
        array2[1] = 15;

        System.out.print("Primer array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nLa copia");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array2[i] + " ");
        }

        /*
        La diferencia entre copia superficial y copia profunda es:
         
        La copia profunda ocurre con array de tipo de datos primitivos
        entonces al implementar el metodo clone se duplican los valores
        pero no las referencias por eso, cuando se modifica el array copiado,
        el array original no se ve afectado.

        Entonces cuando el arrys es de objeto si ocurre copia superficial
        porque se copian las referencias
        
        */
    }
}
