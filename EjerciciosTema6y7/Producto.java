package ejerciciosEnClasep3.EjerciciosTema6y7;

public class Producto {
    // atributos
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;

        // Validaciones
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }

        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    // setters y getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
public String toString() {
    return 
           "nombre= " + nombre +
           " precio = " + precio +
           " stock = " + stock;
}


    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("venta exitosa");
        }
        else {
            System.out.println("no se pudo realizar la venta");
        }
    }
}

