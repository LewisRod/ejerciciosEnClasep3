package ejerciciosEnClasep3.EjerciciosTema6y7;

    public class CuentaBancaria {

    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(double saldo, String numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double depositar(double monto) {
    saldo += monto;
    return saldo;
}

public double retirar(double monto) {
    saldo -= monto;
    return saldo;
}

    public double getSaldo() {
        return saldo;
    }
}

